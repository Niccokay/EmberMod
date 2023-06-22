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

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static net.nic.em.EmberMod.MODID;

public class rabStrippedWoods {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // public static final RegistryObject<RotatedPillarBlock> COLOR_STRIPPED_WOOD = register("color_stripped_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 1000);
    public static final RegistryObject<Block> STRIPPED_BLACK_WOOD = register("stripped_black_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_BLUE_WOOD = register("stripped_blue_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_BROWN_WOOD = register("stripped_brown_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_CYAN_WOOD = register("stripped_cyan_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_GRAY_WOOD = register("stripped_gray_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_GREEN_WOOD = register("stripped_green_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_LIGHT_BLUE_WOOD = register("stripped_light_blue_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_LIGHT_GRAY_WOOD = register("stripped_light_gray_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_LIME_WOOD = register("stripped_lime_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_MAGENTA_WOOD = register("stripped_magenta_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_ORANGE_WOOD = register("stripped_orange_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_PINK_WOOD = register("stripped_pink_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_PURPLE_WOOD = register("stripped_purple_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_RED_WOOD = register("stripped_red_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_WHITE_WOOD = register("stripped_white_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);
    public static final RegistryObject<Block> STRIPPED_YELLOW_WOOD = register("stripped_yellow_wood", () -> new modAxisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava(), null), 300);

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
