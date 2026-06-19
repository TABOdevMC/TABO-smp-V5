
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tabosmprealms.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.tabosmprealms.client.gui.WorldGuiScreen;
import net.mcreator.tabosmprealms.client.gui.ShopScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TabosmprealmsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TabosmprealmsModMenus.WORLD_GUI.get(), WorldGuiScreen::new);
			MenuScreens.register(TabosmprealmsModMenus.SHOP.get(), ShopScreen::new);
		});
	}
}
