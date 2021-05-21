
package net.mcreator.promptium.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.item.EndiumnuggetItem;
import net.mcreator.promptium.PromptiumModElements;

import java.util.List;
import java.util.Collections;

@PromptiumModElements.ModElement.Tag
public class EndiumleavesBlock extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:endiumleaves")
	public static final Block block = null;
	public EndiumleavesBlock(PromptiumModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(PromptiumItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.2f, 1f).setLightLevel(s -> 0).notSolid());
			setRegistryName("endiumleaves");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.GREEN;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(EndiumnuggetItem.block, (int) (1)));
		}
	}
}
