
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
public class LavadiumtoolsAxeItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:lavadiumtools_axe")
	public static final Item block = null;
	public LavadiumtoolsAxeItem(PromptiumModElements instance) {
		super(instance, 117);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 20000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 9.5f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 80;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LavadiumtoolsAxeItem.block, (int) (1)));
			}
		}, 1, 7.5f, new Item.Properties().group(PromptiumItemGroup.tab)) {
		}.setRegistryName("lavadiumtools_axe"));
	}
}
