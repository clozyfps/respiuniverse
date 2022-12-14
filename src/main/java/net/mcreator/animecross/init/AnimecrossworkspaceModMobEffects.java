
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.potion.WebSwingingMobEffect;
import net.mcreator.animecross.potion.SupremeDeityMobEffect;
import net.mcreator.animecross.potion.SleepeffectMobEffect;
import net.mcreator.animecross.potion.SSJ1EffectMobEffect;
import net.mcreator.animecross.potion.RedMobEffect;
import net.mcreator.animecross.potion.POWECHARGEMobEffect;
import net.mcreator.animecross.potion.MaxpercentMobEffect;
import net.mcreator.animecross.potion.LightFlightPotionMobEffect;
import net.mcreator.animecross.potion.EvilSpiritMobEffect;
import net.mcreator.animecross.potion.EsperMobEffect;
import net.mcreator.animecross.potion.EsperFlyingMobEffect;
import net.mcreator.animecross.potion.EntityEMobEffect;
import net.mcreator.animecross.potion.EntityDMobEffect;
import net.mcreator.animecross.potion.EntityCMobEffect;
import net.mcreator.animecross.potion.EntityBMobEffect;
import net.mcreator.animecross.potion.EntityAMobEffect;
import net.mcreator.animecross.potion.DemonKingMobEffect;
import net.mcreator.animecross.potion.CommandmentMobEffect;
import net.mcreator.animecross.potion.ChokedMobEffect;
import net.mcreator.animecross.potion.ChokedDespawnKNOTMobEffect;
import net.mcreator.animecross.potion.BlueMobEffect;
import net.mcreator.animecross.potion.ArchAngelPotionMobEffect;
import net.mcreator.animecross.AnimecrossworkspaceMod;

public class AnimecrossworkspaceModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AnimecrossworkspaceMod.MODID);
	public static final RegistryObject<MobEffect> EVIL_SPIRIT = REGISTRY.register("evil_spirit", () -> new EvilSpiritMobEffect());
	public static final RegistryObject<MobEffect> ESPER = REGISTRY.register("esper", () -> new EsperMobEffect());
	public static final RegistryObject<MobEffect> ESPER_FLYING = REGISTRY.register("esper_flying", () -> new EsperFlyingMobEffect());
	public static final RegistryObject<MobEffect> POWECHARGE = REGISTRY.register("powecharge", () -> new POWECHARGEMobEffect());
	public static final RegistryObject<MobEffect> MAXPERCENT = REGISTRY.register("maxpercent", () -> new MaxpercentMobEffect());
	public static final RegistryObject<MobEffect> SLEEPEFFECT = REGISTRY.register("sleepeffect", () -> new SleepeffectMobEffect());
	public static final RegistryObject<MobEffect> LIGHT_FLIGHT_POTION = REGISTRY.register("light_flight_potion",
			() -> new LightFlightPotionMobEffect());
	public static final RegistryObject<MobEffect> RED = REGISTRY.register("red", () -> new RedMobEffect());
	public static final RegistryObject<MobEffect> BLUE = REGISTRY.register("blue", () -> new BlueMobEffect());
	public static final RegistryObject<MobEffect> SSJ_1_EFFECT = REGISTRY.register("ssj_1_effect", () -> new SSJ1EffectMobEffect());
	public static final RegistryObject<MobEffect> ENTITY_A = REGISTRY.register("entity_a", () -> new EntityAMobEffect());
	public static final RegistryObject<MobEffect> ENTITY_B = REGISTRY.register("entity_b", () -> new EntityBMobEffect());
	public static final RegistryObject<MobEffect> ENTITY_C = REGISTRY.register("entity_c", () -> new EntityCMobEffect());
	public static final RegistryObject<MobEffect> ENTITY_D = REGISTRY.register("entity_d", () -> new EntityDMobEffect());
	public static final RegistryObject<MobEffect> CHOKED = REGISTRY.register("choked", () -> new ChokedMobEffect());
	public static final RegistryObject<MobEffect> CHOKED_DESPAWN_KNOT = REGISTRY.register("choked_despawn_knot",
			() -> new ChokedDespawnKNOTMobEffect());
	public static final RegistryObject<MobEffect> ENTITY_E = REGISTRY.register("entity_e", () -> new EntityEMobEffect());
	public static final RegistryObject<MobEffect> WEB_SWINGING = REGISTRY.register("web_swinging", () -> new WebSwingingMobEffect());
	public static final RegistryObject<MobEffect> DEMON_KING = REGISTRY.register("demon_king", () -> new DemonKingMobEffect());
	public static final RegistryObject<MobEffect> SUPREME_DEITY = REGISTRY.register("supreme_deity", () -> new SupremeDeityMobEffect());
	public static final RegistryObject<MobEffect> COMMANDMENT = REGISTRY.register("commandment", () -> new CommandmentMobEffect());
	public static final RegistryObject<MobEffect> ARCH_ANGEL_POTION = REGISTRY.register("arch_angel_potion", () -> new ArchAngelPotionMobEffect());
}
