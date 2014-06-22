package com.pasterian.usefulstuffmod.items;

import net.minecraft.item.Item;

import com.pasterian.usefulstuffmod.UMCreativeTabs;

public class YellowShard extends Item {

	public YellowShard(){
		super();
		this.setCreativeTab(UMCreativeTabs.usefulStuffTabItems);
		this.setMaxStackSize(64);
		this.setTextureName("pasterian" + ":" + "YellowShard");
	}

}