
package net.mcreator.promptium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

@PromptiumModElements.ModElement.Tag
public class LavadiumtoolsShovelItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:lavadiumtools_shovel")
	public static final Item block = null;
	public LavadiumtoolsShovelItem(PromptiumModElements instance) {
		super(instance, 119);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 20000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 80;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LavadiumtoolsShovelItem.block, (int) (1)));
			}
		}, 1, 7.5f, new Item.Properties().group(PromptiumItemGroup.tab)) {
		}.setRegistryName("lavadiumtools_shovel"));
	}
}
