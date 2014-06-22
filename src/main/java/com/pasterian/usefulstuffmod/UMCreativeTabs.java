package com.pasterian.usefulstuffmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.pasterian.usefulstuffmod.items.UMItems;

public class UMCreativeTabs {

	//Creative Tabs
		public static CreativeTabs usefulStuffTabBlocks = new CreativeTabs("usefulStuffTabBlocks")
		{
			public Item getTabIconItem() {
				return Item.getItemFromBlock(UMBlocks.minablePick);
			}
		};

		public static CreativeTabs usefulStuffTabItems = new CreativeTabs("usefulStuffTabItems")
		{
			public Item getTabIconItem() {
				return UMItems.cyanShard;	
			}
		};

		public static CreativeTabs usefulStuffTabArmor = new CreativeTabs("usefulStuffTabArmor")
		{
			public Item getTabIconItem() {
				return UMItems.parmentaHelm;
			}
		};
}
