
package net.mcreator.promptium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

@PromptiumModElements.ModElement.Tag
public class PromptiumshearsItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:promptiumshears")
	public static final Item block = null;
	public PromptiumshearsItem(PromptiumModElements instance) {
		super(instance, 168);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(PromptiumItemGroup.tab).maxDamage(2500)) {
			@Override
			public int getItemEnchantability() {
				return 50;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 15f;
			}

			@Override
			public boolean hasContainerItem() {
				return true;
			}

			@Override
			public ItemStack getContainerItem(ItemStack itemstack) {
				ItemStack retval = new ItemStack(this);
				retval.setDamage(itemstack.getDamage() + 1);
				if (retval.getDamage() >= retval.getMaxDamage()) {
					return ItemStack.EMPTY;
				}
				return retval;
			}

			@Override
			public boolean isRepairable(ItemStack itemstack) {
				return false;
			}
		}.setRegistryName("promptiumshears"));
	}
}
