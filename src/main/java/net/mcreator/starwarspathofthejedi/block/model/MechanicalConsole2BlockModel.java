package net.mcreator.starwarspathofthejedi.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarspathofthejedi.block.entity.MechanicalConsole2TileEntity;

public class MechanicalConsole2BlockModel extends GeoModel<MechanicalConsole2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MechanicalConsole2TileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "animations/console1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MechanicalConsole2TileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "geo/console1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MechanicalConsole2TileEntity animatable) {
		return new ResourceLocation("star_wars_path_of_the_jedi", "textures/block/mechanicalconsole2.png");
	}
}
