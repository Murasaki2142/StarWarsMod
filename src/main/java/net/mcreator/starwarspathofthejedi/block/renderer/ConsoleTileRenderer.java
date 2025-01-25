package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.ConsoleBlockModel;
import net.mcreator.starwarspathofthejedi.block.entity.ConsoleTileEntity;

public class ConsoleTileRenderer extends GeoBlockRenderer<ConsoleTileEntity> {
	public ConsoleTileRenderer() {
		super(new ConsoleBlockModel());
	}

	@Override
	public RenderType getRenderType(ConsoleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
