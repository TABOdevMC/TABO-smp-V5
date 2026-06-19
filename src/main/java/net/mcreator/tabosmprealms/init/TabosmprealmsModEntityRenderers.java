
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tabosmprealms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.tabosmprealms.client.renderer.ShopPnjRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TabosmprealmsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TabosmprealmsModEntities.SHOP_PNJ.get(), ShopPnjRenderer::new);
	}
}
