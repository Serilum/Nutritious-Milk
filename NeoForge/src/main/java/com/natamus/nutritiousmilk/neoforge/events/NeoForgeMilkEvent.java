package com.natamus.nutritiousmilk.neoforge.events;

import com.natamus.nutritiousmilk.events.MilkEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeMilkEvent {
	@SubscribeEvent
	public static void onDrink(LivingEntityUseItemEvent.Finish e) {
		Entity entity = e.getEntity();
		if (!(entity instanceof Player)) {
			return;
		}

		MilkEvent.onDrink((Player)e.getEntity(), e.getItem(), null, null);
	}
}