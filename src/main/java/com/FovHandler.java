package com.yourname.fovdisabler;

import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FovHandler {

    @SubscribeEvent
    public void onFOVUpdate(FOVUpdateEvent event) {
        // Set FOV multiplier to 1.0 (no dynamic changes)
        event.newfov = 1.0F;
    }
}