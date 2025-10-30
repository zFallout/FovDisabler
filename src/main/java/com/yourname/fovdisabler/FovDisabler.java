package com.yourname.fovdisabler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = FovDisabler.MODID, version = FovDisabler.VERSION, name = FovDisabler.NAME)
public class FovDisabler {
    public static final String MODID = "fovdisabler";
    public static final String VERSION = "1.0";
    public static final String NAME = "FOV Disabler";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new FovHandler());
        System.out.println("FOV Disabler loaded!");
    }
}