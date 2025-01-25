
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarspathofthejedi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.starwarspathofthejedi.block.entity.MechanicalConsole3TileEntity;
import net.mcreator.starwarspathofthejedi.block.entity.MechanicalConsole2TileEntity;
import net.mcreator.starwarspathofthejedi.block.entity.MechanicalConsole1TileEntity;
import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

public class StarWarsPathOfTheJediModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StarWarsPathOfTheJediMod.MODID);
	public static final RegistryObject<BlockEntityType<MechanicalConsole1TileEntity>> MECHANICAL_CONSOLE_1 = REGISTRY.register("mechanical_console_1",
			() -> BlockEntityType.Builder.of(MechanicalConsole1TileEntity::new, StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<MechanicalConsole2TileEntity>> MECHANICAL_CONSOLE_2 = REGISTRY.register("mechanical_console_2",
			() -> BlockEntityType.Builder.of(MechanicalConsole2TileEntity::new, StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<MechanicalConsole3TileEntity>> MECHANICAL_CONSOLE_3 = REGISTRY.register("mechanical_console_3",
			() -> BlockEntityType.Builder.of(MechanicalConsole3TileEntity::new, StarWarsPathOfTheJediModBlocks.MECHANICAL_CONSOLE_3.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
