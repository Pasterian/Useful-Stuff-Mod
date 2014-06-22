package com.pasterian.usefulstuffmod.items;

import net.minecraft.item.Item;

import com.pasterian.usefulstuffmod.UMCreativeTabs;

public class CyanShard extends Item {

	public CyanShard(){
		super();
		this.setCreativeTab(UMCreativeTabs.usefulStuffTabItems);
		this.setMaxStackSize(64);
		this.setTextureName("pasterian" + ":" + "cyanShard");
	}

}