
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.animecross.client.particle.YoruswordbladeswingParticle;
import net.mcreator.animecross.client.particle.SunParticleParticle;
import net.mcreator.animecross.client.particle.StringparticleParticle;
import net.mcreator.animecross.client.particle.SleepparticleParticle;
import net.mcreator.animecross.client.particle.ReddemonparticleParticle;
import net.mcreator.animecross.client.particle.PurpleParticleParticle;
import net.mcreator.animecross.client.particle.PurgatoryFlamesParticle;
import net.mcreator.animecross.client.particle.PikaPikaParticle2Particle;
import net.mcreator.animecross.client.particle.PikaPikaParticle1Particle;
import net.mcreator.animecross.client.particle.MoonBreathingParticleParticle;
import net.mcreator.animecross.client.particle.GoddessparticleParticle;
import net.mcreator.animecross.client.particle.FireSparkParticle;
import net.mcreator.animecross.client.particle.FireParticleParticle;
import net.mcreator.animecross.client.particle.ElectricityparticleParticle;
import net.mcreator.animecross.client.particle.CursedenergyParticle;
import net.mcreator.animecross.client.particle.BlueparticleParticle;
import net.mcreator.animecross.client.particle.BloodparticlenezukoParticle;
import net.mcreator.animecross.client.particle.AntiMagicParticleBlackParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnimecrossworkspaceModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.ANTI_MAGIC_PARTICLE_BLACK.get(),
				AntiMagicParticleBlackParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.REDDEMONPARTICLE.get(),
				ReddemonparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.BLUEPARTICLE.get(),
				BlueparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.BLOODPARTICLENEZUKO.get(),
				BloodparticlenezukoParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.CURSEDENERGY.get(),
				CursedenergyParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.SLEEPPARTICLE.get(),
				SleepparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.FIRE_PARTICLE.get(),
				FireParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.SUN_PARTICLE.get(),
				SunParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.PURGATORY_FLAMES.get(),
				PurgatoryFlamesParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.GODDESSPARTICLE.get(),
				GoddessparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.FIRE_SPARK.get(),
				FireSparkParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.PIKA_PIKA_PARTICLE_1.get(),
				PikaPikaParticle1Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.PIKA_PIKA_PARTICLE_2.get(),
				PikaPikaParticle2Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.YORUSWORDBLADESWING.get(),
				YoruswordbladeswingParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get(),
				MoonBreathingParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.STRINGPARTICLE.get(),
				StringparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.PURPLE_PARTICLE.get(),
				PurpleParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnimecrossworkspaceModParticleTypes.ELECTRICITYPARTICLE.get(),
				ElectricityparticleParticle::provider);
	}
}
