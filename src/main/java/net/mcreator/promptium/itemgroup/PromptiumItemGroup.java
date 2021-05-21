
package net.mcreator.promptium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.promptium.item.PromptiumIngotItem;
import net.mcreator.promptium.PromptiumModElements;

@PromptiumModElements.ModElement.Tag
public class PromptiumItemGroup extends PromptiumModElements.ModElement {
	public PromptiumItemGroup(PromptiumModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpromptium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PromptiumIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
