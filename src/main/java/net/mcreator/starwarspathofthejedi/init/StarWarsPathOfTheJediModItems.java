
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarspathofthejedi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole3DisplayItem;
import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole2DisplayItem;
import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole1DisplayItem;
import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

public class StarWarsPathOfTheJediModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarWarsPathOfTheJediMod.MODID);
	public static final RegistryObject<Item> MECHANICAL_CONSOLE_1 = REGISTRY.register(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_1.getId().getPath(),
			() -> new MechanicalConsole1DisplayItem(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_1.get(), new Item.Properties()));
	public static final RegistryObject<Item> MECHANICAL_CONSOLE_2 = REGISTRY.register(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_2.getId().getPath(),
			() -> new MechanicalConsole2DisplayItem(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_2.get(), new Item.Properties()));
	public static final RegistryObject<Item> MECHANICAL_CONSOLE_3 = REGISTRY.register(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_3.getId().getPath(),
			() -> new MechanicalConsole3DisplayItem(StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_3.get(), new Item.Properties()));
	public static final RegistryObject<Item> ALARM_SENSOR_1 = block(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_1);
	public static final RegistryObject<Item> ALARM_SENSOR_2 = block(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_2);
	public static final RegistryObject<Item> ALARM_SENSOR_3 = block(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_3);
	public static final RegistryObject<Item> ALARM_SENSOR_4 = block(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_4);
	public static final RegistryObject<Item> ALARM_SENSOR_5 = block(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_5);
	public static final RegistryObject<Item> ALARM_SENSOR_6 = block(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_6);
	public static final RegistryObject<Item> ALARM_SENSOR_7 = block(StarWarsPathOfTheJediModBlocks.ALARM_SENSOR_7);
	public static final RegistryObject<Item> FELUCIA_GREEN_BLOB_1 = block(StarWarsPathOfTheJediModBlocks.FELUCIA_GREEN_BLOB_1);
	public static final RegistryObject<Item> FELUCIA_GREEN_BLOB_2 = block(StarWarsPathOfTheJediModBlocks.FELUCIA_GREEN_BLOB_2);
	public static final RegistryObject<Item> FELUCIA_GREEN_BLOB_3 = block(StarWarsPathOfTheJediModBlocks.FELUCIA_GREEN_BLOB_3);
	public static final RegistryObject<Item> FELUCIA_BROWN_SHROOM_1 = block(StarWarsPathOfTheJediModBlocks.FELUCIA_BROWN_SHROOM_1);
	public static final RegistryObject<Item> FELUCIA_BROWN_SHROOM_2 = block(StarWarsPathOfTheJediModBlocks.FELUCIA_BROWN_SHROOM_2);
	public static final RegistryObject<Item> FELUCIA_BROWN_SHROOM_3 = block(StarWarsPathOfTheJediModBlocks.FELUCIA_BROWN_SHROOM_3);
	public static final RegistryObject<Item> VENATOR_CHAIR = block(StarWarsPathOfTheJediModBlocks.VENATOR_CHAIR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
