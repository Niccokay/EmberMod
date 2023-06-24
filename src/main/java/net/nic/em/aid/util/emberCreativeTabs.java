package net.nic.em.aid.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static net.nic.em.EmberMod.MODID;
import static net.nic.em.aid.util.creativeTabArrayLists.*;
import static net.nic.em.block.solid.planksColored.BLACK_PLANKS;

public class emberCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final RegistryObject<CreativeModeTab> EMBER_BLOCK = CREATIVE_MODE_TABS.register("ember_blocks", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(BLACK_PLANKS.get()))
            .title(Component.translatable("itemGroup.ember_blocks"))
            .build());


    // The following two are used to call the item side of the registered Blocks, and even merge Item & Block RegistryObjects into one.
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getBuildingBlockAsItemsList() {
        return new ArrayList<>(getBuildingBlocks());
    }
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getFullBlockAsItemsList() {
        return new ArrayList<>(getAllBlocks());
    }
}
