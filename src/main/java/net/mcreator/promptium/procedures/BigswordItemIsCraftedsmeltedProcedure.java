package net.mcreator.promptium.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.promptium.block.PromptiumblockBlock;
import net.mcreator.promptium.PromptiumModElements;
import net.mcreator.promptium.PromptiumMod;

import java.util.Map;

@PromptiumModElements.ModElement.Tag
public class BigswordItemIsCraftedsmeltedProcedure extends PromptiumModElements.ModElement {
	public BigswordItemIsCraftedsmeltedProcedure(PromptiumModElements instance) {
		super(instance, 28);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PromptiumMod.LOGGER.warn("Failed to load dependency entity for procedure BigswordItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 10);
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(PromptiumblockBlock.block, (int) (1));
			_setstack.setCount((int) 2);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Now, you are the best !!"), (true));
		}
	}
}
