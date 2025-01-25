
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarspathofthejedi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

public class StarWarsPathOfTheJediModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarWarsPathOfTheJediMod.MODID);
	public static final RegistryObject<CreativeModeTab> DECOR_TAB = REGISTRY.register("decor_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.star_wars_path_of_the_jedi.decor_tab")).icon(() -> new ItemStack(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_1.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_2.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_3.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_1.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_2.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_3.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_4.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_5.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_6.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_7.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.FELUCIA_GREEN_BLOB_1.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.FELUCIA_GREEN_BLOB_2.get().asItem());
				tabData.accept(StarWarsPathOfTheJediModBlocks.FELUCIA_GREEN_BLOB_3.get().asItem());
			}).withSearchBar().build());
}
