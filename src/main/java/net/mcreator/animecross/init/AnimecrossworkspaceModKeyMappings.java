
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.animecross.network.WadoBiteToggleMessage;
import net.mcreator.animecross.network.UseAbilityMessage;
import net.mcreator.animecross.network.TestingMessage;
import net.mcreator.animecross.network.Testing4Message;
import net.mcreator.animecross.network.Testing3Message;
import net.mcreator.animecross.network.Testing2Message;
import net.mcreator.animecross.network.TempMove2DELETETHISMessage;
import net.mcreator.animecross.network.SwitchAbilityBindMessage;
import net.mcreator.animecross.network.StringSwingMessage;
import net.mcreator.animecross.network.ShootODMStringMessage;
import net.mcreator.animecross.network.OpenfightingstylerMessage;
import net.mcreator.animecross.network.OpenInfoMessage;
import net.mcreator.animecross.network.KiBlastMessage;
import net.mcreator.animecross.network.JetFeetMessage;
import net.mcreator.animecross.network.FlyMessage;
import net.mcreator.animecross.network.EsperFloatMessage;
import net.mcreator.animecross.network.DivergentFistMessage;
import net.mcreator.animecross.network.DisplaySelfEvilSpiritMessage;
import net.mcreator.animecross.network.ChargePowerMessage;
import net.mcreator.animecross.network.BombMove1Message;
import net.mcreator.animecross.AnimecrossworkspaceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AnimecrossworkspaceModKeyMappings {
	public static final KeyMapping OPEN_INFO = new KeyMapping("key.animecrossworkspace.open_info", GLFW.GLFW_KEY_I, "key.categories.animecross");
	public static final KeyMapping DISPLAY_SELF_EVIL_SPIRIT = new KeyMapping("key.animecrossworkspace.display_self_evil_spirit", GLFW.GLFW_KEY_T,
			"key.categories.animecross");
	public static final KeyMapping SHOOT_ODM_STRING = new KeyMapping("key.animecrossworkspace.shoot_odm_string", GLFW.GLFW_KEY_Z,
			"key.categories.animecross");
	public static final KeyMapping SWITCH_ABILITY_BIND = new KeyMapping("key.animecrossworkspace.switch_ability_bind", GLFW.GLFW_KEY_R,
			"key.categories.animecross");
	public static final KeyMapping USE_ABILITY = new KeyMapping("key.animecrossworkspace.use_ability", GLFW.GLFW_KEY_C, "key.categories.animecross");
	public static final KeyMapping ESPER_FLOAT = new KeyMapping("key.animecrossworkspace.esper_float", GLFW.GLFW_KEY_V, "key.categories.animecross");
	public static final KeyMapping CHARGE_POWER = new KeyMapping("key.animecrossworkspace.charge_power", GLFW.GLFW_KEY_X,
			"key.categories.animecross");
	public static final KeyMapping JET_FEET = new KeyMapping("key.animecrossworkspace.jet_feet", GLFW.GLFW_KEY_N, "key.categories.animecross");
	public static final KeyMapping DIVERGENT_FIST = new KeyMapping("key.animecrossworkspace.divergent_fist", GLFW.GLFW_KEY_V,
			"key.categories.animecross");
	public static final KeyMapping KI_BLAST = new KeyMapping("key.animecrossworkspace.ki_blast", GLFW.GLFW_KEY_K, "key.categories.animecross");
	public static final KeyMapping FLY = new KeyMapping("key.animecrossworkspace.fly", GLFW.GLFW_KEY_N, "key.categories.animecross");
	public static final KeyMapping OPENFIGHTINGSTYLER = new KeyMapping("key.animecrossworkspace.openfightingstyler", GLFW.GLFW_KEY_O,
			"key.categories.animecross");
	public static final KeyMapping WADO_BITE_TOGGLE = new KeyMapping("key.animecrossworkspace.wado_bite_toggle", GLFW.GLFW_KEY_H,
			"key.categories.animecross");
	public static final KeyMapping TESTING = new KeyMapping("key.animecrossworkspace.testing", GLFW.GLFW_KEY_G, "key.categories.misc");
	public static final KeyMapping TESTING_2 = new KeyMapping("key.animecrossworkspace.testing_2", GLFW.GLFW_KEY_B, "key.categories.misc");
	public static final KeyMapping TESTING_3 = new KeyMapping("key.animecrossworkspace.testing_3", GLFW.GLFW_KEY_X, "key.categories.misc");
	public static final KeyMapping TESTING_4 = new KeyMapping("key.animecrossworkspace.testing_4", GLFW.GLFW_KEY_H, "key.categories.misc");
	public static final KeyMapping STRING_SWING = new KeyMapping("key.animecrossworkspace.string_swing", GLFW.GLFW_KEY_Z, "key.categories.misc");
	public static final KeyMapping BOMB_MOVE_1 = new KeyMapping("key.animecrossworkspace.bomb_move_1", GLFW.GLFW_KEY_V, "key.categories.misc");
	public static final KeyMapping TEMP_MOVE_2_DELETETHIS = new KeyMapping("key.animecrossworkspace.temp_move_2_deletethis", GLFW.GLFW_KEY_K,
			"key.categories.misc");
	private static long ESPER_FLOAT_LASTPRESS = 0;
	private static long FLY_LASTPRESS = 0;
	private static long STRING_SWING_LASTPRESS = 0;
	private static long BOMB_MOVE_1_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(OPEN_INFO);
		ClientRegistry.registerKeyBinding(DISPLAY_SELF_EVIL_SPIRIT);
		ClientRegistry.registerKeyBinding(SHOOT_ODM_STRING);
		ClientRegistry.registerKeyBinding(SWITCH_ABILITY_BIND);
		ClientRegistry.registerKeyBinding(USE_ABILITY);
		ClientRegistry.registerKeyBinding(ESPER_FLOAT);
		ClientRegistry.registerKeyBinding(CHARGE_POWER);
		ClientRegistry.registerKeyBinding(JET_FEET);
		ClientRegistry.registerKeyBinding(DIVERGENT_FIST);
		ClientRegistry.registerKeyBinding(KI_BLAST);
		ClientRegistry.registerKeyBinding(FLY);
		ClientRegistry.registerKeyBinding(OPENFIGHTINGSTYLER);
		ClientRegistry.registerKeyBinding(WADO_BITE_TOGGLE);
		ClientRegistry.registerKeyBinding(TESTING);
		ClientRegistry.registerKeyBinding(TESTING_2);
		ClientRegistry.registerKeyBinding(TESTING_3);
		ClientRegistry.registerKeyBinding(TESTING_4);
		ClientRegistry.registerKeyBinding(STRING_SWING);
		ClientRegistry.registerKeyBinding(BOMB_MOVE_1);
		ClientRegistry.registerKeyBinding(TEMP_MOVE_2_DELETETHIS);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == OPEN_INFO.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new OpenInfoMessage(0, 0));
						OpenInfoMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == DISPLAY_SELF_EVIL_SPIRIT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new DisplaySelfEvilSpiritMessage(0, 0));
						DisplaySelfEvilSpiritMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == SHOOT_ODM_STRING.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new ShootODMStringMessage(0, 0));
						ShootODMStringMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == SWITCH_ABILITY_BIND.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new SwitchAbilityBindMessage(0, 0));
						SwitchAbilityBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == USE_ABILITY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new UseAbilityMessage(0, 0));
						UseAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == ESPER_FLOAT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new EsperFloatMessage(0, 0));
						EsperFloatMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						ESPER_FLOAT_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - ESPER_FLOAT_LASTPRESS);
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new EsperFloatMessage(1, dt));
						EsperFloatMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == CHARGE_POWER.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new ChargePowerMessage(0, 0));
						ChargePowerMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == JET_FEET.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new JetFeetMessage(0, 0));
						JetFeetMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == DIVERGENT_FIST.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new DivergentFistMessage(0, 0));
						DivergentFistMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == KI_BLAST.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new KiBlastMessage(0, 0));
						KiBlastMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == FLY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FlyMessage(0, 0));
						FlyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						FLY_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - FLY_LASTPRESS);
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FlyMessage(1, dt));
						FlyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == OPENFIGHTINGSTYLER.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new OpenfightingstylerMessage(0, 0));
						OpenfightingstylerMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WADO_BITE_TOGGLE.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new WadoBiteToggleMessage(0, 0));
						WadoBiteToggleMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == TESTING.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new TestingMessage(0, 0));
						TestingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == TESTING_2.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Testing2Message(0, 0));
						Testing2Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == TESTING_3.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Testing3Message(0, 0));
						Testing3Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == TESTING_4.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Testing4Message(0, 0));
						Testing4Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == STRING_SWING.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new StringSwingMessage(0, 0));
						StringSwingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						STRING_SWING_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - STRING_SWING_LASTPRESS);
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new StringSwingMessage(1, dt));
						StringSwingMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == BOMB_MOVE_1.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						BOMB_MOVE_1_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - BOMB_MOVE_1_LASTPRESS);
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new BombMove1Message(1, dt));
						BombMove1Message.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == TEMP_MOVE_2_DELETETHIS.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new TempMove2DELETETHISMessage(0, 0));
						TempMove2DELETETHISMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
