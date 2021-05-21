
package net.mcreator.promptium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

@PromptiumModElements.ModElement.Tag
public class PuraniumPickaxeItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:puranium_pickaxe")
	public static final Item block = null;
	public PuraniumPickaxeItem(PromptiumModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 35;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PuraniumPickaxeItem.block, (int) (1)));
			}
		}, 1, 6f, new Item.Properties().group(PromptiumItemGroup.tab)) {
		}.setRegistryName("puranium_pickaxe"));
	}
}
