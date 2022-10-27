
package net.mcreator.animecross.client.particle;

@OnlyIn(Dist.CLIENT)
public class StringparticleParticle extends TextureSheetParticle {

	public static StringparticleParticleProvider provider(SpriteSet spriteSet) {
		return new StringparticleParticleProvider(spriteSet);
	}

	public static class StringparticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public StringparticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new StringparticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected StringparticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);

		this.lifetime = (int) Math.max(1, 5 + (this.random.nextInt(10) - 5));

		this.gravity = 0f;
		this.hasPhysics = true;

		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;

		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();

	}

}
