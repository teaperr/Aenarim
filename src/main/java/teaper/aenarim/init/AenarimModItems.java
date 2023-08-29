
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package teaper.aenarim.init;

import teaper.aenarim.item.FlintKnifeItem;
import teaper.aenarim.item.FlintHatchetItem;
import teaper.aenarim.item.FibreItem;
import teaper.aenarim.AenarimMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class AenarimModItems {
	public static Item FIBRE;
	public static Item FLINT_KNIFE;
	public static Item FLINT_HATCHET;

	public static void load() {
		FIBRE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "fibre"), new FibreItem());
		FLINT_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "flint_knife"), new FlintKnifeItem());
		FLINT_HATCHET = Registry.register(Registry.ITEM, new ResourceLocation(AenarimMod.MODID, "flint_hatchet"), new FlintHatchetItem());
	}
}
