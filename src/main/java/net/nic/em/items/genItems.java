package net.nic.em.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.nic.em.EmberMod;

public class genItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmberMod.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
