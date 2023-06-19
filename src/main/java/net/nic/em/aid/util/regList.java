package net.nic.em.aid.util;

import net.minecraftforge.eventbus.api.IEventBus;
import net.nic.em.block.solid.planksColored;
import net.nic.em.items.genItems;

public class regList {
    public static void priority(IEventBus eventBus) {

    }
    public static void List(IEventBus eventBus) {
        // Items
        // genItems.register(eventBus);

        // General Blocks
        planksColored.register(eventBus);

        // Slabs
    }
}
