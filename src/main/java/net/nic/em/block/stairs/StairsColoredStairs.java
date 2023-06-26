package net.nic.em.block.stairs;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.block.solid.planksColored;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;
import static net.nic.em.EmberMod.MODID;

public class StairsColoredStairs {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Supplier Updated - Examples below for modded blocks
    // () - > BLOCK.get().defaultBlockState && BLOCK.get()::defaultBlockState
    // BLOCK::defaultBlockState  {for Blocks already in MC}
    public static final RegistryObject<StairBlock> BLACK_PLANK_STAIRS = register("black_stairs", () -> new StairBlock(planksColored.BLACK_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> BLUE_PLANK_STAIRS = register("blue_stairs", () -> new StairBlock(planksColored.BLUE_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> BROWN_PLANK_STAIRS = register("brown_stairs", () -> new StairBlock(planksColored.BROWN_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> CYAN_PLANK_STAIRS = register("cyan_stairs", () -> new StairBlock(planksColored.CYAN_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> GRAY_PLANK_STAIRS = register("gray_stairs", () -> new StairBlock(planksColored.GRAY_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> GREEN_PLANK_STAIRS = register("green_stairs", () -> new StairBlock(planksColored.GREEN_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_PLANK_STAIRS = register("light_blue_stairs", () -> new StairBlock(planksColored.LIGHT_BLUE_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_PLANK_STAIRS = register("light_gray_stairs", () -> new StairBlock(planksColored.LIGHT_GRAY_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> LIME_PLANK_STAIRS = register("lime_stairs", () -> new StairBlock(planksColored.LIME_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> MAGENTA_PLANK_STAIRS = register("magenta_stairs", () -> new StairBlock(planksColored.MAGENTA_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> ORANGE_PLANK_STAIRS = register("orange_stairs", () -> new StairBlock(planksColored.ORANGE_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> PINK_PLANK_STAIRS = register("pink_stairs", () -> new StairBlock(planksColored.PINK_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> PURPLE_PLANK_STAIRS = register("purple_stairs", () -> new StairBlock(planksColored.PURPLE_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> RED_PLANK_STAIRS = register("red_stairs", () -> new StairBlock(planksColored.RED_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> WHITE_PLANK_STAIRS = register("white_stairs", () -> new StairBlock(planksColored.WHITE_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> YELLOW_PLANK_STAIRS = register("yellow_stairs", () -> new StairBlock(planksColored.YELLOW_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return 150;
            }
        });
        return exit;
    }
}
