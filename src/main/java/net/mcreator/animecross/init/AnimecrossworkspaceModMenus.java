
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimecrossworkspaceModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<MainInfoMenu> MAIN_INFO = register("main_info", (id, inv, extraData) -> new MainInfoMenu(id, inv, extraData));
	public static final MenuType<ShenronGifMenu> SHENRON_GIF = register("shenron_gif",
			(id, inv, extraData) -> new ShenronGifMenu(id, inv, extraData));
	public static final MenuType<MasteryguiMenu> MASTERYGUI = register("masterygui", (id, inv, extraData) -> new MasteryguiMenu(id, inv, extraData));
	public static final MenuType<TALKTOMUZANMenu> TALKTOMUZAN = register("talktomuzan",
			(id, inv, extraData) -> new TALKTOMUZANMenu(id, inv, extraData));
	public static final MenuType<GojobecomeasourcererMenu> GOJOBECOMEASOURCERER = register("gojobecomeasourcerer",
			(id, inv, extraData) -> new GojobecomeasourcererMenu(id, inv, extraData));
	public static final MenuType<FireReleaseGuiMenu> FIRE_RELEASE_GUI = register("fire_release_gui",
			(id, inv, extraData) -> new FireReleaseGuiMenu(id, inv, extraData));
	public static final MenuType<NobaraguiMenu> NOBARAGUI = register("nobaragui", (id, inv, extraData) -> new NobaraguiMenu(id, inv, extraData));
	public static final MenuType<MasterroshiguiMenu> MASTERROSHIGUI = register("masterroshigui",
			(id, inv, extraData) -> new MasterroshiguiMenu(id, inv, extraData));
	public static final MenuType<Masterroshigui2Menu> MASTERROSHIGUI_2 = register("masterroshigui_2",
			(id, inv, extraData) -> new Masterroshigui2Menu(id, inv, extraData));
	public static final MenuType<Kitrainingpaper1Menu> KITRAININGPAPER_1 = register("kitrainingpaper_1",
			(id, inv, extraData) -> new Kitrainingpaper1Menu(id, inv, extraData));
	public static final MenuType<TALKGUIFIREFORCECAPTAINMenu> TALKGUIFIREFORCECAPTAIN = register("talkguifireforcecaptain",
			(id, inv, extraData) -> new TALKGUIFIREFORCECAPTAINMenu(id, inv, extraData));
	public static final MenuType<RedruitpapersguiMenu> REDRUITPAPERSGUI = register("redruitpapersgui",
			(id, inv, extraData) -> new RedruitpapersguiMenu(id, inv, extraData));
	public static final MenuType<SaitamaguiMenu> SAITAMAGUI = register("saitamagui", (id, inv, extraData) -> new SaitamaguiMenu(id, inv, extraData));
	public static final MenuType<JiraiyaguiMenu> JIRAIYAGUI = register("jiraiyagui", (id, inv, extraData) -> new JiraiyaguiMenu(id, inv, extraData));
	public static final MenuType<ESCANORGETSUNSHINEMenu> ESCANORGETSUNSHINE = register("escanorgetsunshine",
			(id, inv, extraData) -> new ESCANORGETSUNSHINEMenu(id, inv, extraData));
	public static final MenuType<EscanorteachsunshineMenu> ESCANORTEACHSUNSHINE = register("escanorteachsunshine",
			(id, inv, extraData) -> new EscanorteachsunshineMenu(id, inv, extraData));
	public static final MenuType<EscanoriseeMenu> ESCANORISEE = register("escanorisee",
			(id, inv, extraData) -> new EscanoriseeMenu(id, inv, extraData));
	public static final MenuType<InfoguiMenu> INFOGUI = register("infogui", (id, inv, extraData) -> new InfoguiMenu(id, inv, extraData));
	public static final MenuType<Meliodas2Menu> MELIODAS_2 = register("meliodas_2", (id, inv, extraData) -> new Meliodas2Menu(id, inv, extraData));
	public static final MenuType<FightingstyleguiMenu> FIGHTINGSTYLEGUI = register("fightingstylegui",
			(id, inv, extraData) -> new FightingstyleguiMenu(id, inv, extraData));
	public static final MenuType<Silverfanggui1Menu> SILVERFANGGUI_1 = register("silverfanggui_1",
			(id, inv, extraData) -> new Silverfanggui1Menu(id, inv, extraData));
	public static final MenuType<YamiguiMenu> YAMIGUI = register("yamigui", (id, inv, extraData) -> new YamiguiMenu(id, inv, extraData));
	public static final MenuType<SaiyanTrainingMenu> SAIYAN_TRAINING = register("saiyan_training",
			(id, inv, extraData) -> new SaiyanTrainingMenu(id, inv, extraData));
	public static final MenuType<BountyPaperMenu> BOUNTY_PAPER = register("bounty_paper",
			(id, inv, extraData) -> new BountyPaperMenu(id, inv, extraData));
	public static final MenuType<LadyTamayoGUIMenu> LADY_TAMAYO_GUI = register("lady_tamayo_gui",
			(id, inv, extraData) -> new LadyTamayoGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
