
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.potion.SleepeffectMobEffect;
import net.mcreator.animecross.potion.SSJ1EffectMobEffect;
import net.mcreator.animecross.potion.RedMobEffect;
import net.mcreator.animecross.potion.POWECHARGEMobEffect;
import net.mcreator.animecross.potion.MaxpercentMobEffect;
import net.mcreator.animecross.potion.LightFlightPotionMobEffect;
import net.mcreator.animecross.potion.EvilSpiritMobEffect;
import net.mcreator.animecross.potion.EsperMobEffect;
import net.mcreator.animecross.potion.EsperFlyingMobEffect;
import net.mcreator.animecross.potion.BlueMobEffect;
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
}
