//package com.pasterian.usefulstuffmod.blocks.fluids;
//
//import net.minecraftforge.fluids.Fluid;
//import net.minecraftforge.fluids.FluidRegistry;
//
//import com.pasterian.usefulstuffmod.UMBlocks;
//import com.pasterian.usefulstuffmod.UsefulStuffMod;
//
//import cpw.mods.fml.common.registry.GameRegistry;
//
//public class UMFluids {
//
//	public static Fluid enderWater = new Fluid("enderWater");
//	
//	
//	public static void init() {
//	
//		
//		FluidRegistry.registerFluid(enderWater);
//		UMBlocks.enderWaterBlock = new BlockEnderWater().setBlockName("yourFluid");
//		GameRegistry.registerBlock(UMBlocks.enderWaterBlock, UsefulStuffMod.MODID + ":" + "enderWater");
//		enderWater.setUnlocalizedName(UMBlocks.enderWaterBlock.getUnlocalizedName());
//
//	}
//}
