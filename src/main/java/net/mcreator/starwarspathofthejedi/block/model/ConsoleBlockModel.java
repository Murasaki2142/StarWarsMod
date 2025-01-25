package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.entity.ConsoleTileEntity;

public class ConsoleBlockModel extends GeoModel<ConsoleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ConsoleTileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/venator_bridge_mechanical_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConsoleTileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/venator_bridge_mechanical_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConsoleTileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/venator_bridge_mechanical_table.png");
	}
}
