
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.animecross.client.gui.YamiguiScreen;
import net.mcreator.animecross.client.gui.TALKTOMUZANScreen;
import net.mcreator.animecross.client.gui.TALKGUIFIREFORCECAPTAINScreen;
import net.mcreator.animecross.client.gui.Silverfanggui1Screen;
import net.mcreator.animecross.client.gui.ShenronGifScreen;
import net.mcreator.animecross.client.gui.SaiyanTrainingScreen;
import net.mcreator.animecross.client.gui.SaitamaguiScreen;
import net.mcreator.animecross.client.gui.RedruitpapersguiScreen;
import net.mcreator.animecross.client.gui.NobaraguiScreen;
import net.mcreator.animecross.client.gui.Meliodas2Screen;
import net.mcreator.animecross.client.gui.MasteryguiScreen;
import net.mcreator.animecross.client.gui.MasterroshiguiScreen;
import net.mcreator.animecross.client.gui.Masterroshigui2Screen;
import net.mcreator.animecross.client.gui.MainInfoScreen;
import net.mcreator.animecross.client.gui.LadyTamayoGUIScreen;
import net.mcreator.animecross.client.gui.Kitrainingpaper1Screen;
import net.mcreator.animecross.client.gui.JiraiyaguiScreen;
import net.mcreator.animecross.client.gui.InfoguiScreen;
import net.mcreator.animecross.client.gui.GojobecomeasourcererScreen;
import net.mcreator.animecross.client.gui.FireReleaseGuiScreen;
import net.mcreator.animecross.client.gui.FightingstyleguiScreen;
import net.mcreator.animecross.client.gui.EscanorteachsunshineScreen;
import net.mcreator.animecross.client.gui.EscanoriseeScreen;
import net.mcreator.animecross.client.gui.ESCANORGETSUNSHINEScreen;
import net.mcreator.animecross.client.gui.BountyPaperScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnimecrossworkspaceModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AnimecrossworkspaceModMenus.MAIN_INFO, MainInfoScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.SHENRON_GIF, ShenronGifScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.MASTERYGUI, MasteryguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.TALKTOMUZAN, TALKTOMUZANScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.GOJOBECOMEASOURCERER, GojobecomeasourcererScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.FIRE_RELEASE_GUI, FireReleaseGuiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.NOBARAGUI, NobaraguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.MASTERROSHIGUI, MasterroshiguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.MASTERROSHIGUI_2, Masterroshigui2Screen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.KITRAININGPAPER_1, Kitrainingpaper1Screen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.TALKGUIFIREFORCECAPTAIN, TALKGUIFIREFORCECAPTAINScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.REDRUITPAPERSGUI, RedruitpapersguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.SAITAMAGUI, SaitamaguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.JIRAIYAGUI, JiraiyaguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.ESCANORGETSUNSHINE, ESCANORGETSUNSHINEScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.ESCANORTEACHSUNSHINE, EscanorteachsunshineScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.ESCANORISEE, EscanoriseeScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.INFOGUI, InfoguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.MELIODAS_2, Meliodas2Screen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.FIGHTINGSTYLEGUI, FightingstyleguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.SILVERFANGGUI_1, Silverfanggui1Screen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.YAMIGUI, YamiguiScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.SAIYAN_TRAINING, SaiyanTrainingScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.BOUNTY_PAPER, BountyPaperScreen::new);
			MenuScreens.register(AnimecrossworkspaceModMenus.LADY_TAMAYO_GUI, LadyTamayoGUIScreen::new);
		});
	}
}
