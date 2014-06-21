package com.pasterian.usefulstuffmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import com.pasterian.usefulstuffmod.UMCreativeTabs;
import com.pasterian.usefulstuffmod.UMUtil;
import com.pasterian.usefulstuffmod.items.UMItems;

public class GreenShardOre extends Block {

	public GreenShardOre(Material mat){
		super(mat);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockName("greenshardOre");
		this.setCreativeTab(UMCreativeTabs.usefulStuffTabBlocks);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(2.0F);
		this.setBlockTextureName(UMUtil.getTexture("greenShardOre"));
	}

	public Item getItemDropped(int par1, Random rand, int fortune){
		return UMItems.greenShard;
	}

	public int quantityDropped(Random rand){
		return rand.nextInt(4) + 1;
	}

	private Random rand = new Random();
	@Override
	public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_){
		if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
		{
			return 1 + rand.nextInt(5);
		}
		return 0;
	}

}