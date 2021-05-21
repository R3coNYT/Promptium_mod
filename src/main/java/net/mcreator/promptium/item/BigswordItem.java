
package net.mcreator.promptium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.promptium.procedures.BigswordItemIsCraftedsmeltedProcedure;
import net.mcreator.promptium.itemgroup.PromptiumItemGroup;
import net.mcreator.promptium.PromptiumModElements;

import java.util.Map;
import java.util.HashMap;

@PromptiumModElements.ModElement.Tag
public class BigswordItem extends PromptiumModElements.ModElement {
	@ObjectHolder("promptium:bigsword")
	public static final Item block = null;
	public BigswordItem(PromptiumModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 40f;
			}

			public float getAttackDamage() {
				return 23f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 95;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BigswordItem.block, (int) (1)));
			}
		}, 3, 6f, new Item.Properties().group(PromptiumItemGroup.tab)) {
			@Override
			public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onCreated(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					BigswordItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("bigsword"));
	}
}
