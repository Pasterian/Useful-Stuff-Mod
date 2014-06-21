package com.pasterian.usefulstuffmod.blocks.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class UMFluids {

	public static Fluid enderWater = new Fluid("enderWater").setLuminosity(6).setViscosity(2000);
	
	public static void init() {
		
		FluidRegistry.registerFluid(enderWater);
		
	}
}
