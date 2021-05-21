package net.mcreator.promptium.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.promptium.PromptiumModVariables;
import net.mcreator.promptium.PromptiumModElements;
import net.mcreator.promptium.PromptiumMod;

import java.util.Map;

@PromptiumModElements.ModElement.Tag
public class ProcafficherargentProcedure extends PromptiumModElements.ModElement {
	public ProcafficherargentProcedure(PromptiumModElements instance) {
		super(instance, 102);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PromptiumMod.LOGGER.warn("Failed to load dependency entity for procedure Procafficherargent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("Argent", ((entity.getPersistentData().getDouble("Argent")) + 0));
		{
			double _setval = (double) (entity.getPersistentData().getDouble("Argent"));
			entity.getCapability(PromptiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.argentplayershop = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
