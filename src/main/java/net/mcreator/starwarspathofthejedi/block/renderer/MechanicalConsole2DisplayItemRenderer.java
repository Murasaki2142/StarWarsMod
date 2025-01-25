package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.MechanicalConsole2DisplayModel;
import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole2DisplayItem;

public class MechanicalConsole2DisplayItemRenderer extends GeoItemRenderer<MechanicalConsole2DisplayItem> {
	public MechanicalConsole2DisplayItemRenderer() {
		super(new MechanicalConsole2DisplayModel());
	}

	@Override
	public RenderType getRenderType(MechanicalConsole2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
