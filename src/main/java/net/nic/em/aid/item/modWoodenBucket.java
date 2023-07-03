package net.nic.em.aid.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

import static net.nic.em.items.genItems.WOODEN_MILK_BUCKET;
import static net.nic.em.items.genItems.WOODEN_WATER_BUCKET;

public class modWoodenBucket extends BucketItem {
    private final Fluid content;
    private final Item bucket;
    public modWoodenBucket(Fluid fluid, Properties p_41383_, Item empty_bucket) {
        super(() -> fluid, p_41383_);
        this.content = fluid;
        this.fluidSupplier = net.minecraftforge.registries.ForgeRegistries.FLUIDS.getDelegateOrThrow(fluid);
        this.bucket = empty_bucket;
    }
    public @NotNull InteractionResult interactLivingEntity(@NotNull ItemStack pStack, @NotNull Player pPlayer, @NotNull LivingEntity pInteractionTarget, @NotNull InteractionHand pUsedHand) {
        if (this.content == Fluids.EMPTY) {
            if (pInteractionTarget instanceof Cow) {
                pPlayer.playSound(SoundEvents.COW_MILK, 1.0F, 1.0F);
                ItemStack itemstack1 = new ItemStack(WOODEN_MILK_BUCKET.get());
                pPlayer.setItemInHand(pUsedHand, itemstack1);
                return InteractionResult.sidedSuccess(pPlayer.level().isClientSide);
            }
        }
        return InteractionResult.PASS;
    }

    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level p_40703_, @NotNull Player p_40704_, @NotNull InteractionHand p_40705_) {
        ItemStack itemstack = p_40704_.getItemInHand(p_40705_);
        BlockHitResult blockhitresult = getPlayerPOVHitResult(p_40703_, p_40704_, this.content == Fluids.EMPTY ? ClipContext.Fluid.SOURCE_ONLY : ClipContext.Fluid.NONE);
        InteractionResultHolder<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(p_40704_, p_40703_, itemstack, blockhitresult);
        if (ret != null) return ret;
        if (blockhitresult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(itemstack);
        } else if (blockhitresult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(itemstack);
        } else {
            BlockPos blockpos = blockhitresult.getBlockPos();
            Direction direction = blockhitresult.getDirection();
            BlockPos blockpos1 = blockpos.relative(direction);
            if (p_40703_.mayInteract(p_40704_, blockpos) && p_40704_.mayUseItemAt(blockpos1, direction, itemstack)) {
                if (this.content == Fluids.EMPTY) {
                    BlockState blockstate1 = p_40703_.getBlockState(blockpos);
                    if (blockstate1.getBlock() instanceof BucketPickup bucketpickup) {
                        ItemStack itemstack1 = bucketpickup.pickupBlock(p_40703_, blockpos, blockstate1);
                        if (!itemstack1.isEmpty()) {
                            p_40704_.awardStat(Stats.ITEM_USED.get(this));
                            bucketpickup.getPickupSound(blockstate1).ifPresent((p_150709_) -> p_40704_.playSound(p_150709_, 1.0F, 1.0F));
                            p_40703_.gameEvent(p_40704_, GameEvent.FLUID_PICKUP, blockpos);
                            if (blockstate1.getFluidState().is(Fluids.WATER)) {
                                ItemStack itemstack2 = ItemUtils.createFilledResult(itemstack, p_40704_, itemstack1);
                                if (!p_40703_.isClientSide) {
                                    CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayer) p_40704_, itemstack1);
                                }

                                return InteractionResultHolder.sidedSuccess(new ItemStack(WOODEN_WATER_BUCKET.get()), p_40703_.isClientSide());
                            }
                        }
                    }

                    return InteractionResultHolder.fail(itemstack);
                } else {
                    BlockState blockstate = p_40703_.getBlockState(blockpos);
                    BlockPos blockpos2 = canBlockContainFluid(p_40703_, blockpos, blockstate) ? blockpos : blockpos1;
                    if (this.emptyContents(p_40704_, p_40703_, blockpos2, blockhitresult, itemstack)) {
                        this.checkExtraContent(p_40704_, p_40703_, itemstack, blockpos2);
                        if (p_40704_ instanceof ServerPlayer) {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer)p_40704_, blockpos2, itemstack);
                        }

                        p_40704_.awardStat(Stats.ITEM_USED.get(this));
                        return InteractionResultHolder.sidedSuccess(getEmptySuccessItem(itemstack, p_40704_, this.bucket), p_40703_.isClientSide());
                    } else {
                        return InteractionResultHolder.fail(itemstack);
                    }
                }
            } else {
                return InteractionResultHolder.fail(itemstack);
            }
        }
    }

    public static ItemStack getEmptySuccessItem(@NotNull ItemStack p_40700_, @NotNull Player p_40701_, Item bucket) {
        return !p_40701_.getAbilities().instabuild ? new ItemStack(bucket) : p_40700_;
    }

    @Deprecated //Forge: use the ItemStack sensitive version
    public boolean emptyContents(@Nullable Player p_150716_, @NotNull Level p_150717_, @NotNull BlockPos p_150718_, @Nullable BlockHitResult p_150719_) {
        return this.emptyContents(p_150716_, p_150717_, p_150718_, p_150719_, null);
    }

    public boolean emptyContents(@Nullable Player p_150716_, @NotNull Level p_150717_, @NotNull BlockPos p_150718_, @Nullable BlockHitResult blockHitResult, @Nullable ItemStack container) {
        if (!(this.content instanceof FlowingFluid)) {
            return false;
        } else {
            BlockState blockstate = p_150717_.getBlockState(p_150718_);
            Block block = blockstate.getBlock();
            boolean flag = blockstate.canBeReplaced(this.content);
            boolean flag1 = blockstate.isAir() || flag || block instanceof LiquidBlockContainer && ((LiquidBlockContainer)block).canPlaceLiquid(p_150717_, p_150718_, blockstate, this.content);
            java.util.Optional<net.minecraftforge.fluids.FluidStack> containedFluidStack = java.util.Optional.ofNullable(container).flatMap(net.minecraftforge.fluids.FluidUtil::getFluidContained);
            if (!flag1) {
                return blockHitResult != null && this.emptyContents(p_150716_, p_150717_, blockHitResult.getBlockPos().relative(blockHitResult.getDirection()), null, container);
            } else if (containedFluidStack.isPresent() && this.content.getFluidType().isVaporizedOnPlacement(p_150717_, p_150718_, containedFluidStack.get())) {
                this.content.getFluidType().onVaporize(p_150716_, p_150717_, p_150718_, containedFluidStack.get());
                return true;
            } else if (p_150717_.dimensionType().ultraWarm() && this.content.is(FluidTags.WATER)) {
                int i = p_150718_.getX();
                int j = p_150718_.getY();
                int k = p_150718_.getZ();
                p_150717_.playSound(p_150716_, p_150718_, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 0.5F, 2.6F + (p_150717_.random.nextFloat() - p_150717_.random.nextFloat()) * 0.8F);

                for(int l = 0; l < 8; ++l) {
                    p_150717_.addParticle(ParticleTypes.LARGE_SMOKE, (double)i + Math.random(), (double)j + Math.random(), (double)k + Math.random(), 0.0D, 0.0D, 0.0D);
                }

                return true;
            } else if (block instanceof LiquidBlockContainer && ((LiquidBlockContainer)block).canPlaceLiquid(p_150717_,p_150718_,blockstate,content)) {
                ((LiquidBlockContainer)block).placeLiquid(p_150717_, p_150718_, blockstate, ((FlowingFluid)this.content).getSource(false));
                this.playEmptySound(p_150716_, p_150717_, p_150718_);
                return true;
            } else {
                if (!p_150717_.isClientSide && flag && !blockstate.liquid()) {
                    p_150717_.destroyBlock(p_150718_, true);
                }

                if (!p_150717_.setBlock(p_150718_, this.content.defaultFluidState().createLegacyBlock(), 11) && !blockstate.getFluidState().isSource()) {
                    return false;
                } else {
                    this.playEmptySound(p_150716_, p_150717_, p_150718_);
                    return true;
                }
            }
        }
    }

    protected void playEmptySound(@Nullable Player p_40696_, @NotNull LevelAccessor p_40697_, @NotNull BlockPos p_40698_) {
        SoundEvent soundevent = this.content.getFluidType().getSound(p_40696_, p_40697_, p_40698_, net.minecraftforge.common.SoundActions.BUCKET_EMPTY);
        if(soundevent == null) soundevent = this.content.is(FluidTags.LAVA) ? SoundEvents.BUCKET_EMPTY_LAVA : SoundEvents.BUCKET_EMPTY;
        p_40697_.playSound(p_40696_, p_40698_, soundevent, SoundSource.BLOCKS, 1.0F, 1.0F);
        p_40697_.gameEvent(p_40696_, GameEvent.FLUID_PLACE, p_40698_);
    }

    @Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(@NotNull ItemStack stack, @Nullable net.minecraft.nbt.CompoundTag nbt) {
        if (this.getClass() == modWoodenBucket.class)
            return new net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper(stack);
        else
            return super.initCapabilities(stack, nbt);
    }

    private final java.util.function.Supplier<? extends Fluid> fluidSupplier;
    public @NotNull Fluid getFluid() { return fluidSupplier.get(); }

    protected boolean canBlockContainFluid(@NotNull Level worldIn, @NotNull BlockPos posIn, BlockState blockstate)
    {
        return blockstate.getBlock() instanceof LiquidBlockContainer && ((LiquidBlockContainer)blockstate.getBlock()).canPlaceLiquid(worldIn, posIn, blockstate, this.content);
    }
}
