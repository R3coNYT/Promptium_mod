
package net.mcreator.promptium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

@PromptiumModElements.ModElement.Tag
public class AlarmkeysideItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:alarmkeyside")
	public static final Item block = null;
	public AlarmkeysideItem(PromptiumModElements instance) {
		super(instance, 186);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PromptiumItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("alarmkeyside");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
