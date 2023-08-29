
package teaper.aenarim.item;

import teaper.aenarim.init.AenarimModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class FlintShovelItem extends ShovelItem {
	public FlintShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 64;
			}

			public float getSpeed() {
				return 3.5f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.FLINT), new ItemStack(AenarimModItems.FLINT_SHOVEL));
			}
		}, 1, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
