package net.nic.em;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.block.ModBlocks;
import net.nic.em.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EmberMod.MODID)
public class EmberMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "embermod";
    // Directly reference a slf4j logger


    public EmberMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        ModBlocks.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ModItems.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            //Oggetti della mod che sono ingredienti vanno qui cosi appariranno nella tab della creativa "INGREDIENTS"
            //event.accept(ModItems.ID_DEL_ITEM) (se è un item)
            //event.accept()ModBlocks.ID_DEL_BLOCCO) (se è un blocco dio cane)

        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

        }
        if(event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {

        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {

        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

        }
        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

        }
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

        }
        if(event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
        }
    }
}
