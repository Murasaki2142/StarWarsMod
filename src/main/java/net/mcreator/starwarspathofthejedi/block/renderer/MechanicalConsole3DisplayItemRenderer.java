package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.MechanicalConsole3DisplayModel;
import net.mcreator.starwarspathofthejedi.block.display.MechanicalConsole3DisplayItem;

public class MechanicalConsole3DisplayItemRenderer extends GeoItemRenderer<MechanicalConsole3DisplayItem> {
	public MechanicalConsole3DisplayItemRenderer() {
		super(new MechanicalConsole3DisplayModel());
	}

	@Override
	public RenderType getRenderType(MechanicalConsole3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
