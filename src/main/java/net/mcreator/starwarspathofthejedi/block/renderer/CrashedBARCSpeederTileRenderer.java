package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.CrashedBARCSpeederBlockModel;
import net.mcreator.starwarspathofthejedi.block.entity.CrashedBARCSpeederTileEntity;

public class CrashedBARCSpeederTileRenderer extends GeoBlockRenderer<CrashedBARCSpeederTileEntity> {
	public CrashedBARCSpeederTileRenderer() {
		super(new CrashedBARCSpeederBlockModel());
	}

	@Override
	public RenderType getRenderType(CrashedBARCSpeederTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
