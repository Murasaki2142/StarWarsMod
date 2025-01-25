
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

import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

public class StarWarsPathOfTheJediModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarWarsPathOfTheJediMod.MODID);
	public static final RegistryObject<Item> THE_CUBE = block(StarWarsPathOfTheJediModBlocks.THE_CUBE);
	public static final RegistryObject<Item> THE_SECOND_CUBE = block(StarWarsPathOfTheJediModBlocks.THE_SECOND_CUBE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
