package com.pasterian.usefulstuffmod.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.pasterian.usefulstuffmod.UMCreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ParmentaChest extends ItemArmor {

	public ParmentaChest(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_,String type) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

		this.setMaxStackSize(1);
		this.setCreativeTab(UMCreativeTabs.usefulStuffTabArmor);

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){

		this.itemIcon = reg.registerIcon("pasterian:");
		}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		return "pasterian:texture/models/armor/parmenta_layer_1.png";
	}
}


