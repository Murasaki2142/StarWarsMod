package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole3DisplayItem;

public class MechanicalConsole3DisplayModel extends GeoModel<MechanicalConsole3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MechanicalConsole3DisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/console1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MechanicalConsole3DisplayItem animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/console1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MechanicalConsole3DisplayItem entity) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/mechanicalconsole3.png");
	}
}
