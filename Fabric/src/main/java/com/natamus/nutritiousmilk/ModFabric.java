package com.natamus.nutritiousmilk;

import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.fabric.callbacks.CollectiveItemEvents;
import com.natamus.nutritiousmilk.events.MilkEvent;
import com.natamus.nutritiousmilk.util.Reference;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		CollectiveItemEvents.ON_ITEM_USE_FINISHED.register((player, usedItem, newItem, hand) -> {
			MilkEvent.onDrink(player, usedItem, newItem, hand);
			return null;
		});
	}

	private static void setGlobalConstants() {

	}
}
