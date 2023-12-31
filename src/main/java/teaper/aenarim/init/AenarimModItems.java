
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package teaper.aenarim.init;

import teaper.aenarim.item.WovenArmourItem;
import teaper.aenarim.item.SharpBoneItem;
import teaper.aenarim.item.FlintShovelItem;
import teaper.aenarim.item.FlintPickaxeItem;
import teaper.aenarim.item.FlintKnifeItem;
import teaper.aenarim.item.FlintHoeItem;
import teaper.aenarim.item.FlintHatchetItem;
import teaper.aenarim.item.FibreItem;
import teaper.aenarim.item.DriedFibreItem;
import teaper.aenarim.item.BoneSwordItem;
import teaper.aenarim.item.BoneShovelItem;
import teaper.aenarim.item.BonePickaxeItem;
import teaper.aenarim.item.BoneHoeItem;
import teaper.aenarim.item.BoneAxeItem;
import teaper.aenarim.AenarimMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class AenarimModItems {
	public static Item FIBRE;
	public static Item FLINT_KNIFE;
	public static Item FLINT_HATCHET;
	public static Item FLINT_SHOVEL;
	public static Item FLINT_HOE;
	public static Item FLINT_PICKAXE;
	public static Item WOVEN_ARMOUR_CHESTPLATE;
	public static Item WOVEN_ARMOUR_LEGGINGS;
	public static Item DRIED_FIBRE;
	public static Item SHARP_BONE;
	public static Item BONE_PICKAXE;
	public static Item BONE_AXE;
	public static Item BONE_SWORD;
	public static Item BONE_SHOVEL;
	public static Item BONE_HOE;

	public static void load() {
		FIBRE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "fibre"), new FibreItem());
		FLINT_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "flint_knife"), new FlintKnifeItem());
		FLINT_HATCHET = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "flint_hatchet"), new FlintHatchetItem());
		FLINT_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "flint_shovel"), new FlintShovelItem());
		FLINT_HOE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "flint_hoe"), new FlintHoeItem());
		FLINT_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "flint_pickaxe"), new FlintPickaxeItem());
		WOVEN_ARMOUR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "woven_armour_chestplate"), new WovenArmourItem.Chestplate());
		WOVEN_ARMOUR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "woven_armour_leggings"), new WovenArmourItem.Leggings());
		DRIED_FIBRE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "dried_fibre"), new DriedFibreItem());
		SHARP_BONE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "sharp_bone"), new SharpBoneItem());
		BONE_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "bone_pickaxe"), new BonePickaxeItem());
		BONE_AXE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "bone_axe"), new BoneAxeItem());
		BONE_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "bone_sword"), new BoneSwordItem());
		BONE_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "bone_shovel"), new BoneShovelItem());
		BONE_HOE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "bone_hoe"), new BoneHoeItem());
	}
}
