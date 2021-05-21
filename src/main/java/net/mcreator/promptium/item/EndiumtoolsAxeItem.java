
package net.mcreator.promptium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

@PromptiumModElements.ModElement.Tag
public class EndiumtoolsAxeItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:endiumtools_axe")
	public static final Item block = null;
	public EndiumtoolsAxeItem(PromptiumModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 8.5f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 65;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EndiumtoolsAxeItem.block, (int) (1)));
			}
		}, 1, 5f, new Item.Properties().group(PromptiumItemGroup.tab)) {
		}.setRegistryName("endiumtools_axe"));
	}
}
