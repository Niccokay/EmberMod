package net.nic.em.block.slab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;
import static net.nic.em.EmberMod.MODID;

public class slabColoredPlanks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<SlabBlock> BLACK_PLANK_SLAB = register("black_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> BLUE_PLANK_SLAB = register("blue_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> BROWN_PLANK_SLAB = register("brown_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> CYAN_PLANK_SLAB = register("cyan_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> GRAY_PLANK_SLAB = register("gray_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> GREEN_PLANK_SLAB = register("green_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_PLANK_SLAB = register("light_blue_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_PLANK_SLAB = register("light_gray_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> LIME_PLANK_SLAB = register("lime_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> MAGENTA_PLANK_SLAB = register("magenta_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> ORANGE_PLANK_SLAB = register("orange_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> PINK_PLANK_SLAB = register("pink_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> PURPLE_PLANK_SLAB = register("purple_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> RED_PLANK_SLAB = register("red_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> WHITE_PLANK_SLAB = register("white_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> YELLOW_PLANK_SLAB = register("yellow_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD)));

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
