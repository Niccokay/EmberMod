package net.nic.em.aid.util;

import net.minecraftforge.eventbus.api.IEventBus;
import net.nic.em.block.rotatedaxisblock.rabLog;
import net.nic.em.block.rotatedaxisblock.rabStrippedLogs;
import net.nic.em.block.rotatedaxisblock.rabStrippedWoods;
import net.nic.em.block.rotatedaxisblock.rabWoods;
import net.nic.em.block.slab.slabColoredPlanks;
import net.nic.em.block.solid.planksColored;
import net.nic.em.block.stairs.StairsColoredStairs;
import net.nic.em.items.genItems;
import net.nic.em.items.priorityGenItems;

public class regList {
    public static void priority(IEventBus eventBus) {
        // priority Registration (aid functions/arrays)

        // Items called on in registration
        priorityGenItems.register(eventBus);

        // Blocks that must be registered first to be called on by others
        rabStrippedLogs.register(eventBus);
        rabStrippedWoods.register(eventBus);
    }
    public static void List(IEventBus eventBus) {
        // Items
        genItems.register(eventBus);

        // General Blocks
        planksColored.register(eventBus);

        // Rotated Axis Blocks (Logs)
        rabLog.register(eventBus);
        rabWoods.register(eventBus);

        // Slabs
        slabColoredPlanks.register(eventBus);

        // Stairs
        StairsColoredStairs.register(eventBus);
    }
}
