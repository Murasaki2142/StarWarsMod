package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole1DisplayItem;

public class MechanicalConsole1DisplayModel extends GeoModel<MechanicalConsole1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MechanicalConsole1DisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/console1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MechanicalConsole1DisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/console1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MechanicalConsole1DisplayItem entity) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/mechanicalconsole.png");
	}
}
