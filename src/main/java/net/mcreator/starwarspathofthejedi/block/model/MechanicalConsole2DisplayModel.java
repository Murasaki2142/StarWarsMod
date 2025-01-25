package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole2DisplayItem;

public class MechanicalConsole2DisplayModel extends GeoModel<MechanicalConsole2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MechanicalConsole2DisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/console1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MechanicalConsole2DisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/console1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MechanicalConsole2DisplayItem entity) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/mechanicalconsole2.png");
	}
}
