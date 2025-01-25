package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.CrashedBARCSpeederDisplayModel;
import net.mcreator.starwarspathofthejedi.block.display.CrashedBARCSpeederDisplayItem;

public class CrashedBARCSpeederDisplayItemRenderer extends GeoItemRenderer<CrashedBARCSpeederDisplayItem> {
	public CrashedBARCSpeederDisplayItemRenderer() {
		super(new CrashedBARCSpeederDisplayModel());
	}

	@Override
	public RenderType getRenderType(CrashedBARCSpeederDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
