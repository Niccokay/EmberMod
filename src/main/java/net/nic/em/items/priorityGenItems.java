package net.nic.em.items;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.EmberMod;
import net.nic.em.aid.item.modWoodenBucket;

public class priorityGenItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmberMod.MODID);


    // Example: public static final RegistryObject<Item> ITEM = ITEMS.register("item_id", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_BUCKET = ITEMS.register("wooden_bucket",
            () -> new modWoodenBucket(Fluids.EMPTY, new BucketItem.Properties().stacksTo(1), null));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}