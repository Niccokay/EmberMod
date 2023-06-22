package net.nic.em.block.rotatedaxisblock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.aid.block.modAxisBlock;
import net.nic.em.block.rotatedaxisblock.rabStrippedLogs;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;
import static net.nic.em.EmberMod.MODID;

public class rabLog {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // public static final RegistryObject<RotatedPillarBlock> COLOR_LOG = register("color_log", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), COLOR_STRIPPED_LOG.get().defaultBlockState()), 300);


    public static final RegistryObject<Block> BLACK_LOG = register("black_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_BLACK_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> BLUE_LOG = register("blue_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_BLUE_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> BROWN_LOG = register("brown_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_BROWN_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> CYAN_LOG = register("cyan_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_CYAN_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> GRAY_LOG = register("gray_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_GRAY_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> GREEN_LOG = register("green_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_GREEN_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> LIGHT_BLUE_LOG = register("light_blue_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_LIGHT_BLUE_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> LIGHT_GRAY_LOG = register("light_gray_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_LIGHT_GRAY_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> LIME_LOG = register("lime_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_LIME_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> MAGENTA_LOG = register("magenta_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_MAGENTA_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> ORANGE_LOG = register("orange_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_ORANGE_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> PINK_LOG = register("pink_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_PINK_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> PURPLE_LOG = register("purple_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_PURPLE_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> RED_LOG = register("red_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_RED_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> WHITE_LOG = register("white_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_WHITE_LOG.get().defaultBlockState()), 300);
    public static final RegistryObject<Block> YELLOW_LOG = register("yellow_log",() -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), rabStrippedLogs.STRIPPED_YELLOW_LOG.get().defaultBlockState()), 300);


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
