package net.mcreator.starwarspathofthejedi.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starwarspathofthejedi.init.StarWarsPathOfTheJediModBlockEntities;
import net.mcreator.starwarspathofthejedi.block.renderer.ConsoleTileRenderer;
import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

@Mod.EventBusSubscriber(modid = StarWarsPathOfTheJediMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(StarWarsPathOfTheJediModBlockEntities.CONSOLE.get(), context -> new ConsoleTileRenderer());
	}
}
