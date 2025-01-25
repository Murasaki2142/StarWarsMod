package net.mcreator.starwarspathofthejedi.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starwarspathofthejedi.init.StarWarsPathOfTheJediModBlockEntities;
import net.mcreator.starwarspathofthejedi.block.renderer.MechanicalConsole3TileRenderer;
import net.mcreator.starwarspathofthejedi.block.renderer.MechanicalConsole2TileRenderer;
import net.mcreator.starwarspathofthejedi.block.renderer.MechanicalConsole1TileRenderer;
import net.mcreator.starwarspathofthejedi.block.renderer.CrashedBARCSpeederTileRenderer;
import net.mcreator.starwarspathofthejedi.StarWarsPathOfTheJediMod;

@Mod.EventBusSubscriber(modid = StarWarsPathOfTheJediMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(StarWarsPathOfTheJediModBlockEntities.MECHANICAL_CONSOLE_1.get(), context -> new MechanicalConsole1TileRenderer());
		event.registerBlockEntityRenderer(StarWarsPathOfTheJediModBlockEntities.MECHANICAL_CONSOLE_2.get(), context -> new MechanicalConsole2TileRenderer());
		event.registerBlockEntityRenderer(StarWarsPathOfTheJediModBlockEntities.MECHANICAL_CONSOLE_3.get(), context -> new MechanicalConsole3TileRenderer());
		event.registerBlockEntityRenderer(StarWarsPathOfTheJediModBlockEntities.CRASHED_BARC_SPEEDER.get(), context -> new CrashedBARCSpeederTileRenderer());
	}
}
