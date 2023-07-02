package net.nic.em.items;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nic.em.EmberMod;

import static net.minecraft.world.item.Items.registerItem;

public class genItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmberMod.MODID);


    // Example: public static final RegistryObject<Item> ITEM = ITEMS.register("item_id", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_BUCKET = ITEMS.register("wooden_bucket",
            () -> new BucketItem(Fluids.EMPTY, (new BucketItem.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> WOODEN_WATER_BUCKET = ITEMS.register("wooden_water_bucket",
            () -> new BucketItem(Fluids.WATER, (new BucketItem.Properties()).craftRemainder(genItems.WOODEN_BUCKET.get()).stacksTo(1)));
    public static final RegistryObject<Item> WOODEN_MILK_BUCKET = ITEMS.register("wooden_milk_bucket",
            () -> new MilkBucketItem(new BucketItem.Properties().craftRemainder(genItems.WOODEN_BUCKET.get()).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}