package com.natamus.nutritiousmilk.events;

import com.natamus.nutritiousmilk.config.ConfigHandler;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class MilkEvent {
	public static void onDrink(Player player, ItemStack usedItem, ItemStack newItem, InteractionHand hand) {
		Item item = usedItem.getItem();
		String registryname = BuiltInRegistries.ITEM.getKey(item).toString();
		if (item.equals(Items.MILK_BUCKET) || registryname.contains("milk_bucket")) {
			FoodData fs = player.getFoodData();
			
			fs.setFoodLevel(fs.getFoodLevel() + ConfigHandler.hungerLevelIncrease);
			fs.setSaturation(fs.getSaturationLevel() + (float)ConfigHandler.saturationLevelIncrease);
		}
	}
}