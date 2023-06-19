package net.nic.em.aid.util;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static net.nic.em.block.solid.planksColored.*;

public class creativeTabArrayLists {
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getColoredPlanks() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
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
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getColoredPlankSlabs() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();

        return out;
    }

}
