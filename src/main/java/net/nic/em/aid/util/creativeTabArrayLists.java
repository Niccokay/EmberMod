package net.nic.em.aid.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static net.nic.em.block.slab.slabColoredPlanks.*;
import static net.nic.em.block.solid.planksColored.*;
import static net.nic.em.block.rotatedaxisblock.rabLog.*;
import static net.nic.em.block.rotatedaxisblock.rabStrippedLogs.*;
import static net.nic.em.block.rotatedaxisblock.rabWoods.*;
import static net.nic.em.block.rotatedaxisblock.rabStrippedWoods.*;

public class creativeTabArrayLists {
    // Keep separate Pages for registrations in their own ArrayList with the correct Type in the RegistryObject.
    public static @NotNull ArrayList<RegistryObject<Block>> getColoredPlanks() {
        ArrayList<RegistryObject<Block>> out = new ArrayList<>();
        out.add(BLACK_PLANKS);
        out.add(BLUE_PLANKS);
        out.add(BROWN_PLANKS);
        out.add(CYAN_PLANKS);
        out.add(GRAY_PLANKS);
        out.add(GREEN_PLANKS);
        out.add(LIGHT_BLUE_PLANKS);
        out.add(LIGHT_GRAY_PLANKS);
        out.add(LIME_PLANKS);
        out.add(MAGENTA_PLANKS);
        out.add(ORANGE_PLANKS);
        out.add(PINK_PLANKS);
        out.add(PURPLE_PLANKS);
        out.add(RED_PLANKS);
        out.add(WHITE_PLANKS);
        out.add(YELLOW_PLANKS);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<RotatedPillarBlock>> getStrippedColoredWood() {
        ArrayList<RegistryObject<RotatedPillarBlock>> out = new ArrayList<>();
        out.add(STRIPPED_BLACK_WOOD);
        out.add(STRIPPED_BLUE_WOOD);
        out.add(STRIPPED_BROWN_WOOD);
        out.add(STRIPPED_CYAN_WOOD);
        out.add(STRIPPED_GRAY_WOOD);
        out.add(STRIPPED_GREEN_WOOD);
        out.add(STRIPPED_LIGHT_BLUE_WOOD);
        out.add(STRIPPED_LIGHT_GRAY_WOOD);
        out.add(STRIPPED_LIME_WOOD);
        out.add(STRIPPED_MAGENTA_WOOD);
        out.add(STRIPPED_ORANGE_WOOD);
        out.add(STRIPPED_PINK_WOOD);
        out.add(STRIPPED_PURPLE_WOOD);
        out.add(STRIPPED_RED_WOOD);
        out.add(STRIPPED_WHITE_WOOD);
        out.add(STRIPPED_YELLOW_WOOD);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<RotatedPillarBlock>> getColoredWood() {
        ArrayList<RegistryObject<RotatedPillarBlock>> out = new ArrayList<>();
        out.add(BLACK_WOOD);
        out.add(BLUE_WOOD);
        out.add(BROWN_WOOD);
        out.add(CYAN_WOOD);
        out.add(GRAY_WOOD);
        out.add(GREEN_WOOD);
        out.add(LIGHT_BLUE_WOOD);
        out.add(LIGHT_GRAY_WOOD);
        out.add(LIME_WOOD);
        out.add(MAGENTA_WOOD);
        out.add(ORANGE_WOOD);
        out.add(PINK_WOOD);
        out.add(PURPLE_WOOD);
        out.add(RED_WOOD);
        out.add(WHITE_WOOD);
        out.add(YELLOW_WOOD);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<RotatedPillarBlock>> getStrippedColoredLogs() {
        ArrayList<RegistryObject<RotatedPillarBlock>> out = new ArrayList<>();
        out.add(STRIPPED_BLACK_LOG);
        out.add(STRIPPED_BLUE_LOG);
        out.add(STRIPPED_BROWN_LOG);
        out.add(STRIPPED_CYAN_LOG);
        out.add(STRIPPED_GRAY_LOG);
        out.add(STRIPPED_GREEN_LOG);
        out.add(STRIPPED_LIGHT_BLUE_LOG);
        out.add(STRIPPED_LIGHT_GRAY_LOG);
        out.add(STRIPPED_LIME_LOG);
        out.add(STRIPPED_MAGENTA_LOG);
        out.add(STRIPPED_ORANGE_LOG);
        out.add(STRIPPED_PINK_LOG);
        out.add(STRIPPED_PURPLE_LOG);
        out.add(STRIPPED_RED_LOG);
        out.add(STRIPPED_WHITE_LOG);
        out.add(STRIPPED_YELLOW_LOG);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<RotatedPillarBlock>> getColoredLogs() {
        ArrayList<RegistryObject<RotatedPillarBlock>> out = new ArrayList<>();
        out.add(BLACK_LOG);
        out.add(BLUE_LOG);
        out.add(BROWN_LOG);
        out.add(CYAN_LOG);
        out.add(GRAY_LOG);
        out.add(GREEN_LOG);
        out.add(LIGHT_BLUE_LOG);
        out.add(LIGHT_GRAY_LOG);
        out.add(LIME_LOG);
        out.add(MAGENTA_LOG);
        out.add(ORANGE_LOG);
        out.add(PINK_LOG);
        out.add(PURPLE_LOG);
        out.add(RED_LOG);
        out.add(WHITE_LOG);
        out.add(YELLOW_LOG);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> getColoredPlankSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(BLACK_PLANK_SLAB);
        out.add(BLUE_PLANK_SLAB);
        out.add(BROWN_PLANK_SLAB);
        out.add(CYAN_PLANK_SLAB);
        out.add(GRAY_PLANK_SLAB);
        out.add(GREEN_PLANK_SLAB);
        out.add(LIGHT_BLUE_PLANK_SLAB);
        out.add(LIGHT_GRAY_PLANK_SLAB);
        out.add(LIME_PLANK_SLAB);
        out.add(MAGENTA_PLANK_SLAB);
        out.add(ORANGE_PLANK_SLAB);
        out.add(PINK_PLANK_SLAB);
        out.add(PURPLE_PLANK_SLAB);
        out.add(RED_PLANK_SLAB);
        out.add(WHITE_PLANK_SLAB);
        out.add(YELLOW_PLANK_SLAB);
        return out;
    }
    // Used to call for primary registering to the Building Blocks Creative Tab
    // More will be used if the diversity of items & uses expands.
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getBuildingBlocks() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.addAll(getColoredWood());
        out.addAll(getStrippedColoredWood());
        out.addAll(getColoredLogs());
        out.addAll(getStrippedColoredLogs());
        out.addAll(getColoredPlanks());
        out.addAll(getColoredPlankSlabs());
        return out;
    }
    // Used as complete list for all blocks, used for registering in mods Creative Tab menu
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getAllBlocks() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.addAll(getBuildingBlocks());
        return out;
    }

}
