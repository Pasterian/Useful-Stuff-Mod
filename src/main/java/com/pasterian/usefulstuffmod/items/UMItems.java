package com.pasterian.usefulstuffmod.items;

import net.minecraft.item.Item;

import com.pasterian.usefulstuffmod.UMUtil;
import com.pasterian.usefulstuffmod.armor.Armor;

import cpw.mods.fml.common.registry.GameRegistry;

public class UMItems {

	public static Item blueShard; 
	public static Item redShard;
	public static Item yellowShard;
	public static Item cyanShard;
	public static Item greenShard;
	public static Item pinkShard;
	public static Item purpleShard;
	
	public static Item parGem;
	
	//Armour
	public static Item parmentaHelm;
	public static Item parmentaChest;
	public static Item parmentaLegs;
	public static Item parmentaBoots;
	
	public static void init() {
	
		// Adding Items
		parGem = new ParGem().setUnlocalizedName("parGem");
				
		// Shards
		blueShard = new BlueShard().setUnlocalizedName("blueShard");
		redShard = new RedShard().setUnlocalizedName("redShard");
		yellowShard = new YellowShard().setUnlocalizedName("YellowShard");		
		cyanShard = new CyanShard().setUnlocalizedName("cyanShard");
		greenShard = new GreenShard().setUnlocalizedName("greenShard");
		pinkShard = new PinkShard().setUnlocalizedName("pinkShard");
		purpleShard = new PurpleShard().setUnlocalizedName("purpleShard");
				
				
		// Armor
		parmentaHelm = new Armor(UMUtil.ParmentaMaterial, 0, 0, "parmenta");
		parmentaChest = new Armor(UMUtil.ParmentaMaterial, 0, 1, "parmenta");
		parmentaLegs = new Armor(UMUtil.ParmentaMaterial, 0, 2, "parmenta");
		parmentaBoots = new Armor(UMUtil.ParmentaMaterial, 0, 3, "parmenta");
			
				
		// Registering Items
		GameRegistry.registerItem(blueShard, "blueShard");
		GameRegistry.registerItem(redShard, "redshard");
		GameRegistry.registerItem(yellowShard, "yellowshard");
		GameRegistry.registerItem(cyanShard, "cyanshard");
		GameRegistry.registerItem(pinkShard, "pinkshard");
		GameRegistry.registerItem(purpleShard, "purpleshard");
		GameRegistry.registerItem(greenShard, "greenshard");
		GameRegistry.registerItem(parGem, "parGem");

				
		// Armor
		GameRegistry.registerItem(parmentaHelm, "ParmentaHelm");
		GameRegistry.registerItem(parmentaChest, "ParmentaChest");
		GameRegistry.registerItem(parmentaLegs, "ParmentaLegs");
		GameRegistry.registerItem(parmentaBoots, "ParmentaBoots");
	}
}
