package net.nic.em.items;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.EmberMod;
import net.nic.em.aid.item.modMilkBucket;
import net.nic.em.aid.item.modWoodenBucket;

import static net.nic.em.items.priorityGenItems.WOODEN_BUCKET;

public class genItems {
    public static final DeferredRegister<Item> PRIORITY_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmberMod.MODID);

    public static final RegistryObject<Item> WOODEN_WATER_BUCKET = PRIORITY_ITEMS.register("wooden_water_bucket",
            () -> new modWoodenBucket(Fluids.WATER, new BucketItem.Properties().craftRemainder(WOODEN_BUCKET.get()).stacksTo(1), WOODEN_BUCKET.get()));
    public static final RegistryObject<Item> WOODEN_MILK_BUCKET = PRIORITY_ITEMS.register("wooden_milk_bucket",
            () -> new modMilkBucket(new BucketItem.Properties().craftRemainder(WOODEN_BUCKET.get()).stacksTo(1), WOODEN_BUCKET.get()));

    public static void register(IEventBus eventBus) { PRIORITY_ITEMS.register(eventBus); }
}
