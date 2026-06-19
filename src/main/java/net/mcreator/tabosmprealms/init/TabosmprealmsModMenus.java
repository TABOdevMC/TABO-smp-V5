
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tabosmprealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.tabosmprealms.world.inventory.WorldGuiMenu;
import net.mcreator.tabosmprealms.world.inventory.ShopMenu;
import net.mcreator.tabosmprealms.TabosmprealmsMod;

public class TabosmprealmsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TabosmprealmsMod.MODID);
	public static final RegistryObject<MenuType<WorldGuiMenu>> WORLD_GUI = REGISTRY.register("world_gui", () -> IForgeMenuType.create(WorldGuiMenu::new));
	public static final RegistryObject<MenuType<ShopMenu>> SHOP = REGISTRY.register("shop", () -> IForgeMenuType.create(ShopMenu::new));
}
