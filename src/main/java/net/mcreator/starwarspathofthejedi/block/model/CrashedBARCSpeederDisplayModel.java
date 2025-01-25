package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.display.CrashedBARCSpeederDisplayItem;

public class CrashedBARCSpeederDisplayModel extends GeoModel<CrashedBARCSpeederDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CrashedBARCSpeederDisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/crashed_speeder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrashedBARCSpeederDisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/crashed_speeder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrashedBARCSpeederDisplayItem entity) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/crashed_speeder_bike.png");
	}
}
