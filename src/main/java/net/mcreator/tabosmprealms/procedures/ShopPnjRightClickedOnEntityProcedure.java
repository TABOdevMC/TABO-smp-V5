package net.mcreator.tabosmprealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.tabosmprealms.init.TabosmprealmsModItems;
import net.mcreator.tabosmprealms.entity.ShopPnjEntity;

public class ShopPnjRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TabosmprealmsModItems.PNJ_CONFIG_WAND.get()) {
			if ((entity instanceof ShopPnjEntity _datEntS ? _datEntS.getEntityData().get(ShopPnjEntity.DATA_Type) : "").equals("")) {
				if (entity instanceof ShopPnjEntity _datEntSetS)
					_datEntSetS.getEntityData().set(ShopPnjEntity.DATA_Type, "farmer");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Set pnj job to \"farmer\""), false);
			} else if ((entity instanceof ShopPnjEntity _datEntS ? _datEntS.getEntityData().get(ShopPnjEntity.DATA_Type) : "").equals("farmer")) {
				if (entity instanceof ShopPnjEntity _datEntSetS)
					_datEntSetS.getEntityData().set(ShopPnjEntity.DATA_Type, "hunter");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Set pnj job to \"hunter\""), false);
			} else if ((entity instanceof ShopPnjEntity _datEntS ? _datEntS.getEntityData().get(ShopPnjEntity.DATA_Type) : "").equals("hunter")) {
				if (entity instanceof ShopPnjEntity _datEntSetS)
					_datEntSetS.getEntityData().set(ShopPnjEntity.DATA_Type, "miner");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Set pnj job to \"miner\""), false);
			} else if ((entity instanceof ShopPnjEntity _datEntS ? _datEntS.getEntityData().get(ShopPnjEntity.DATA_Type) : "").equals("miner")) {
				if (entity instanceof ShopPnjEntity _datEntSetS)
					_datEntSetS.getEntityData().set(ShopPnjEntity.DATA_Type, "");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Set pnj job to \"no\""), false);
			} else {
				if (entity instanceof ShopPnjEntity _datEntSetS)
					_datEntSetS.getEntityData().set(ShopPnjEntity.DATA_Type, " ");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Set pnj job to \"no\""), false);
			}
		} else {
			OpenShopProcedure.execute(world, x, y, z, entity, sourceentity, entity instanceof ShopPnjEntity _datEntS ? _datEntS.getEntityData().get(ShopPnjEntity.DATA_Type) : "");
		}
	}
}
