
package net.mcreator.animecross.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.animecross.world.inventory.MainInfoMenu;
import net.mcreator.animecross.procedures.StrengthbuyProcedure;
import net.mcreator.animecross.procedures.SpeedbuyProcedure;
import net.mcreator.animecross.procedures.OpenmasteryProcedure;
import net.mcreator.animecross.procedures.BuystaminaProcedure;
import net.mcreator.animecross.procedures.BuypowerProcedure;
import net.mcreator.animecross.procedures.BuyhealthProcedure;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MainInfoButtonMessage {
	private final int buttonID, x, y, z;

	public MainInfoButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MainInfoButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MainInfoButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MainInfoButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MainInfoMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BuyhealthProcedure.execute(entity);
		}
		if (buttonID == 1) {

			OpenmasteryProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			StrengthbuyProcedure.execute(entity);
		}
		if (buttonID == 3) {

			SpeedbuyProcedure.execute(entity);
		}
		if (buttonID == 4) {

			BuypowerProcedure.execute(entity);
		}
		if (buttonID == 5) {

			BuystaminaProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AnimecrossworkspaceMod.addNetworkMessage(MainInfoButtonMessage.class, MainInfoButtonMessage::buffer, MainInfoButtonMessage::new,
				MainInfoButtonMessage::handler);
	}
}
