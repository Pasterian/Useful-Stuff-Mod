package com.pasterian.usefulstuffmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.pasterian.usefulstuffmod.UMCreativeTabs;

public class ParmentaBlock extends Block {

	public ParmentaBlock(Material mat){
		super(mat);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockName("ParmentaBlock");
		this.setCreativeTab(UMCreativeTabs.usefulStuffTabBlocks);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(3.0F);
		this.setBlockTextureName("pasterian" + ":" + "BlockParmenta");
	}
}
