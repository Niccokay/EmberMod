package net.nic.em.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.EmberMod;
import net.nic.em.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EmberMod.MODID);


    ////
    public static final RegistryObject<Block> BLACK_PLANKS = registerBlock("black_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> BLUE_PLANKS = registerBlock("blue_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> BROWN_PLANKS = registerBlock("brown_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> CYAN_PLANKS = registerBlock("cyan_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> GRAY_PLANKS = registerBlock("gray_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> GREEN_PLANKS = registerBlock("green_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> LIME_PLANKS = registerBlock("lime_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> MAGENTA_PLANKS = registerBlock("magenta_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> ORANGE_PLANKS = registerBlock("orange_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> PINK_PLANKS = registerBlock("pink_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> PURPLE_PLANKS = registerBlock("purple_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> RED_PLANKS = registerBlock("red_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> WHITE_PLANKS = registerBlock("white_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));
    public static final RegistryObject<Block> YELLOW_PLANKS = registerBlock("yellow_planks", ()-> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS).strength(2f)));

    ///

    private static<T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
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


