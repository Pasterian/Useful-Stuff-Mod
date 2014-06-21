package com.pasterian.usefulstuffmod;

import com.pasterian.usefulstuffmod.blocks.fluids.UMFluids;
import com.pasterian.usefulstuffmod.items.UMItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = UsefulStuffMod.MODID, version = UsefulStuffMod.VERSION)
public class UsefulStuffMod {

	public static UsefulStuffMod INSTANCE;
	
	public static final String MODID = "UsefulStuffMod";
	public static final String VERSION = "Pre Alpha 1.7.2-1.0";

	@EventHandler
	public void init(FMLPreInitializationEvent event) {

		UMBlocks.init();
		UMRecipes.init();
		UMItems.init();
		UMFluids.init();
		
	}
	
	@EventHandler
		public void init(FMLInitializationEvent event) {

		}
}
