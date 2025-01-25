package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.MechanicalConsole1BlockModel;
import net.mcreator.starwarspathofthejedi.block.entity.MechanicalConsole1TileEntity;

public class MechanicalConsole1TileRenderer extends GeoBlockRenderer<MechanicalConsole1TileEntity> {
	public MechanicalConsole1TileRenderer() {
		super(new MechanicalConsole1BlockModel());
	}

	@Override
	public RenderType getRenderType(MechanicalConsole1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
