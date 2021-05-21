
package net.mcreator.promptium.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

import java.util.List;
import java.util.Collections;

@PromptiumModElements.ModElement.Tag
public class AlarmkeyblockBlock extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:alarmkeyblock")
	public static final Block block = null;
	public AlarmkeyblockBlock(PromptiumModElements instance) {
		super(instance, 165);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(PromptiumItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(2f, 15f).setLightLevel(s -> 3).harvestLevel(5)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("alarmkeyblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
