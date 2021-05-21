package net.mcreator.promptium.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.promptium.item.EndiumtoolsSwordItem;
import net.mcreator.promptium.item.EndiumtoolsShovelItem;
import net.mcreator.promptium.item.EndiumtoolsPickaxeItem;
import net.mcreator.promptium.item.EndiumtoolsHoeItem;
import net.mcreator.promptium.item.EndiumtoolsAxeItem;
import net.mcreator.promptium.item.EndiumarmorArmorItem;
import net.mcreator.promptium.block.HardenedobsidianBlock;
import net.mcreator.promptium.block.EndiumblockBlock;
import net.mcreator.promptium.PromptiumModElements;
import net.mcreator.promptium.PromptiumMod;

import java.util.Map;

@PromptiumModElements.ModElement.Tag
public class EndiumStuffCommandCommandExecutedProcedure extends PromptiumModElements.ModElement {
	public EndiumStuffCommandCommandExecutedProcedure(PromptiumModElements instance) {
		super(instance, 106);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PromptiumMod.LOGGER.warn("Failed to load dependency entity for procedure EndiumStuffCommandCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumarmorArmorItem.helmet, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumarmorArmorItem.body, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumarmorArmorItem.legs, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumarmorArmorItem.boots, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumtoolsSwordItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumtoolsAxeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumtoolsPickaxeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumtoolsShovelItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumtoolsHoeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(EndiumblockBlock.block, (int) (1));
			_setstack.setCount((int) 64);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(HardenedobsidianBlock.block, (int) (1));
			_setstack.setCount((int) 128);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
