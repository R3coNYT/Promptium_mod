package net.mcreator.promptium.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.promptium.block.ExposedcopperBlock;
import net.mcreator.promptium.PromptiumModElements;
import net.mcreator.promptium.PromptiumMod;

import java.util.Map;

@PromptiumModElements.ModElement.Tag
public class CopperblockUpdateTickProcedure extends PromptiumModElements.ModElement {
	public CopperblockUpdateTickProcedure(PromptiumModElements instance) {
		super(instance, 239);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PromptiumMod.LOGGER.warn("Failed to load dependency x for procedure CopperblockUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PromptiumMod.LOGGER.warn("Failed to load dependency y for procedure CopperblockUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PromptiumMod.LOGGER.warn("Failed to load dependency z for procedure CopperblockUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PromptiumMod.LOGGER.warn("Failed to load dependency world for procedure CopperblockUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ExposedcopperBlock.block.getDefaultState(), 3);
	}
}
