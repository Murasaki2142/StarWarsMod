
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarspathofthejedi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.starwarspathofthejedi.block.TheCubeBlock;
import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

public class StarWarsPathOfTheJediModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarWarsPathOfTheJediMod.MODID);
	public static final RegistryObject<Block> THE_CUBE = REGISTRY.register("the_cube", () -> new TheCubeBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
