package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.ConsoleDisplayModel;
import net.mcreator.starwarspathofthejedi.block.display.ConsoleDisplayItem;

public class ConsoleDisplayItemRenderer extends GeoItemRenderer<ConsoleDisplayItem> {
	public ConsoleDisplayItemRenderer() {
		super(new ConsoleDisplayModel());
	}

	@Override
	public RenderType getRenderType(ConsoleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
