package net.nic.em;

import net.minecraft.world.item.CreativeModeTabs;
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
import net.nic.em.block.rotatedaxisblock.rabLog;
import net.nic.em.block.rotatedaxisblock.rabStrippedWoods;
import net.nic.em.block.rotatedaxisblock.rabWoods;
import org.jetbrains.annotations.NotNull;

import static net.nic.em.aid.util.emberCreativeTabs.*;
import static net.nic.em.aid.util.regList.List;
import static net.nic.em.aid.util.regList.priority;

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
        priority(modEventBus);
        List(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        // Register the item to a creative tab
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(@NotNull BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == EMBER_BLOCK.getKey()) { getFullBlockList().forEach(event::accept); }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { getBuildingBlockList().forEach(event::accept); }

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
