package net.mcreator.starwarspathofthejedi.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarspathofthejedi.block.model.MechanicalConsole3BlockModel;
import net.mcreator.starwarspathofthejedi.block.entity.MechanicalConsole3TileEntity;

public class MechanicalConsole3TileRenderer extends GeoBlockRenderer<MechanicalConsole3TileEntity> {
	public MechanicalConsole3TileRenderer() {
		super(new MechanicalConsole3BlockModel());
	}

	@Override
	public RenderType getRenderType(MechanicalConsole3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
