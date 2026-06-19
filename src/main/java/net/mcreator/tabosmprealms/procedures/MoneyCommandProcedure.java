package net.mcreator.tabosmprealms.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.tabosmprealms.network.TabosmprealmsModVariables;

public class MoneyCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Monnaie : " + (entity.getCapability(TabosmprealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TabosmprealmsModVariables.PlayerVariables())).Money + " $")), false);
	}
}
