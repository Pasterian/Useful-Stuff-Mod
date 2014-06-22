package com.pasterian.usefulstuffmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.pasterian.usefulstuffmod.UMCreativeTabs;

public class GreenQuartz extends Block {

	public GreenQuartz(Material mat){
		super(mat);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockName("GreenQuartz");
		this.setCreativeTab(UMCreativeTabs.usefulStuffTabBlocks);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(2.0F);
		this.setBlockTextureName("pasterian" + ":" + "GreenQuartz");
	}
}
