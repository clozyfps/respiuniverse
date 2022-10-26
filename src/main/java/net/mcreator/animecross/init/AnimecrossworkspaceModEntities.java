
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.entity.ZoroEntity;
import net.mcreator.animecross.entity.ZenitsuEntity;
import net.mcreator.animecross.entity.ZabuzaEntity;
import net.mcreator.animecross.entity.YoruswingEntity;
import net.mcreator.animecross.entity.YorEntity;
import net.mcreator.animecross.entity.YamiEntity;
import net.mcreator.animecross.entity.YahabaEntity;
import net.mcreator.animecross.entity.WoodthrowhanamiEntity;
import net.mcreator.animecross.entity.WhiteDivineDogEntity;
import net.mcreator.animecross.entity.WeakGoblinEntity;
import net.mcreator.animecross.entity.VaccineManEntity;
import net.mcreator.animecross.entity.UzuiTengenEntity;
import net.mcreator.animecross.entity.TogeInumakiEntity;
import net.mcreator.animecross.entity.ThunderclapandflashEntity;
import net.mcreator.animecross.entity.TatsumakiEntity;
import net.mcreator.animecross.entity.TanjiroKamadoEntity;
import net.mcreator.animecross.entity.SukunaEntity;
import net.mcreator.animecross.entity.StrongGoblinEntity;
import net.mcreator.animecross.entity.SoulReaperEntity;
import net.mcreator.animecross.entity.SonGokuEntity;
import net.mcreator.animecross.entity.SmackDownArrowEntity;
import net.mcreator.animecross.entity.SleepEntity;
import net.mcreator.animecross.entity.SixfoldEntity;
import net.mcreator.animecross.entity.SisterLillyEntity;
import net.mcreator.animecross.entity.SilverFangEntity;
import net.mcreator.animecross.entity.SilverFangDojoStudentEntity;
import net.mcreator.animecross.entity.ShinraEntity;
import net.mcreator.animecross.entity.ShigeoEntity;
import net.mcreator.animecross.entity.ShanksEntity;
import net.mcreator.animecross.entity.ScoutRegimentMemberEntity;
import net.mcreator.animecross.entity.SasukeUchihaEntity;
import net.mcreator.animecross.entity.SaoFloor1BossEntity;
import net.mcreator.animecross.entity.SandShinobiEntity;
import net.mcreator.animecross.entity.SaitamaEntity;
import net.mcreator.animecross.entity.RengokuEntity;
import net.mcreator.animecross.entity.PyrobombEntity;
import net.mcreator.animecross.entity.PurgatoryflamemoveEntity;
import net.mcreator.animecross.entity.PowerEntity;
import net.mcreator.animecross.entity.PochitaEntity;
import net.mcreator.animecross.entity.PirateEntity;
import net.mcreator.animecross.entity.PikaPikaRangedEntity;
import net.mcreator.animecross.entity.OdmstringEntity;
import net.mcreator.animecross.entity.NormalpunchEntity;
import net.mcreator.animecross.entity.NoelleSilvaEntity;
import net.mcreator.animecross.entity.NobaraEntity;
import net.mcreator.animecross.entity.NezukoEntity;
import net.mcreator.animecross.entity.NeedleEntity;
import net.mcreator.animecross.entity.NarutocloneEntity;
import net.mcreator.animecross.entity.NarutoUzumakiEntity;
import net.mcreator.animecross.entity.MuzanKibutsujiEntity;
import net.mcreator.animecross.entity.MonkeyDLuffyEntity;
import net.mcreator.animecross.entity.MikeyEntity;
import net.mcreator.animecross.entity.MihawkEntity;
import net.mcreator.animecross.entity.MeliodasEntity;
import net.mcreator.animecross.entity.MeliodasAssaultModeEntity;
import net.mcreator.animecross.entity.MegumiFushiguroEntity;
import net.mcreator.animecross.entity.MasterRoshiEntity;
import net.mcreator.animecross.entity.MarineEntity;
import net.mcreator.animecross.entity.MarineCaptainEntity;
import net.mcreator.animecross.entity.MahitoEntity;
import net.mcreator.animecross.entity.MagicBanditEntity;
import net.mcreator.animecross.entity.MadaraUchihaEntity;
import net.mcreator.animecross.entity.LowRankEvilSpiritEntity;
import net.mcreator.animecross.entity.LeviEntity;
import net.mcreator.animecross.entity.LeafShinobiEntity;
import net.mcreator.animecross.entity.LadyTamayoEntity;
import net.mcreator.animecross.entity.KokushiboEntity;
import net.mcreator.animecross.entity.KoketsuArrowAwakeningEntity;
import net.mcreator.animecross.entity.KnotEntityEntity;
import net.mcreator.animecross.entity.KiritoEntity;
import net.mcreator.animecross.entity.KidBuuEntity;
import net.mcreator.animecross.entity.KiblastrangeditemEntity;
import net.mcreator.animecross.entity.JiraiyaEntity;
import net.mcreator.animecross.entity.ItadoriEntity;
import net.mcreator.animecross.entity.InsanePsychicEntity;
import net.mcreator.animecross.entity.InfernoEntity;
import net.mcreator.animecross.entity.IchigoEntity;
import net.mcreator.animecross.entity.HolywaterfistEntity;
import net.mcreator.animecross.entity.HolydragonEntity;
import net.mcreator.animecross.entity.HollowpurpleEntity;
import net.mcreator.animecross.entity.HollowpurpkleEntity;
import net.mcreator.animecross.entity.HanamiEntity;
import net.mcreator.animecross.entity.GyutaroEntity;
import net.mcreator.animecross.entity.GumGumPistolEntity;
import net.mcreator.animecross.entity.GrimoireGiverEntity;
import net.mcreator.animecross.entity.GojoEntity;
import net.mcreator.animecross.entity.GatlingrangeditemEntity;
import net.mcreator.animecross.entity.GarouEntity;
import net.mcreator.animecross.entity.FubukiEntity;
import net.mcreator.animecross.entity.FireballprojectileEntity;
import net.mcreator.animecross.entity.FireForceCaptainEntity;
import net.mcreator.animecross.entity.ExplodeEntity;
import net.mcreator.animecross.entity.ExlodingBloodBombEntity;
import net.mcreator.animecross.entity.EscanorEntity;
import net.mcreator.animecross.entity.DragonFireEntity;
import net.mcreator.animecross.entity.DontMoveEntity;
import net.mcreator.animecross.entity.DioEntity;
import net.mcreator.animecross.entity.DestructoDiskEntity;
import net.mcreator.animecross.entity.DemonEntity;
import net.mcreator.animecross.entity.DekuEntity;
import net.mcreator.animecross.entity.CursedSpiritEntity;
import net.mcreator.animecross.entity.CruelsunproEntity;
import net.mcreator.animecross.entity.CosmicblastEntity;
import net.mcreator.animecross.entity.CosmicGarouEntity;
import net.mcreator.animecross.entity.CosmicFearGarouEntity;
import net.mcreator.animecross.entity.CloneerathealEntity;
import net.mcreator.animecross.entity.BorosThirdFormEntity;
import net.mcreator.animecross.entity.BorosSecondFormEntity;
import net.mcreator.animecross.entity.BorosEntity;
import net.mcreator.animecross.entity.BlackslashsEntity;
import net.mcreator.animecross.entity.BlackDivineDogEntity;
import net.mcreator.animecross.entity.BatHollowEntity;
import net.mcreator.animecross.entity.AstaEntity;
import net.mcreator.animecross.entity.ArthurBoyleEntity;
import net.mcreator.animecross.entity.ArkabilityrangeditemEntity;
import net.mcreator.animecross.entity.AnnitypeEntity;
import net.mcreator.animecross.entity.AlienEntity;
import net.mcreator.animecross.entity.AkazaEntity;
import net.mcreator.animecross.entity.AirtyperangedEntity;
import net.mcreator.animecross.AnimecrossworkspaceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimecrossworkspaceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AnimecrossworkspaceMod.MODID);
	public static final RegistryObject<EntityType<OdmstringEntity>> ODMSTRING = register("projectile_odmstring",
			EntityType.Builder.<OdmstringEntity>of(OdmstringEntity::new, MobCategory.MISC).setCustomClientFactory(OdmstringEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GumGumPistolEntity>> GUM_GUM_PISTOL = register("projectile_gum_gum_pistol",
			EntityType.Builder.<GumGumPistolEntity>of(GumGumPistolEntity::new, MobCategory.MISC).setCustomClientFactory(GumGumPistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MarineEntity>> MARINE = register("marine",
			EntityType.Builder.<MarineEntity>of(MarineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MarineEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GatlingrangeditemEntity>> GATLINGRANGEDITEM = register("projectile_gatlingrangeditem",
			EntityType.Builder.<GatlingrangeditemEntity>of(GatlingrangeditemEntity::new, MobCategory.MISC)
					.setCustomClientFactory(GatlingrangeditemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ScoutRegimentMemberEntity>> SCOUT_REGIMENT_MEMBER = register("scout_regiment_member",
			EntityType.Builder.<ScoutRegimentMemberEntity>of(ScoutRegimentMemberEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ScoutRegimentMemberEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireballprojectileEntity>> FIREBALLPROJECTILE = register("projectile_fireballprojectile",
			EntityType.Builder.<FireballprojectileEntity>of(FireballprojectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(FireballprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShigeoEntity>> SHIGEO = register("shigeo",
			EntityType.Builder.<ShigeoEntity>of(ShigeoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShigeoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PyrobombEntity>> PYROBOMB = register("projectile_pyrobomb",
			EntityType.Builder.<PyrobombEntity>of(PyrobombEntity::new, MobCategory.MISC).setCustomClientFactory(PyrobombEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LowRankEvilSpiritEntity>> LOW_RANK_EVIL_SPIRIT = register("low_rank_evil_spirit",
			EntityType.Builder.<LowRankEvilSpiritEntity>of(LowRankEvilSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LowRankEvilSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LeviEntity>> LEVI = register("levi",
			EntityType.Builder.<LeviEntity>of(LeviEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(LeviEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DragonFireEntity>> DRAGON_FIRE = register("projectile_dragon_fire",
			EntityType.Builder.<DragonFireEntity>of(DragonFireEntity::new, MobCategory.MISC).setCustomClientFactory(DragonFireEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SasukeUchihaEntity>> SASUKE_UCHIHA = register("sasuke_uchiha",
			EntityType.Builder.<SasukeUchihaEntity>of(SasukeUchihaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SasukeUchihaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NarutoUzumakiEntity>> NARUTO_UZUMAKI = register("naruto_uzumaki",
			EntityType.Builder.<NarutoUzumakiEntity>of(NarutoUzumakiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NarutoUzumakiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MadaraUchihaEntity>> MADARA_UCHIHA = register("madara_uchiha",
			EntityType.Builder.<MadaraUchihaEntity>of(MadaraUchihaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadaraUchihaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AstaEntity>> ASTA = register("asta",
			EntityType.Builder.<AstaEntity>of(AstaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AstaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackslashsEntity>> BLACKSLASHS = register("projectile_blackslashs",
			EntityType.Builder.<BlackslashsEntity>of(BlackslashsEntity::new, MobCategory.MISC).setCustomClientFactory(BlackslashsEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YamiEntity>> YAMI = register("yami",
			EntityType.Builder.<YamiEntity>of(YamiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(YamiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MikeyEntity>> MIKEY = register("mikey",
			EntityType.Builder.<MikeyEntity>of(MikeyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MikeyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SandShinobiEntity>> SAND_SHINOBI = register("sand_shinobi",
			EntityType.Builder.<SandShinobiEntity>of(SandShinobiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SandShinobiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HollowpurpkleEntity>> HOLLOWPURPKLE = register("projectile_hollowpurpkle",
			EntityType.Builder.<HollowpurpkleEntity>of(HollowpurpkleEntity::new, MobCategory.MISC).setCustomClientFactory(HollowpurpkleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LeafShinobiEntity>> LEAF_SHINOBI = register("leaf_shinobi",
			EntityType.Builder.<LeafShinobiEntity>of(LeafShinobiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LeafShinobiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TanjiroKamadoEntity>> TANJIRO_KAMADO = register("tanjiro_kamado",
			EntityType.Builder.<TanjiroKamadoEntity>of(TanjiroKamadoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TanjiroKamadoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZabuzaEntity>> ZABUZA = register("zabuza",
			EntityType.Builder.<ZabuzaEntity>of(ZabuzaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ZabuzaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WeakGoblinEntity>> WEAK_GOBLIN = register("weak_goblin",
			EntityType.Builder.<WeakGoblinEntity>of(WeakGoblinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeakGoblinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YahabaEntity>> YAHABA = register("yahaba",
			EntityType.Builder.<YahabaEntity>of(YahabaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(YahabaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SmackDownArrowEntity>> SMACK_DOWN_ARROW = register("projectile_smack_down_arrow",
			EntityType.Builder.<SmackDownArrowEntity>of(SmackDownArrowEntity::new, MobCategory.MISC).setCustomClientFactory(SmackDownArrowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KoketsuArrowAwakeningEntity>> KOKETSU_ARROW_AWAKENING = register(
			"projectile_koketsu_arrow_awakening",
			EntityType.Builder.<KoketsuArrowAwakeningEntity>of(KoketsuArrowAwakeningEntity::new, MobCategory.MISC)
					.setCustomClientFactory(KoketsuArrowAwakeningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NezukoEntity>> NEZUKO = register("nezuko",
			EntityType.Builder.<NezukoEntity>of(NezukoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NezukoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TatsumakiEntity>> TATSUMAKI = register("tatsumaki",
			EntityType.Builder.<TatsumakiEntity>of(TatsumakiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TatsumakiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExlodingBloodBombEntity>> EXLODING_BLOOD_BOMB = register("projectile_exloding_blood_bomb",
			EntityType.Builder.<ExlodingBloodBombEntity>of(ExlodingBloodBombEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ExlodingBloodBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MuzanKibutsujiEntity>> MUZAN_KIBUTSUJI = register("muzan_kibutsuji",
			EntityType.Builder.<MuzanKibutsujiEntity>of(MuzanKibutsujiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuzanKibutsujiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DioEntity>> DIO = register("dio",
			EntityType.Builder.<DioEntity>of(DioEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DioEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AlienEntity>> ALIEN = register("alien",
			EntityType.Builder.<AlienEntity>of(AlienEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AlienEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GyutaroEntity>> GYUTARO = register("gyutaro",
			EntityType.Builder.<GyutaroEntity>of(GyutaroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GyutaroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DemonEntity>> DEMON = register("demon",
			EntityType.Builder.<DemonEntity>of(DemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DemonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrimoireGiverEntity>> GRIMOIRE_GIVER = register("grimoire_giver",
			EntityType.Builder.<GrimoireGiverEntity>of(GrimoireGiverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrimoireGiverEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PirateEntity>> PIRATE = register("pirate",
			EntityType.Builder.<PirateEntity>of(PirateEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PirateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HolywaterfistEntity>> HOLYWATERFIST = register("projectile_holywaterfist",
			EntityType.Builder.<HolywaterfistEntity>of(HolywaterfistEntity::new, MobCategory.MISC).setCustomClientFactory(HolywaterfistEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HolydragonEntity>> HOLYDRAGON = register("projectile_holydragon",
			EntityType.Builder.<HolydragonEntity>of(HolydragonEntity::new, MobCategory.MISC).setCustomClientFactory(HolydragonEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NoelleSilvaEntity>> NOELLE_SILVA = register("noelle_silva",
			EntityType.Builder.<NoelleSilvaEntity>of(NoelleSilvaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NoelleSilvaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SaitamaEntity>> SAITAMA = register("saitama",
			EntityType.Builder.<SaitamaEntity>of(SaitamaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SaitamaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MonkeyDLuffyEntity>> MONKEY_D_LUFFY = register("monkey_d_luffy",
			EntityType.Builder.<MonkeyDLuffyEntity>of(MonkeyDLuffyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MonkeyDLuffyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GarouEntity>> GAROU = register("garou",
			EntityType.Builder.<GarouEntity>of(GarouEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GarouEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CosmicGarouEntity>> COSMIC_GAROU = register("cosmic_garou",
			EntityType.Builder.<CosmicGarouEntity>of(CosmicGarouEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmicGarouEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NarutocloneEntity>> NARUTOCLONE = register("narutoclone",
			EntityType.Builder.<NarutocloneEntity>of(NarutocloneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NarutocloneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneerathealEntity>> CLONEERATHEAL = register("cloneeratheal",
			EntityType.Builder.<CloneerathealEntity>of(CloneerathealEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneerathealEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InsanePsychicEntity>> INSANE_PSYCHIC = register("insane_psychic",
			EntityType.Builder.<InsanePsychicEntity>of(InsanePsychicEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InsanePsychicEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShinraEntity>> SHINRA = register("shinra",
			EntityType.Builder.<ShinraEntity>of(ShinraEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShinraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InfernoEntity>> INFERNO = register("inferno",
			EntityType.Builder.<InfernoEntity>of(InfernoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(InfernoEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<ArthurBoyleEntity>> ARTHUR_BOYLE = register("arthur_boyle",
			EntityType.Builder.<ArthurBoyleEntity>of(ArthurBoyleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArthurBoyleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YorEntity>> YOR = register("yor",
			EntityType.Builder.<YorEntity>of(YorEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(YorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GojoEntity>> GOJO = register("gojo",
			EntityType.Builder.<GojoEntity>of(GojoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GojoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SaoFloor1BossEntity>> SAO_FLOOR_1_BOSS = register("sao_floor_1_boss",
			EntityType.Builder.<SaoFloor1BossEntity>of(SaoFloor1BossEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SaoFloor1BossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ItadoriEntity>> ITADORI = register("itadori",
			EntityType.Builder.<ItadoriEntity>of(ItadoriEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ItadoriEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CursedSpiritEntity>> CURSED_SPIRIT = register("cursed_spirit",
			EntityType.Builder.<CursedSpiritEntity>of(CursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SukunaEntity>> SUKUNA = register("sukuna",
			EntityType.Builder.<SukunaEntity>of(SukunaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SukunaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NeedleEntity>> NEEDLE = register("projectile_needle",
			EntityType.Builder.<NeedleEntity>of(NeedleEntity::new, MobCategory.MISC).setCustomClientFactory(NeedleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NobaraEntity>> NOBARA = register("nobara",
			EntityType.Builder.<NobaraEntity>of(NobaraEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NobaraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HanamiEntity>> HANAMI = register("hanami",
			EntityType.Builder.<HanamiEntity>of(HanamiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HanamiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WoodthrowhanamiEntity>> WOODTHROWHANAMI = register("projectile_woodthrowhanami",
			EntityType.Builder.<WoodthrowhanamiEntity>of(WoodthrowhanamiEntity::new, MobCategory.MISC)
					.setCustomClientFactory(WoodthrowhanamiEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TogeInumakiEntity>> TOGE_INUMAKI = register("toge_inumaki",
			EntityType.Builder.<TogeInumakiEntity>of(TogeInumakiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TogeInumakiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExplodeEntity>> EXPLODE = register("projectile_explode",
			EntityType.Builder.<ExplodeEntity>of(ExplodeEntity::new, MobCategory.MISC).setCustomClientFactory(ExplodeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SleepEntity>> SLEEP = register("projectile_sleep",
			EntityType.Builder.<SleepEntity>of(SleepEntity::new, MobCategory.MISC).setCustomClientFactory(SleepEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DontMoveEntity>> DONT_MOVE = register("projectile_dont_move",
			EntityType.Builder.<DontMoveEntity>of(DontMoveEntity::new, MobCategory.MISC).setCustomClientFactory(DontMoveEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SonGokuEntity>> SON_GOKU = register("son_goku",
			EntityType.Builder.<SonGokuEntity>of(SonGokuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(50)
					.setUpdateInterval(3).setCustomClientFactory(SonGokuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MasterRoshiEntity>> MASTER_ROSHI = register("master_roshi",
			EntityType.Builder.<MasterRoshiEntity>of(MasterRoshiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MasterRoshiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KiblastrangeditemEntity>> KIBLASTRANGEDITEM = register("projectile_kiblastrangeditem",
			EntityType.Builder.<KiblastrangeditemEntity>of(KiblastrangeditemEntity::new, MobCategory.MISC)
					.setCustomClientFactory(KiblastrangeditemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StrongGoblinEntity>> STRONG_GOBLIN = register("strong_goblin",
			EntityType.Builder.<StrongGoblinEntity>of(StrongGoblinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StrongGoblinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireForceCaptainEntity>> FIRE_FORCE_CAPTAIN = register("fire_force_captain",
			EntityType.Builder.<FireForceCaptainEntity>of(FireForceCaptainEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireForceCaptainEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KiritoEntity>> KIRITO = register("kirito",
			EntityType.Builder.<KiritoEntity>of(KiritoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(KiritoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MarineCaptainEntity>> MARINE_CAPTAIN = register("marine_captain",
			EntityType.Builder.<MarineCaptainEntity>of(MarineCaptainEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarineCaptainEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeliodasEntity>> MELIODAS = register("meliodas",
			EntityType.Builder.<MeliodasEntity>of(MeliodasEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MeliodasEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeliodasAssaultModeEntity>> MELIODAS_ASSAULT_MODE = register("meliodas_assault_mode",
			EntityType.Builder.<MeliodasAssaultModeEntity>of(MeliodasAssaultModeEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MeliodasAssaultModeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NormalpunchEntity>> NORMALPUNCH = register("projectile_normalpunch",
			EntityType.Builder.<NormalpunchEntity>of(NormalpunchEntity::new, MobCategory.MISC).setCustomClientFactory(NormalpunchEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EscanorEntity>> ESCANOR = register("escanor",
			EntityType.Builder.<EscanorEntity>of(EscanorEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EscanorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JiraiyaEntity>> JIRAIYA = register("jiraiya",
			EntityType.Builder.<JiraiyaEntity>of(JiraiyaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(JiraiyaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CruelsunproEntity>> CRUELSUNPRO = register("projectile_cruelsunpro",
			EntityType.Builder.<CruelsunproEntity>of(CruelsunproEntity::new, MobCategory.MISC).setCustomClientFactory(CruelsunproEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LadyTamayoEntity>> LADY_TAMAYO = register("lady_tamayo",
			EntityType.Builder.<LadyTamayoEntity>of(LadyTamayoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LadyTamayoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagicBanditEntity>> MAGIC_BANDIT = register("magic_bandit",
			EntityType.Builder.<MagicBanditEntity>of(MagicBanditEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagicBanditEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ArkabilityrangeditemEntity>> ARKABILITYRANGEDITEM = register("projectile_arkabilityrangeditem",
			EntityType.Builder.<ArkabilityrangeditemEntity>of(ArkabilityrangeditemEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ArkabilityrangeditemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PurgatoryflamemoveEntity>> PURGATORYFLAMEMOVE = register("projectile_purgatoryflamemove",
			EntityType.Builder.<PurgatoryflamemoveEntity>of(PurgatoryflamemoveEntity::new, MobCategory.MISC)
					.setCustomClientFactory(PurgatoryflamemoveEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MahitoEntity>> MAHITO = register("mahito",
			EntityType.Builder.<MahitoEntity>of(MahitoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MahitoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhiteDivineDogEntity>> WHITE_DIVINE_DOG = register("white_divine_dog",
			EntityType.Builder.<WhiteDivineDogEntity>of(WhiteDivineDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteDivineDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackDivineDogEntity>> BLACK_DIVINE_DOG = register("black_divine_dog",
			EntityType.Builder.<BlackDivineDogEntity>of(BlackDivineDogEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackDivineDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CosmicFearGarouEntity>> COSMIC_FEAR_GAROU = register("cosmic_fear_garou",
			EntityType.Builder.<CosmicFearGarouEntity>of(CosmicFearGarouEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmicFearGarouEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CosmicblastEntity>> COSMICBLAST = register("projectile_cosmicblast",
			EntityType.Builder.<CosmicblastEntity>of(CosmicblastEntity::new, MobCategory.MISC).setCustomClientFactory(CosmicblastEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MegumiFushiguroEntity>> MEGUMI_FUSHIGURO = register("megumi_fushiguro",
			EntityType.Builder.<MegumiFushiguroEntity>of(MegumiFushiguroEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MegumiFushiguroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SilverFangEntity>> SILVER_FANG = register("silver_fang",
			EntityType.Builder.<SilverFangEntity>of(SilverFangEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilverFangEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FubukiEntity>> FUBUKI = register("fubuki",
			EntityType.Builder.<FubukiEntity>of(FubukiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FubukiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SilverFangDojoStudentEntity>> SILVER_FANG_DOJO_STUDENT = register("silver_fang_dojo_student",
			EntityType.Builder.<SilverFangDojoStudentEntity>of(SilverFangDojoStudentEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SilverFangDojoStudentEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BorosEntity>> BOROS = register("boros",
			EntityType.Builder.<BorosEntity>of(BorosEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BorosEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BorosSecondFormEntity>> BOROS_SECOND_FORM = register("boros_second_form",
			EntityType.Builder.<BorosSecondFormEntity>of(BorosSecondFormEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BorosSecondFormEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BorosThirdFormEntity>> BOROS_THIRD_FORM = register("boros_third_form",
			EntityType.Builder.<BorosThirdFormEntity>of(BorosThirdFormEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BorosThirdFormEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SisterLillyEntity>> SISTER_LILLY = register("sister_lilly",
			EntityType.Builder.<SisterLillyEntity>of(SisterLillyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SisterLillyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IchigoEntity>> ICHIGO = register("ichigo",
			EntityType.Builder.<IchigoEntity>of(IchigoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(IchigoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VaccineManEntity>> VACCINE_MAN = register("vaccine_man",
			EntityType.Builder.<VaccineManEntity>of(VaccineManEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VaccineManEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PikaPikaRangedEntity>> PIKA_PIKA_RANGED = register("projectile_pika_pika_ranged",
			EntityType.Builder.<PikaPikaRangedEntity>of(PikaPikaRangedEntity::new, MobCategory.MISC).setCustomClientFactory(PikaPikaRangedEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZoroEntity>> ZORO = register("zoro",
			EntityType.Builder.<ZoroEntity>of(ZoroEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ZoroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MihawkEntity>> MIHAWK = register("mihawk",
			EntityType.Builder.<MihawkEntity>of(MihawkEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MihawkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoruswingEntity>> YORUSWING = register("projectile_yoruswing",
			EntityType.Builder.<YoruswingEntity>of(YoruswingEntity::new, MobCategory.MISC).setCustomClientFactory(YoruswingEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KidBuuEntity>> KID_BUU = register("kid_buu",
			EntityType.Builder.<KidBuuEntity>of(KidBuuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(KidBuuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DestructoDiskEntity>> DESTRUCTO_DISK = register("projectile_destructo_disk",
			EntityType.Builder.<DestructoDiskEntity>of(DestructoDiskEntity::new, MobCategory.MISC).setCustomClientFactory(DestructoDiskEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UzuiTengenEntity>> UZUI_TENGEN = register("uzui_tengen",
			EntityType.Builder.<UzuiTengenEntity>of(UzuiTengenEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UzuiTengenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AkazaEntity>> AKAZA = register("akaza",
			EntityType.Builder.<AkazaEntity>of(AkazaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AkazaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RengokuEntity>> RENGOKU = register("rengoku",
			EntityType.Builder.<RengokuEntity>of(RengokuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RengokuEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AirtyperangedEntity>> AIRTYPERANGED = register("projectile_airtyperanged",
			EntityType.Builder.<AirtyperangedEntity>of(AirtyperangedEntity::new, MobCategory.MISC).setCustomClientFactory(AirtyperangedEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AnnitypeEntity>> ANNITYPE = register("projectile_annitype",
			EntityType.Builder.<AnnitypeEntity>of(AnnitypeEntity::new, MobCategory.MISC).setCustomClientFactory(AnnitypeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KokushiboEntity>> KOKUSHIBO = register("kokushibo",
			EntityType.Builder.<KokushiboEntity>of(KokushiboEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KokushiboEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShanksEntity>> SHANKS = register("shanks",
			EntityType.Builder.<ShanksEntity>of(ShanksEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShanksEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZenitsuEntity>> ZENITSU = register("zenitsu",
			EntityType.Builder.<ZenitsuEntity>of(ZenitsuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ZenitsuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoulReaperEntity>> SOUL_REAPER = register("soul_reaper",
			EntityType.Builder.<SoulReaperEntity>of(SoulReaperEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoulReaperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KnotEntityEntity>> KNOT_ENTITY = register("knot_entity",
			EntityType.Builder.<KnotEntityEntity>of(KnotEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(KnotEntityEntity::new).fireImmune().sized(0.4f, 0.6f));
	public static final RegistryObject<EntityType<BatHollowEntity>> BAT_HOLLOW = register("bat_hollow",
			EntityType.Builder.<BatHollowEntity>of(BatHollowEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BatHollowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThunderclapandflashEntity>> THUNDERCLAPANDFLASH = register("projectile_thunderclapandflash",
			EntityType.Builder.<ThunderclapandflashEntity>of(ThunderclapandflashEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ThunderclapandflashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SixfoldEntity>> SIXFOLD = register("projectile_sixfold",
			EntityType.Builder.<SixfoldEntity>of(SixfoldEntity::new, MobCategory.MISC).setCustomClientFactory(SixfoldEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HollowpurpleEntity>> HOLLOWPURPLE = register("projectile_hollowpurple",
			EntityType.Builder.<HollowpurpleEntity>of(HollowpurpleEntity::new, MobCategory.MISC).setCustomClientFactory(HollowpurpleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DekuEntity>> DEKU = register("deku",
			EntityType.Builder.<DekuEntity>of(DekuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DekuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PochitaEntity>> POCHITA = register("pochita",
			EntityType.Builder.<PochitaEntity>of(PochitaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PochitaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PowerEntity>> POWER = register("power",
			EntityType.Builder.<PowerEntity>of(PowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PowerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MarineEntity.init();
			ScoutRegimentMemberEntity.init();
			ShigeoEntity.init();
			LowRankEvilSpiritEntity.init();
			LeviEntity.init();
			SasukeUchihaEntity.init();
			NarutoUzumakiEntity.init();
			MadaraUchihaEntity.init();
			AstaEntity.init();
			YamiEntity.init();
			MikeyEntity.init();
			SandShinobiEntity.init();
			LeafShinobiEntity.init();
			TanjiroKamadoEntity.init();
			ZabuzaEntity.init();
			WeakGoblinEntity.init();
			YahabaEntity.init();
			NezukoEntity.init();
			TatsumakiEntity.init();
			MuzanKibutsujiEntity.init();
			DioEntity.init();
			AlienEntity.init();
			GyutaroEntity.init();
			DemonEntity.init();
			GrimoireGiverEntity.init();
			PirateEntity.init();
			NoelleSilvaEntity.init();
			SaitamaEntity.init();
			MonkeyDLuffyEntity.init();
			GarouEntity.init();
			CosmicGarouEntity.init();
			NarutocloneEntity.init();
			CloneerathealEntity.init();
			InsanePsychicEntity.init();
			ShinraEntity.init();
			InfernoEntity.init();
			ArthurBoyleEntity.init();
			YorEntity.init();
			GojoEntity.init();
			SaoFloor1BossEntity.init();
			ItadoriEntity.init();
			CursedSpiritEntity.init();
			SukunaEntity.init();
			NobaraEntity.init();
			HanamiEntity.init();
			TogeInumakiEntity.init();
			SonGokuEntity.init();
			MasterRoshiEntity.init();
			StrongGoblinEntity.init();
			FireForceCaptainEntity.init();
			KiritoEntity.init();
			MarineCaptainEntity.init();
			MeliodasEntity.init();
			MeliodasAssaultModeEntity.init();
			EscanorEntity.init();
			JiraiyaEntity.init();
			LadyTamayoEntity.init();
			MagicBanditEntity.init();
			MahitoEntity.init();
			WhiteDivineDogEntity.init();
			BlackDivineDogEntity.init();
			CosmicFearGarouEntity.init();
			MegumiFushiguroEntity.init();
			SilverFangEntity.init();
			FubukiEntity.init();
			SilverFangDojoStudentEntity.init();
			BorosEntity.init();
			BorosSecondFormEntity.init();
			BorosThirdFormEntity.init();
			SisterLillyEntity.init();
			IchigoEntity.init();
			VaccineManEntity.init();
			ZoroEntity.init();
			MihawkEntity.init();
			KidBuuEntity.init();
			UzuiTengenEntity.init();
			AkazaEntity.init();
			RengokuEntity.init();
			KokushiboEntity.init();
			ShanksEntity.init();
			ZenitsuEntity.init();
			SoulReaperEntity.init();
			KnotEntityEntity.init();
			BatHollowEntity.init();
			DekuEntity.init();
			PochitaEntity.init();
			PowerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MARINE.get(), MarineEntity.createAttributes().build());
		event.put(SCOUT_REGIMENT_MEMBER.get(), ScoutRegimentMemberEntity.createAttributes().build());
		event.put(SHIGEO.get(), ShigeoEntity.createAttributes().build());
		event.put(LOW_RANK_EVIL_SPIRIT.get(), LowRankEvilSpiritEntity.createAttributes().build());
		event.put(LEVI.get(), LeviEntity.createAttributes().build());
		event.put(SASUKE_UCHIHA.get(), SasukeUchihaEntity.createAttributes().build());
		event.put(NARUTO_UZUMAKI.get(), NarutoUzumakiEntity.createAttributes().build());
		event.put(MADARA_UCHIHA.get(), MadaraUchihaEntity.createAttributes().build());
		event.put(ASTA.get(), AstaEntity.createAttributes().build());
		event.put(YAMI.get(), YamiEntity.createAttributes().build());
		event.put(MIKEY.get(), MikeyEntity.createAttributes().build());
		event.put(SAND_SHINOBI.get(), SandShinobiEntity.createAttributes().build());
		event.put(LEAF_SHINOBI.get(), LeafShinobiEntity.createAttributes().build());
		event.put(TANJIRO_KAMADO.get(), TanjiroKamadoEntity.createAttributes().build());
		event.put(ZABUZA.get(), ZabuzaEntity.createAttributes().build());
		event.put(WEAK_GOBLIN.get(), WeakGoblinEntity.createAttributes().build());
		event.put(YAHABA.get(), YahabaEntity.createAttributes().build());
		event.put(NEZUKO.get(), NezukoEntity.createAttributes().build());
		event.put(TATSUMAKI.get(), TatsumakiEntity.createAttributes().build());
		event.put(MUZAN_KIBUTSUJI.get(), MuzanKibutsujiEntity.createAttributes().build());
		event.put(DIO.get(), DioEntity.createAttributes().build());
		event.put(ALIEN.get(), AlienEntity.createAttributes().build());
		event.put(GYUTARO.get(), GyutaroEntity.createAttributes().build());
		event.put(DEMON.get(), DemonEntity.createAttributes().build());
		event.put(GRIMOIRE_GIVER.get(), GrimoireGiverEntity.createAttributes().build());
		event.put(PIRATE.get(), PirateEntity.createAttributes().build());
		event.put(NOELLE_SILVA.get(), NoelleSilvaEntity.createAttributes().build());
		event.put(SAITAMA.get(), SaitamaEntity.createAttributes().build());
		event.put(MONKEY_D_LUFFY.get(), MonkeyDLuffyEntity.createAttributes().build());
		event.put(GAROU.get(), GarouEntity.createAttributes().build());
		event.put(COSMIC_GAROU.get(), CosmicGarouEntity.createAttributes().build());
		event.put(NARUTOCLONE.get(), NarutocloneEntity.createAttributes().build());
		event.put(CLONEERATHEAL.get(), CloneerathealEntity.createAttributes().build());
		event.put(INSANE_PSYCHIC.get(), InsanePsychicEntity.createAttributes().build());
		event.put(SHINRA.get(), ShinraEntity.createAttributes().build());
		event.put(INFERNO.get(), InfernoEntity.createAttributes().build());
		event.put(ARTHUR_BOYLE.get(), ArthurBoyleEntity.createAttributes().build());
		event.put(YOR.get(), YorEntity.createAttributes().build());
		event.put(GOJO.get(), GojoEntity.createAttributes().build());
		event.put(SAO_FLOOR_1_BOSS.get(), SaoFloor1BossEntity.createAttributes().build());
		event.put(ITADORI.get(), ItadoriEntity.createAttributes().build());
		event.put(CURSED_SPIRIT.get(), CursedSpiritEntity.createAttributes().build());
		event.put(SUKUNA.get(), SukunaEntity.createAttributes().build());
		event.put(NOBARA.get(), NobaraEntity.createAttributes().build());
		event.put(HANAMI.get(), HanamiEntity.createAttributes().build());
		event.put(TOGE_INUMAKI.get(), TogeInumakiEntity.createAttributes().build());
		event.put(SON_GOKU.get(), SonGokuEntity.createAttributes().build());
		event.put(MASTER_ROSHI.get(), MasterRoshiEntity.createAttributes().build());
		event.put(STRONG_GOBLIN.get(), StrongGoblinEntity.createAttributes().build());
		event.put(FIRE_FORCE_CAPTAIN.get(), FireForceCaptainEntity.createAttributes().build());
		event.put(KIRITO.get(), KiritoEntity.createAttributes().build());
		event.put(MARINE_CAPTAIN.get(), MarineCaptainEntity.createAttributes().build());
		event.put(MELIODAS.get(), MeliodasEntity.createAttributes().build());
		event.put(MELIODAS_ASSAULT_MODE.get(), MeliodasAssaultModeEntity.createAttributes().build());
		event.put(ESCANOR.get(), EscanorEntity.createAttributes().build());
		event.put(JIRAIYA.get(), JiraiyaEntity.createAttributes().build());
		event.put(LADY_TAMAYO.get(), LadyTamayoEntity.createAttributes().build());
		event.put(MAGIC_BANDIT.get(), MagicBanditEntity.createAttributes().build());
		event.put(MAHITO.get(), MahitoEntity.createAttributes().build());
		event.put(WHITE_DIVINE_DOG.get(), WhiteDivineDogEntity.createAttributes().build());
		event.put(BLACK_DIVINE_DOG.get(), BlackDivineDogEntity.createAttributes().build());
		event.put(COSMIC_FEAR_GAROU.get(), CosmicFearGarouEntity.createAttributes().build());
		event.put(MEGUMI_FUSHIGURO.get(), MegumiFushiguroEntity.createAttributes().build());
		event.put(SILVER_FANG.get(), SilverFangEntity.createAttributes().build());
		event.put(FUBUKI.get(), FubukiEntity.createAttributes().build());
		event.put(SILVER_FANG_DOJO_STUDENT.get(), SilverFangDojoStudentEntity.createAttributes().build());
		event.put(BOROS.get(), BorosEntity.createAttributes().build());
		event.put(BOROS_SECOND_FORM.get(), BorosSecondFormEntity.createAttributes().build());
		event.put(BOROS_THIRD_FORM.get(), BorosThirdFormEntity.createAttributes().build());
		event.put(SISTER_LILLY.get(), SisterLillyEntity.createAttributes().build());
		event.put(ICHIGO.get(), IchigoEntity.createAttributes().build());
		event.put(VACCINE_MAN.get(), VaccineManEntity.createAttributes().build());
		event.put(ZORO.get(), ZoroEntity.createAttributes().build());
		event.put(MIHAWK.get(), MihawkEntity.createAttributes().build());
		event.put(KID_BUU.get(), KidBuuEntity.createAttributes().build());
		event.put(UZUI_TENGEN.get(), UzuiTengenEntity.createAttributes().build());
		event.put(AKAZA.get(), AkazaEntity.createAttributes().build());
		event.put(RENGOKU.get(), RengokuEntity.createAttributes().build());
		event.put(KOKUSHIBO.get(), KokushiboEntity.createAttributes().build());
		event.put(SHANKS.get(), ShanksEntity.createAttributes().build());
		event.put(ZENITSU.get(), ZenitsuEntity.createAttributes().build());
		event.put(SOUL_REAPER.get(), SoulReaperEntity.createAttributes().build());
		event.put(KNOT_ENTITY.get(), KnotEntityEntity.createAttributes().build());
		event.put(BAT_HOLLOW.get(), BatHollowEntity.createAttributes().build());
		event.put(DEKU.get(), DekuEntity.createAttributes().build());
		event.put(POCHITA.get(), PochitaEntity.createAttributes().build());
		event.put(POWER.get(), PowerEntity.createAttributes().build());
	}
}
