
package net.mcreator.promptium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

@PromptiumModElements.ModElement.Tag
public class EndiumtoolsSwordItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:endiumtools_sword")
	public static final Item block = null;
	public EndiumtoolsSwordItem(PromptiumModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 9.5f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 65;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EndiumtoolsSwordItem.block, (int) (1)));
			}
		}, 3, 8.5f, new Item.Properties().group(PromptiumItemGroup.tab)) {
		}.setRegistryName("endiumtools_sword"));
	}
}
