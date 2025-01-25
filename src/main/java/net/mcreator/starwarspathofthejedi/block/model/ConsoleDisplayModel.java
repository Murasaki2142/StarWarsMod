package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.display.ConsoleDisplayItem;

public class ConsoleDisplayModel extends GeoModel<ConsoleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ConsoleDisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/venator_bridge_mechanical_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConsoleDisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/venator_bridge_mechanical_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConsoleDisplayItem entity) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/venator_bridge_mechanical_table.png");
	}
}
