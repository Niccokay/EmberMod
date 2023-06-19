package net.nic.em.aid.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static net.nic.em.block.slab.slabColoredPlanks.*;
import static net.nic.em.block.solid.planksColored.*;

public class creativeTabArrayLists {
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

}
