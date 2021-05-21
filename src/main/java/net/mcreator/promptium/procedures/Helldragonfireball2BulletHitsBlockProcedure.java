package net.mcreator.promptium.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.promptium.PromptiumModElements;
import net.mcreator.promptium.PromptiumMod;

import java.util.Map;

@PromptiumModElements.ModElement.Tag
public class Helldragonfireball2BulletHitsBlockProcedure extends PromptiumModElements.ModElement {
	public Helldragonfireball2BulletHitsBlockProcedure(PromptiumModElements instance) {
		super(instance, 152);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PromptiumMod.LOGGER.warn("Failed to load dependency entity for procedure Helldragonfireball2BulletHitsBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PromptiumMod.LOGGER.warn("Failed to load dependency x for procedure Helldragonfireball2BulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PromptiumMod.LOGGER.warn("Failed to load dependency y for procedure Helldragonfireball2BulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PromptiumMod.LOGGER.warn("Failed to load dependency z for procedure Helldragonfireball2BulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PromptiumMod.LOGGER.warn("Failed to load dependency world for procedure Helldragonfireball2BulletHitsBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
		}
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 2);
	}
}
