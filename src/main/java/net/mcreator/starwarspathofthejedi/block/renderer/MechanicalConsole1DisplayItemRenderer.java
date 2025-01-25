package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.MechanicalConsole1DisplayModel;
import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole1DisplayItem;

public class MechanicalConsole1DisplayItemRenderer extends GeoItemRenderer<MechanicalConsole1DisplayItem> {
	public MechanicalConsole1DisplayItemRenderer() {
		super(new MechanicalConsole1DisplayModel());
	}

	@Override
	public RenderType getRenderType(MechanicalConsole1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
