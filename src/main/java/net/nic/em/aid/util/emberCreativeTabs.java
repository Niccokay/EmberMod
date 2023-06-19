package net.nic.em.aid.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static net.nic.em.EmberMod.MODID;
import static net.nic.em.aid.util.creativeTabArrayLists.getColoredPlankSlabs;
import static net.nic.em.aid.util.creativeTabArrayLists.getColoredPlanks;
import static net.nic.em.block.solid.planksColored.BLACK_PLANKS;

public class emberCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final RegistryObject<CreativeModeTab> EMBER_BLOCK = CREATIVE_MODE_TABS.register("ember_blocks", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(BLACK_PLANKS.get()))
            .title(Component.translatable("itemGroup.ember_blocks"))
            .build());


    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getBuildingBlockList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(getColoredPlanks());
        out.addAll(getColoredPlankSlabs());
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getFullBlockList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(getBuildingBlockList());
        return out;
    }
}
