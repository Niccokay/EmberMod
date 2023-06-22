package net.nic.em.block.rotatedaxisblock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.aid.block.modAxisBlock;
import net.nic.em.block.rotatedaxisblock.rabStrippedWoods.*;
import javax.annotation.Nullable;
import java.util.function.Supplier;

import static net.nic.em.EmberMod.MODID;


public class rabWoods {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // public static final RegistryObject<RotatedPillarBlock> COLOR_WOOD = register("color_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), COLOR_STRIPPED_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> BLACK_WOOD = register("black_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_BLACK_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> BLUE_WOOD = register("blue_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_BLUE_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> BROWN_WOOD = register("brown_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_BROWN_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> CYAN_WOOD = register("cyan_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_CYAN_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> GRAY_WOOD = register("gray_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_GRAY_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> GREEN_WOOD = register("green_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_GREEN_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> LIGHT_BLUE_WOOD = register("light_blue_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_LIGHT_BLUE_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> LIGHT_GRAY_WOOD = register("light_gray_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_LIGHT_GRAY_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> LIME_WOOD = register("lime_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_LIME_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> MAGENTA_WOOD = register("magenta_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_MAGENTA_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> ORANGE_WOOD = register("orange_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_ORANGE_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> PINK_WOOD = register("pink_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_PINK_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> PURPLE_WOOD = register("purple_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_PURPLE_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> RED_WOOD = register("red_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_RED_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> WHITE_WOOD = register("white_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_WHITE_WOOD.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> YELLOW_WOOD = register("yellow_wood",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedWoods.STRIPPED_YELLOW_WOOD.get().defaultBlockState()), 300);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
        return exit;
    }
}
