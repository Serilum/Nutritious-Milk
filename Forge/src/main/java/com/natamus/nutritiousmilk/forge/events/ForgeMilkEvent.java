package com.natamus.nutritiousmilk.forge.events;

import com.natamus.nutritiousmilk.events.MilkEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeMilkEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeMilkEvent.class);

		LivingEntityUseItemEvent.Finish.BUS.addListener(ForgeMilkEvent::onDrink);
	}

	@SubscribeEvent
	public static void onDrink(LivingEntityUseItemEvent.Finish e) {
		Entity entity = e.getEntity();
		if (!(entity instanceof Player)) {
			return;
		}

		MilkEvent.onDrink((Player)e.getEntity(), e.getItem(), null, null);
	}
}