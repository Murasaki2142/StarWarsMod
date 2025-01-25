
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarspathofthejedi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.starwarspathofthejedi.block.MechanicalConsole3Block;
import net.mcreator.starwarspathofthejedi.block.MechanicalConsole2Block;
import net.mcreator.starwarspathofthejedi.block.MechanicalConsole1Block;
import net.mcreator.starwarspathofthejedi.block.FeluciaGreenBlob3Block;
import net.mcreator.starwarspathofthejedi.block.FeluciaGreenBlob2Block;
import net.mcreator.starwarspathofthejedi.block.FeluciaGreenBlob1Block;
import net.mcreator.starwarspathofthejedi.block.AlarmSensor7Block;
import net.mcreator.starwarspathofthejedi.block.AlarmSensor6Block;
import net.mcreator.starwarspathofthejedi.block.AlarmSensor5Block;
import net.mcreator.starwarspathofthejedi.block.AlarmSensor4Block;
import net.mcreator.starwarspathofthejedi.block.AlarmSensor3Block;
import net.mcreator.starwarspathofthejedi.block.AlarmSensor2Block;
import net.mcreator.starwarspathofthejedi.block.AlarmSensor1Block;
import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

public class StarWarsPathOfTheJediModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarWarsPathOfTheJediMod.MODID);
	public static final RegistryObject<Block> MECHANICAL_CONSOLE_1 = REGISTRY.register("mechanical_console_1", () -> new MechanicalConsole1Block());
	public static final RegistryObject<Block> MECHANICAL_CONSOLE_2 = REGISTRY.register("mechanical_console_2", () -> new MechanicalConsole2Block());
	public static final RegistryObject<Block> MECHANICAL_CONSOLE_3 = REGISTRY.register("mechanical_console_3", () -> new MechanicalConsole3Block());
	public static final RegistryObject<Block> ALARM_SENSOR_1 = REGISTRY.register("alarm_sensor_1", () -> new AlarmSensor1Block());
	public static final RegistryObject<Block> ALARM_SENSOR_2 = REGISTRY.register("alarm_sensor_2", () -> new AlarmSensor2Block());
	public static final RegistryObject<Block> ALARM_SENSOR_3 = REGISTRY.register("alarm_sensor_3", () -> new AlarmSensor3Block());
	public static final RegistryObject<Block> ALARM_SENSOR_4 = REGISTRY.register("alarm_sensor_4", () -> new AlarmSensor4Block());
	public static final RegistryObject<Block> ALARM_SENSOR_5 = REGISTRY.register("alarm_sensor_5", () -> new AlarmSensor5Block());
	public static final RegistryObject<Block> ALARM_SENSOR_6 = REGISTRY.register("alarm_sensor_6", () -> new AlarmSensor6Block());
	public static final RegistryObject<Block> ALARM_SENSOR_7 = REGISTRY.register("alarm_sensor_7", () -> new AlarmSensor7Block());
	public static final RegistryObject<Block> FELUCIA_GREEN_BLOB_1 = REGISTRY.register("felucia_green_blob_1", () -> new FeluciaGreenBlob1Block());
	public static final RegistryObject<Block> FELUCIA_GREEN_BLOB_2 = REGISTRY.register("felucia_green_blob_2", () -> new FeluciaGreenBlob2Block());
	public static final RegistryObject<Block> FELUCIA_GREEN_BLOB_3 = REGISTRY.register("felucia_green_blob_3", () -> new FeluciaGreenBlob3Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
