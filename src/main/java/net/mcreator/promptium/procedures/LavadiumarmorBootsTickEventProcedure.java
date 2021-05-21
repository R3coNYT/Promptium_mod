package net.mcreator.promptium.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.promptium.PromptiumModElements;
import net.mcreator.promptium.PromptiumMod;

import java.util.Map;

@PromptiumModElements.ModElement.Tag
public class LavadiumarmorBootsTickEventProcedure extends PromptiumModElements.ModElement {
	public LavadiumarmorBootsTickEventProcedure(PromptiumModElements instance) {
		super(instance, 133);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PromptiumMod.LOGGER.warn("Failed to load dependency entity for procedure LavadiumarmorBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 30, (int) 2, (false), (false)));
	}
}
