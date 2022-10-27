
package net.mcreator.animecross.network;

import net.mcreator.animecross.AnimecrossworkspaceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TempMove2DELETETHISMessage {

	int type, pressedms;

	public TempMove2DELETETHISMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public TempMove2DELETETHISMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(TempMove2DELETETHISMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(TempMove2DELETETHISMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			TempMove2DELETETHISOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AnimecrossworkspaceMod.addNetworkMessage(TempMove2DELETETHISMessage.class, TempMove2DELETETHISMessage::buffer,
				TempMove2DELETETHISMessage::new, TempMove2DELETETHISMessage::handler);
	}

}
