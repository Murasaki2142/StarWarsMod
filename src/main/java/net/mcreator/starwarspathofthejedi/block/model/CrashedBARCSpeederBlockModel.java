package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.entity.CrashedBARCSpeederTileEntity;

public class CrashedBARCSpeederBlockModel extends GeoModel<CrashedBARCSpeederTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrashedBARCSpeederTileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/crashed_speeder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrashedBARCSpeederTileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/crashed_speeder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrashedBARCSpeederTileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/crashed_speeder_bike.png");
	}
}
