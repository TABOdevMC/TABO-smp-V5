
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tabosmprealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.tabosmprealms.item.PnjConfigWandItem;
import net.mcreator.tabosmprealms.TabosmprealmsMod;

public class TabosmprealmsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TabosmprealmsMod.MODID);
	public static final RegistryObject<Item> SHOP_PNJ_SPAWN_EGG = REGISTRY.register("shop_pnj_spawn_egg", () -> new ForgeSpawnEggItem(TabosmprealmsModEntities.SHOP_PNJ, -6684826, -3342490, new Item.Properties()));
	public static final RegistryObject<Item> PNJ_CONFIG_WAND = REGISTRY.register("pnj_config_wand", () -> new PnjConfigWandItem());
	// Start of user code block custom items
	// End of user code block custom items
}
