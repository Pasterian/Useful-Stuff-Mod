package com.pasterian.usefulstuffmod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class UMUtil {

	public static ArmorMaterial ParmentaMaterial = EnumHelper.addArmorMaterial("ParmentaArmor", 35, new int[]{2,6,5,2},10);
	
	public static String getTexture(String name) {
		
		if (name == null)
		{
			throw new IllegalArgumentException("Name cannot be null!");
		}
		return "pasterian:" + name + ".png";
	}
	
	public static void init() {
		
		
		
	}
}
