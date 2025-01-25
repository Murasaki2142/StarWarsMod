package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.MechanicalConsole2BlockModel;
import net.mcreator.starwarspathofthejedi.block.entity.MechanicalConsole2TileEntity;

public class MechanicalConsole2TileRenderer extends GeoBlockRenderer<MechanicalConsole2TileEntity> {
	public MechanicalConsole2TileRenderer() {
		super(new MechanicalConsole2BlockModel());
	}

	@Override
	public RenderType getRenderType(MechanicalConsole2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
