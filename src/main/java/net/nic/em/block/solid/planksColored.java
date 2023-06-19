package net.nic.em.block.solid;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static net.nic.em.EmberMod.MODID;

public class planksColored {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Block> BLACK_PLANKS = register("black_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> BLUE_PLANKS = register("blue_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> BROWN_PLANKS = register("brown_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> CYAN_PLANKS = register("cyan_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> GRAY_PLANKS = register("gray_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> GREEN_PLANKS = register("green_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> LIGHT_BLUE_PLANKS = register("light_blue_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> LIGHT_GRAY_PLANKS = register("light_gray_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> LIME_PLANKS = register("lime_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> MAGENTA_PLANKS = register("magenta_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> ORANGE_PLANKS = register("orange_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> PINK_PLANKS = register("pink_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> PURPLE_PLANKS = register("purple_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> RED_PLANKS = register("red_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> WHITE_PLANKS = register("white_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> YELLOW_PLANKS = register("yellow_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return 300;
            }
        });
        return exit;
    }
}


// La Creazione di un blocco normale (sostituisci "X" con un numero scelto da te che ritieni più appropriato per quella funzione )
//public static final RegistryObject<Block> ID_DEL_BLOCCO (Maiuscolo) = registerBlock("id_del_blocco (minuscolo)",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLOCCO ESEMPIO DA MINECRAFT VANILLA)
//                    .strength(Xf)                     -> (Durezza del blocco/Hardness -> .strenght della stone = 1.5 il numero va accompagnato sempre da f in blockbehaviour)
//                    .requiresCorrectToolForDrops()    -> (se non usi lo strumento adatto non droppa niente)
//                    .sound(SoundType.DEEPSLATE)       -> (suono che deve avere il blocco quando viene piazzato/spaccato/etc, fa riferimento a un blocco normale di minecraft)
//                    .instabreak()                     -> (fa spaccare il blocco immediatamente, come slime, puoi usare o questo oppure .strenght(0.0f) non usare tutti e due perchè risulta inutile)
//                    .friction(Xf)                   -> (velocità di cammino sul blocco normalmente è 0.6)
//                    .explosionResistance(Xf)         -> (resistenza dalle esplosioni)
//                    ));
