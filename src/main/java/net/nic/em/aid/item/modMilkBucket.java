package net.nic.em.aid.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class modMilkBucket extends MilkBucketItem {
    private final Item bucket;
    public modMilkBucket(Properties p_42921_, Item Empty) {
        super(p_42921_);
        this.bucket = Empty;
    }
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack p_42923_, @NotNull Level p_42924_, @NotNull LivingEntity p_42925_) {
        if (!p_42924_.isClientSide) p_42925_.curePotionEffects(p_42923_); // FORGE - move up so stack.shrink does not turn stack into air
        if (p_42925_ instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, p_42923_);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (p_42925_ instanceof Player && !((Player)p_42925_).getAbilities().instabuild) {
            p_42923_.shrink(1);
        }

        return p_42923_.isEmpty() ? new ItemStack(this.bucket) : p_42923_;
    }
}
