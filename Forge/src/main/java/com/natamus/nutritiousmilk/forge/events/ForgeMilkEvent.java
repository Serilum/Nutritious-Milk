package com.natamus.nutritiousmilk.forge.events;

import com.natamus.nutritiousmilk.events.MilkEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeMilkEvent {
	@SubscribeEvent
	public static void onDrink(LivingEntityUseItemEvent.Finish e) {
		Entity entity = e.getEntity();
		if (!(entity instanceof Player)) {
			return;
		}

		MilkEvent.onDrink((Player)e.getEntity(), e.getItem(), null, null);
	}
}