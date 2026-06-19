package net.mcreator.tabosmprealms.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.registries.BuiltInRegistries;

public class ShopConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;

	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;
	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;
	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;

	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;
	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;
	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;

	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;
	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;
	public static final ForgeConfigSpec.ConfigValue<String> ITEM;
	public static final ForgeConfigSpec.ConfigValue<Double> PRICE;
	static {
		BUILDER.push("farmer");
		BUILDER.push("item-1");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.push("item-2");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.push("item-3");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.pop();
		BUILDER.push("miner");
		BUILDER.push("item-1");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.push("item-2");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.push("item-3");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.pop();
		BUILDER.push("hunter");
		BUILDER.push("item-1");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.push("item-2");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.push("item-3");
		ITEM = BUILDER.comment("Item").define("item", BuiltInRegistries.ITEM.getKey(Blocks.AIR.asItem()).toString());
		PRICE = BUILDER.comment("Price").define("price", (double) 0);
		BUILDER.pop();
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
