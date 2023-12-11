package com.natamus.nutritiousmilk.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.nutritiousmilk.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 20) public static int hungerLevelIncrease = 10;
	@Entry(min = 0, max = 20.0) public static double saturationLevelIncrease = 10.0;

	public static void initConfig() {
		configMetaData.put("hungerLevelIncrease", Arrays.asList(
			"The hunger level decreased. Example values: cookie = 2, bread = 5, salmon = 6, steak = 8."
		));
		configMetaData.put("saturationLevelIncrease", Arrays.asList(
			"The saturation increase. Example values: melon = 1.2, carrot = 3.6, chicken = 7.2, steak 12.8."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}