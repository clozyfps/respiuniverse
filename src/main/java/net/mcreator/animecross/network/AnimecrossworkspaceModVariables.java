package net.mcreator.animecross.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimecrossworkspaceModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		AnimecrossworkspaceMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
		AnimecrossworkspaceMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer,
				PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.max_power = original.max_power;
			clone.level = original.level;
			clone.power = original.power;
			clone.player_joins_first_time = original.player_joins_first_time;
			clone.exp = original.exp;
			clone.user_name = original.user_name;
			clone.has_odm_gear = original.has_odm_gear;
			clone.odm_air = original.odm_air;
			clone.has7dragonballs = original.has7dragonballs;
			clone.playerjoinedalready = original.playerjoinedalready;
			clone.gumgumfruituser = original.gumgumfruituser;
			clone.fireimmunitymastery = original.fireimmunitymastery;
			clone.waterbreathingmastery = original.waterbreathingmastery;
			clone.max_stamina = original.max_stamina;
			clone.stamina = original.stamina;
			clone.DevilFruit = original.DevilFruit;
			clone.gearseconduser = original.gearseconduser;
			clone.gumgummastery = original.gumgummastery;
			clone.Strength = original.Strength;
			clone.Max_Health = original.Max_Health;
			clone.Health = original.Health;
			clone.Stat_Points = original.Stat_Points;
			clone.Healthstat = original.Healthstat;
			clone.evilspirit = original.evilspirit;
			clone.evilspiritpowerlevel = original.evilspiritpowerlevel;
			clone.gearsecondactive = original.gearsecondactive;
			clone.Electrokenisis = original.Electrokenisis;
			clone.Pyrokenisis = original.Pyrokenisis;
			clone.fireballjutsugained = original.fireballjutsugained;
			clone.dragonfirelearned = original.dragonfirelearned;
			clone.Current_Ability = original.Current_Ability;
			clone.hasmana = original.hasmana;
			clone.isdemon = original.isdemon;
			clone.current5leaf = original.current5leaf;
			clone.breathingmastery = original.breathingmastery;
			clone.smallgourdprogress = original.smallgourdprogress;
			clone.mediumgourdprogress = original.mediumgourdprogress;
			clone.waternichirncrrent = original.waternichirncrrent;
			clone.tele = original.tele;
			clone.esper = original.esper;
			clone.nezukofire = original.nezukofire;
			clone.currentdemonlevel = original.currentdemonlevel;
			clone.hasdemonart = original.hasdemonart;
			clone.firegrimoirelevel = original.firegrimoirelevel;
			clone.currentclass = original.currentclass;
			clone.alreadytalkedtogrimoireguy = original.alreadytalkedtogrimoireguy;
			clone.watergrimoirelevel = original.watergrimoirelevel;
			clone.onepunchman = original.onepunchman;
			clone.mentor = original.mentor;
			clone.strengthstat = original.strengthstat;
			clone.speed = original.speed;
			clone.speedstat = original.speedstat;
			clone.alreadytalkedtogrimoire = original.alreadytalkedtogrimoire;
			clone.thirdgeneration = original.thirdgeneration;
			clone.divergentfist = original.divergentfist;
			clone.sourcerer = original.sourcerer;
			clone.talkingtogojo = original.talkingtogojo;
			clone.SourcererRank = original.SourcererRank;
			clone.jujutsuprogress = original.jujutsuprogress;
			clone.jujutsuregen = original.jujutsuregen;
			clone.needlehit = original.needlehit;
			clone.nobaratalked = original.nobaratalked;
			clone.strawdolllevel = original.strawdolllevel;
			clone.talkingtonobara = original.talkingtonobara;
			clone.manaskinmastery = original.manaskinmastery;
			clone.Saiyan = original.Saiyan;
			clone.Ki_User = original.Ki_User;
			clone.Good = original.Good;
			clone.Evil = original.Evil;
			clone.Kitraininglevel = original.Kitraininglevel;
			clone.kiblastman = original.kiblastman;
			clone.BecomingFireForce = original.BecomingFireForce;
			clone.setfireforcelevel = original.setfireforcelevel;
			clone.fireforce = original.fireforce;
			clone.elucidatorlevel = original.elucidatorlevel;
			clone.marinereputation = original.marinereputation;
			clone.owner = original.owner;
			clone.talkingtosaitama = original.talkingtosaitama;
			clone.runtrainingnumber = original.runtrainingnumber;
			clone.killtrainingnumber = original.killtrainingnumber;
			clone.magicnightsquadname = original.magicnightsquadname;
			clone.onepunchswitch = original.onepunchswitch;
			clone.doingrasenquest = original.doingrasenquest;
			clone.rasenganmastery = original.rasenganmastery;
			clone.goddess = original.goddess;
			clone.demonrace = original.demonrace;
			clone.talkingtoescanor = original.talkingtoescanor;
			clone.rollsleft = original.rollsleft;
			clone.currentrace = original.currentrace;
			clone.divinedogsalive = original.divinedogsalive;
			clone.fightingstyle = original.fightingstyle;
			clone.fistofflowingrock = original.fistofflowingrock;
			clone.rockswitchvar = original.rockswitchvar;
			clone.monstercell = original.monstercell;
			clone.monstercelleaten = original.monstercelleaten;
			clone.banditprogress = original.banditprogress;
			clone.blackbullsquest = original.blackbullsquest;
			clone.PikaPikaUser = original.PikaPikaUser;
			clone.fruituser = original.fruituser;
			clone.isdead = original.isdead;
			clone.Rank = original.Rank;
			clone.Bounty = original.Bounty;
			clone.Soundbreathinglevel = original.Soundbreathinglevel;
			clone.OneForAll = original.OneForAll;
			clone.Flamebreathinglevel = original.Flamebreathinglevel;
			clone.akazacompassneedlecooldown = original.akazacompassneedlecooldown;
			clone.sikusdevability = original.sikusdevability;
			clone.sikusdevselected = original.sikusdevselected;
			clone.logiacooldown = original.logiacooldown;
			clone.logiamax = original.logiamax;
			clone.df = original.df;
			clone.stringFruit = original.stringFruit;
			if (!event.isWasDeath()) {
				clone.doingdojoquest = original.doingdojoquest;
				clone.bangquestnumber = original.bangquestnumber;
				clone.vampire = original.vampire;
				clone.stringper = original.stringper;
				clone.logiaamount = original.logiaamount;
				clone.stringactive = original.stringactive;
				clone.SelectingTarget = original.SelectingTarget;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					AnimecrossworkspaceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					AnimecrossworkspaceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					AnimecrossworkspaceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "animecrossworkspace_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				AnimecrossworkspaceMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "animecrossworkspace_mapvars";
		public double biggourdprogress = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			biggourdprogress = nbt.getDouble("biggourdprogress");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("biggourdprogress", biggourdprogress);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				AnimecrossworkspaceMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("animecrossworkspace", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double max_power = 0;
		public double level = 0;
		public double power = 0;
		public double player_joins_first_time = 0;
		public double exp = 0;
		public String user_name = "\"\"";
		public double has_odm_gear = 0;
		public double odm_air = 0;
		public boolean has7dragonballs = false;
		public boolean playerjoinedalready = false;
		public boolean gumgumfruituser = false;
		public double fireimmunitymastery = 0;
		public double waterbreathingmastery = 0;
		public double max_stamina = 0;
		public double stamina = 0;
		public boolean DevilFruit = false;
		public boolean gearseconduser = false;
		public double gumgummastery = 0;
		public String Strength = "";
		public String Max_Health = "";
		public String Health = "\"\"";
		public double Stat_Points = 0;
		public double Healthstat = 0;
		public boolean evilspirit = false;
		public double evilspiritpowerlevel = 0;
		public boolean gearsecondactive = false;
		public boolean Electrokenisis = false;
		public boolean Pyrokenisis = false;
		public boolean fireballjutsugained = false;
		public boolean dragonfirelearned = false;
		public double Current_Ability = 0;
		public boolean hasmana = false;
		public boolean isdemon = false;
		public double current5leaf = 0;
		public double breathingmastery = 0;
		public double smallgourdprogress = 0;
		public double mediumgourdprogress = 0;
		public double waternichirncrrent = 0;
		public String tele = "\"\"";
		public boolean esper = false;
		public boolean nezukofire = false;
		public double currentdemonlevel = 0;
		public boolean hasdemonart = false;
		public double firegrimoirelevel = 0;
		public double currentclass = 0;
		public boolean alreadytalkedtogrimoireguy = false;
		public double watergrimoirelevel = 0;
		public boolean onepunchman = false;
		public String mentor = "\"\"";
		public double strengthstat = 0;
		public String speed = "\"\"";
		public double speedstat = 0;
		public boolean alreadytalkedtogrimoire = false;
		public boolean thirdgeneration = false;
		public boolean divergentfist = false;
		public boolean sourcerer = false;
		public boolean talkingtogojo = false;
		public double SourcererRank = 0;
		public double jujutsuprogress = 0;
		public boolean jujutsuregen = false;
		public boolean needlehit = false;
		public boolean nobaratalked = false;
		public double strawdolllevel = 0;
		public boolean talkingtonobara = false;
		public double manaskinmastery = 0;
		public boolean Saiyan = false;
		public boolean Ki_User = false;
		public boolean Good = false;
		public boolean Evil = false;
		public double Kitraininglevel = 0;
		public boolean kiblastman = false;
		public boolean BecomingFireForce = false;
		public double setfireforcelevel = 0;
		public boolean fireforce = false;
		public double elucidatorlevel = 0;
		public boolean marinereputation = false;
		public boolean owner = false;
		public boolean talkingtosaitama = false;
		public double runtrainingnumber = 0;
		public double killtrainingnumber = 0;
		public String magicnightsquadname = "\"\"";
		public double onepunchswitch = 0;
		public boolean doingrasenquest = false;
		public double rasenganmastery = 0;
		public boolean goddess = false;
		public boolean demonrace = false;
		public boolean talkingtoescanor = false;
		public double rollsleft = 3.0;
		public String currentrace = "\"\"";
		public boolean divinedogsalive = false;
		public String fightingstyle = "\"\"";
		public boolean fistofflowingrock = false;
		public double rockswitchvar = 0;
		public boolean doingdojoquest = false;
		public double bangquestnumber = 0;
		public double monstercell = 0;
		public boolean monstercelleaten = false;
		public boolean vampire = false;
		public double banditprogress = 0;
		public boolean blackbullsquest = false;
		public boolean PikaPikaUser = false;
		public boolean fruituser = false;
		public boolean isdead = false;
		public String Rank = "\"\"";
		public double Bounty = 0;
		public double Soundbreathinglevel = 0;
		public boolean stringper = false;
		public boolean OneForAll = false;
		public double Flamebreathinglevel = 0;
		public boolean akazacompassneedlecooldown = false;
		public boolean sikusdevability = false;
		public double sikusdevselected = 0.0;
		public double logiacooldown = 0;
		public double logiaamount = 200.0;
		public double logiamax = 200.0;
		public String df = "\"\"";
		public boolean stringactive = false;
		public boolean SelectingTarget = false;
		public boolean stringFruit = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				AnimecrossworkspaceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("max_power", max_power);
			nbt.putDouble("level", level);
			nbt.putDouble("power", power);
			nbt.putDouble("player_joins_first_time", player_joins_first_time);
			nbt.putDouble("exp", exp);
			nbt.putString("user_name", user_name);
			nbt.putDouble("has_odm_gear", has_odm_gear);
			nbt.putDouble("odm_air", odm_air);
			nbt.putBoolean("has7dragonballs", has7dragonballs);
			nbt.putBoolean("playerjoinedalready", playerjoinedalready);
			nbt.putBoolean("gumgumfruituser", gumgumfruituser);
			nbt.putDouble("fireimmunitymastery", fireimmunitymastery);
			nbt.putDouble("waterbreathingmastery", waterbreathingmastery);
			nbt.putDouble("max_stamina", max_stamina);
			nbt.putDouble("stamina", stamina);
			nbt.putBoolean("DevilFruit", DevilFruit);
			nbt.putBoolean("gearseconduser", gearseconduser);
			nbt.putDouble("gumgummastery", gumgummastery);
			nbt.putString("Strength", Strength);
			nbt.putString("Max_Health", Max_Health);
			nbt.putString("Health", Health);
			nbt.putDouble("Stat_Points", Stat_Points);
			nbt.putDouble("Healthstat", Healthstat);
			nbt.putBoolean("evilspirit", evilspirit);
			nbt.putDouble("evilspiritpowerlevel", evilspiritpowerlevel);
			nbt.putBoolean("gearsecondactive", gearsecondactive);
			nbt.putBoolean("Electrokenisis", Electrokenisis);
			nbt.putBoolean("Pyrokenisis", Pyrokenisis);
			nbt.putBoolean("fireballjutsugained", fireballjutsugained);
			nbt.putBoolean("dragonfirelearned", dragonfirelearned);
			nbt.putDouble("Current_Ability", Current_Ability);
			nbt.putBoolean("hasmana", hasmana);
			nbt.putBoolean("isdemon", isdemon);
			nbt.putDouble("current5leaf", current5leaf);
			nbt.putDouble("breathingmastery", breathingmastery);
			nbt.putDouble("smallgourdprogress", smallgourdprogress);
			nbt.putDouble("mediumgourdprogress", mediumgourdprogress);
			nbt.putDouble("waternichirncrrent", waternichirncrrent);
			nbt.putString("tele", tele);
			nbt.putBoolean("esper", esper);
			nbt.putBoolean("nezukofire", nezukofire);
			nbt.putDouble("currentdemonlevel", currentdemonlevel);
			nbt.putBoolean("hasdemonart", hasdemonart);
			nbt.putDouble("firegrimoirelevel", firegrimoirelevel);
			nbt.putDouble("currentclass", currentclass);
			nbt.putBoolean("alreadytalkedtogrimoireguy", alreadytalkedtogrimoireguy);
			nbt.putDouble("watergrimoirelevel", watergrimoirelevel);
			nbt.putBoolean("onepunchman", onepunchman);
			nbt.putString("mentor", mentor);
			nbt.putDouble("strengthstat", strengthstat);
			nbt.putString("speed", speed);
			nbt.putDouble("speedstat", speedstat);
			nbt.putBoolean("alreadytalkedtogrimoire", alreadytalkedtogrimoire);
			nbt.putBoolean("thirdgeneration", thirdgeneration);
			nbt.putBoolean("divergentfist", divergentfist);
			nbt.putBoolean("sourcerer", sourcerer);
			nbt.putBoolean("talkingtogojo", talkingtogojo);
			nbt.putDouble("SourcererRank", SourcererRank);
			nbt.putDouble("jujutsuprogress", jujutsuprogress);
			nbt.putBoolean("jujutsuregen", jujutsuregen);
			nbt.putBoolean("needlehit", needlehit);
			nbt.putBoolean("nobaratalked", nobaratalked);
			nbt.putDouble("strawdolllevel", strawdolllevel);
			nbt.putBoolean("talkingtonobara", talkingtonobara);
			nbt.putDouble("manaskinmastery", manaskinmastery);
			nbt.putBoolean("Saiyan", Saiyan);
			nbt.putBoolean("Ki_User", Ki_User);
			nbt.putBoolean("Good", Good);
			nbt.putBoolean("Evil", Evil);
			nbt.putDouble("Kitraininglevel", Kitraininglevel);
			nbt.putBoolean("kiblastman", kiblastman);
			nbt.putBoolean("BecomingFireForce", BecomingFireForce);
			nbt.putDouble("setfireforcelevel", setfireforcelevel);
			nbt.putBoolean("fireforce", fireforce);
			nbt.putDouble("elucidatorlevel", elucidatorlevel);
			nbt.putBoolean("marinereputation", marinereputation);
			nbt.putBoolean("owner", owner);
			nbt.putBoolean("talkingtosaitama", talkingtosaitama);
			nbt.putDouble("runtrainingnumber", runtrainingnumber);
			nbt.putDouble("killtrainingnumber", killtrainingnumber);
			nbt.putString("magicnightsquadname", magicnightsquadname);
			nbt.putDouble("onepunchswitch", onepunchswitch);
			nbt.putBoolean("doingrasenquest", doingrasenquest);
			nbt.putDouble("rasenganmastery", rasenganmastery);
			nbt.putBoolean("goddess", goddess);
			nbt.putBoolean("demonrace", demonrace);
			nbt.putBoolean("talkingtoescanor", talkingtoescanor);
			nbt.putDouble("rollsleft", rollsleft);
			nbt.putString("currentrace", currentrace);
			nbt.putBoolean("divinedogsalive", divinedogsalive);
			nbt.putString("fightingstyle", fightingstyle);
			nbt.putBoolean("fistofflowingrock", fistofflowingrock);
			nbt.putDouble("rockswitchvar", rockswitchvar);
			nbt.putBoolean("doingdojoquest", doingdojoquest);
			nbt.putDouble("bangquestnumber", bangquestnumber);
			nbt.putDouble("monstercell", monstercell);
			nbt.putBoolean("monstercelleaten", monstercelleaten);
			nbt.putBoolean("vampire", vampire);
			nbt.putDouble("banditprogress", banditprogress);
			nbt.putBoolean("blackbullsquest", blackbullsquest);
			nbt.putBoolean("PikaPikaUser", PikaPikaUser);
			nbt.putBoolean("fruituser", fruituser);
			nbt.putBoolean("isdead", isdead);
			nbt.putString("Rank", Rank);
			nbt.putDouble("Bounty", Bounty);
			nbt.putDouble("Soundbreathinglevel", Soundbreathinglevel);
			nbt.putBoolean("stringper", stringper);
			nbt.putBoolean("OneForAll", OneForAll);
			nbt.putDouble("Flamebreathinglevel", Flamebreathinglevel);
			nbt.putBoolean("akazacompassneedlecooldown", akazacompassneedlecooldown);
			nbt.putBoolean("sikusdevability", sikusdevability);
			nbt.putDouble("sikusdevselected", sikusdevselected);
			nbt.putDouble("logiacooldown", logiacooldown);
			nbt.putDouble("logiaamount", logiaamount);
			nbt.putDouble("logiamax", logiamax);
			nbt.putString("df", df);
			nbt.putBoolean("stringactive", stringactive);
			nbt.putBoolean("SelectingTarget", SelectingTarget);
			nbt.putBoolean("stringFruit", stringFruit);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			max_power = nbt.getDouble("max_power");
			level = nbt.getDouble("level");
			power = nbt.getDouble("power");
			player_joins_first_time = nbt.getDouble("player_joins_first_time");
			exp = nbt.getDouble("exp");
			user_name = nbt.getString("user_name");
			has_odm_gear = nbt.getDouble("has_odm_gear");
			odm_air = nbt.getDouble("odm_air");
			has7dragonballs = nbt.getBoolean("has7dragonballs");
			playerjoinedalready = nbt.getBoolean("playerjoinedalready");
			gumgumfruituser = nbt.getBoolean("gumgumfruituser");
			fireimmunitymastery = nbt.getDouble("fireimmunitymastery");
			waterbreathingmastery = nbt.getDouble("waterbreathingmastery");
			max_stamina = nbt.getDouble("max_stamina");
			stamina = nbt.getDouble("stamina");
			DevilFruit = nbt.getBoolean("DevilFruit");
			gearseconduser = nbt.getBoolean("gearseconduser");
			gumgummastery = nbt.getDouble("gumgummastery");
			Strength = nbt.getString("Strength");
			Max_Health = nbt.getString("Max_Health");
			Health = nbt.getString("Health");
			Stat_Points = nbt.getDouble("Stat_Points");
			Healthstat = nbt.getDouble("Healthstat");
			evilspirit = nbt.getBoolean("evilspirit");
			evilspiritpowerlevel = nbt.getDouble("evilspiritpowerlevel");
			gearsecondactive = nbt.getBoolean("gearsecondactive");
			Electrokenisis = nbt.getBoolean("Electrokenisis");
			Pyrokenisis = nbt.getBoolean("Pyrokenisis");
			fireballjutsugained = nbt.getBoolean("fireballjutsugained");
			dragonfirelearned = nbt.getBoolean("dragonfirelearned");
			Current_Ability = nbt.getDouble("Current_Ability");
			hasmana = nbt.getBoolean("hasmana");
			isdemon = nbt.getBoolean("isdemon");
			current5leaf = nbt.getDouble("current5leaf");
			breathingmastery = nbt.getDouble("breathingmastery");
			smallgourdprogress = nbt.getDouble("smallgourdprogress");
			mediumgourdprogress = nbt.getDouble("mediumgourdprogress");
			waternichirncrrent = nbt.getDouble("waternichirncrrent");
			tele = nbt.getString("tele");
			esper = nbt.getBoolean("esper");
			nezukofire = nbt.getBoolean("nezukofire");
			currentdemonlevel = nbt.getDouble("currentdemonlevel");
			hasdemonart = nbt.getBoolean("hasdemonart");
			firegrimoirelevel = nbt.getDouble("firegrimoirelevel");
			currentclass = nbt.getDouble("currentclass");
			alreadytalkedtogrimoireguy = nbt.getBoolean("alreadytalkedtogrimoireguy");
			watergrimoirelevel = nbt.getDouble("watergrimoirelevel");
			onepunchman = nbt.getBoolean("onepunchman");
			mentor = nbt.getString("mentor");
			strengthstat = nbt.getDouble("strengthstat");
			speed = nbt.getString("speed");
			speedstat = nbt.getDouble("speedstat");
			alreadytalkedtogrimoire = nbt.getBoolean("alreadytalkedtogrimoire");
			thirdgeneration = nbt.getBoolean("thirdgeneration");
			divergentfist = nbt.getBoolean("divergentfist");
			sourcerer = nbt.getBoolean("sourcerer");
			talkingtogojo = nbt.getBoolean("talkingtogojo");
			SourcererRank = nbt.getDouble("SourcererRank");
			jujutsuprogress = nbt.getDouble("jujutsuprogress");
			jujutsuregen = nbt.getBoolean("jujutsuregen");
			needlehit = nbt.getBoolean("needlehit");
			nobaratalked = nbt.getBoolean("nobaratalked");
			strawdolllevel = nbt.getDouble("strawdolllevel");
			talkingtonobara = nbt.getBoolean("talkingtonobara");
			manaskinmastery = nbt.getDouble("manaskinmastery");
			Saiyan = nbt.getBoolean("Saiyan");
			Ki_User = nbt.getBoolean("Ki_User");
			Good = nbt.getBoolean("Good");
			Evil = nbt.getBoolean("Evil");
			Kitraininglevel = nbt.getDouble("Kitraininglevel");
			kiblastman = nbt.getBoolean("kiblastman");
			BecomingFireForce = nbt.getBoolean("BecomingFireForce");
			setfireforcelevel = nbt.getDouble("setfireforcelevel");
			fireforce = nbt.getBoolean("fireforce");
			elucidatorlevel = nbt.getDouble("elucidatorlevel");
			marinereputation = nbt.getBoolean("marinereputation");
			owner = nbt.getBoolean("owner");
			talkingtosaitama = nbt.getBoolean("talkingtosaitama");
			runtrainingnumber = nbt.getDouble("runtrainingnumber");
			killtrainingnumber = nbt.getDouble("killtrainingnumber");
			magicnightsquadname = nbt.getString("magicnightsquadname");
			onepunchswitch = nbt.getDouble("onepunchswitch");
			doingrasenquest = nbt.getBoolean("doingrasenquest");
			rasenganmastery = nbt.getDouble("rasenganmastery");
			goddess = nbt.getBoolean("goddess");
			demonrace = nbt.getBoolean("demonrace");
			talkingtoescanor = nbt.getBoolean("talkingtoescanor");
			rollsleft = nbt.getDouble("rollsleft");
			currentrace = nbt.getString("currentrace");
			divinedogsalive = nbt.getBoolean("divinedogsalive");
			fightingstyle = nbt.getString("fightingstyle");
			fistofflowingrock = nbt.getBoolean("fistofflowingrock");
			rockswitchvar = nbt.getDouble("rockswitchvar");
			doingdojoquest = nbt.getBoolean("doingdojoquest");
			bangquestnumber = nbt.getDouble("bangquestnumber");
			monstercell = nbt.getDouble("monstercell");
			monstercelleaten = nbt.getBoolean("monstercelleaten");
			vampire = nbt.getBoolean("vampire");
			banditprogress = nbt.getDouble("banditprogress");
			blackbullsquest = nbt.getBoolean("blackbullsquest");
			PikaPikaUser = nbt.getBoolean("PikaPikaUser");
			fruituser = nbt.getBoolean("fruituser");
			isdead = nbt.getBoolean("isdead");
			Rank = nbt.getString("Rank");
			Bounty = nbt.getDouble("Bounty");
			Soundbreathinglevel = nbt.getDouble("Soundbreathinglevel");
			stringper = nbt.getBoolean("stringper");
			OneForAll = nbt.getBoolean("OneForAll");
			Flamebreathinglevel = nbt.getDouble("Flamebreathinglevel");
			akazacompassneedlecooldown = nbt.getBoolean("akazacompassneedlecooldown");
			sikusdevability = nbt.getBoolean("sikusdevability");
			sikusdevselected = nbt.getDouble("sikusdevselected");
			logiacooldown = nbt.getDouble("logiacooldown");
			logiaamount = nbt.getDouble("logiaamount");
			logiamax = nbt.getDouble("logiamax");
			df = nbt.getString("df");
			stringactive = nbt.getBoolean("stringactive");
			SelectingTarget = nbt.getBoolean("SelectingTarget");
			stringFruit = nbt.getBoolean("stringFruit");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.max_power = message.data.max_power;
					variables.level = message.data.level;
					variables.power = message.data.power;
					variables.player_joins_first_time = message.data.player_joins_first_time;
					variables.exp = message.data.exp;
					variables.user_name = message.data.user_name;
					variables.has_odm_gear = message.data.has_odm_gear;
					variables.odm_air = message.data.odm_air;
					variables.has7dragonballs = message.data.has7dragonballs;
					variables.playerjoinedalready = message.data.playerjoinedalready;
					variables.gumgumfruituser = message.data.gumgumfruituser;
					variables.fireimmunitymastery = message.data.fireimmunitymastery;
					variables.waterbreathingmastery = message.data.waterbreathingmastery;
					variables.max_stamina = message.data.max_stamina;
					variables.stamina = message.data.stamina;
					variables.DevilFruit = message.data.DevilFruit;
					variables.gearseconduser = message.data.gearseconduser;
					variables.gumgummastery = message.data.gumgummastery;
					variables.Strength = message.data.Strength;
					variables.Max_Health = message.data.Max_Health;
					variables.Health = message.data.Health;
					variables.Stat_Points = message.data.Stat_Points;
					variables.Healthstat = message.data.Healthstat;
					variables.evilspirit = message.data.evilspirit;
					variables.evilspiritpowerlevel = message.data.evilspiritpowerlevel;
					variables.gearsecondactive = message.data.gearsecondactive;
					variables.Electrokenisis = message.data.Electrokenisis;
					variables.Pyrokenisis = message.data.Pyrokenisis;
					variables.fireballjutsugained = message.data.fireballjutsugained;
					variables.dragonfirelearned = message.data.dragonfirelearned;
					variables.Current_Ability = message.data.Current_Ability;
					variables.hasmana = message.data.hasmana;
					variables.isdemon = message.data.isdemon;
					variables.current5leaf = message.data.current5leaf;
					variables.breathingmastery = message.data.breathingmastery;
					variables.smallgourdprogress = message.data.smallgourdprogress;
					variables.mediumgourdprogress = message.data.mediumgourdprogress;
					variables.waternichirncrrent = message.data.waternichirncrrent;
					variables.tele = message.data.tele;
					variables.esper = message.data.esper;
					variables.nezukofire = message.data.nezukofire;
					variables.currentdemonlevel = message.data.currentdemonlevel;
					variables.hasdemonart = message.data.hasdemonart;
					variables.firegrimoirelevel = message.data.firegrimoirelevel;
					variables.currentclass = message.data.currentclass;
					variables.alreadytalkedtogrimoireguy = message.data.alreadytalkedtogrimoireguy;
					variables.watergrimoirelevel = message.data.watergrimoirelevel;
					variables.onepunchman = message.data.onepunchman;
					variables.mentor = message.data.mentor;
					variables.strengthstat = message.data.strengthstat;
					variables.speed = message.data.speed;
					variables.speedstat = message.data.speedstat;
					variables.alreadytalkedtogrimoire = message.data.alreadytalkedtogrimoire;
					variables.thirdgeneration = message.data.thirdgeneration;
					variables.divergentfist = message.data.divergentfist;
					variables.sourcerer = message.data.sourcerer;
					variables.talkingtogojo = message.data.talkingtogojo;
					variables.SourcererRank = message.data.SourcererRank;
					variables.jujutsuprogress = message.data.jujutsuprogress;
					variables.jujutsuregen = message.data.jujutsuregen;
					variables.needlehit = message.data.needlehit;
					variables.nobaratalked = message.data.nobaratalked;
					variables.strawdolllevel = message.data.strawdolllevel;
					variables.talkingtonobara = message.data.talkingtonobara;
					variables.manaskinmastery = message.data.manaskinmastery;
					variables.Saiyan = message.data.Saiyan;
					variables.Ki_User = message.data.Ki_User;
					variables.Good = message.data.Good;
					variables.Evil = message.data.Evil;
					variables.Kitraininglevel = message.data.Kitraininglevel;
					variables.kiblastman = message.data.kiblastman;
					variables.BecomingFireForce = message.data.BecomingFireForce;
					variables.setfireforcelevel = message.data.setfireforcelevel;
					variables.fireforce = message.data.fireforce;
					variables.elucidatorlevel = message.data.elucidatorlevel;
					variables.marinereputation = message.data.marinereputation;
					variables.owner = message.data.owner;
					variables.talkingtosaitama = message.data.talkingtosaitama;
					variables.runtrainingnumber = message.data.runtrainingnumber;
					variables.killtrainingnumber = message.data.killtrainingnumber;
					variables.magicnightsquadname = message.data.magicnightsquadname;
					variables.onepunchswitch = message.data.onepunchswitch;
					variables.doingrasenquest = message.data.doingrasenquest;
					variables.rasenganmastery = message.data.rasenganmastery;
					variables.goddess = message.data.goddess;
					variables.demonrace = message.data.demonrace;
					variables.talkingtoescanor = message.data.talkingtoescanor;
					variables.rollsleft = message.data.rollsleft;
					variables.currentrace = message.data.currentrace;
					variables.divinedogsalive = message.data.divinedogsalive;
					variables.fightingstyle = message.data.fightingstyle;
					variables.fistofflowingrock = message.data.fistofflowingrock;
					variables.rockswitchvar = message.data.rockswitchvar;
					variables.doingdojoquest = message.data.doingdojoquest;
					variables.bangquestnumber = message.data.bangquestnumber;
					variables.monstercell = message.data.monstercell;
					variables.monstercelleaten = message.data.monstercelleaten;
					variables.vampire = message.data.vampire;
					variables.banditprogress = message.data.banditprogress;
					variables.blackbullsquest = message.data.blackbullsquest;
					variables.PikaPikaUser = message.data.PikaPikaUser;
					variables.fruituser = message.data.fruituser;
					variables.isdead = message.data.isdead;
					variables.Rank = message.data.Rank;
					variables.Bounty = message.data.Bounty;
					variables.Soundbreathinglevel = message.data.Soundbreathinglevel;
					variables.stringper = message.data.stringper;
					variables.OneForAll = message.data.OneForAll;
					variables.Flamebreathinglevel = message.data.Flamebreathinglevel;
					variables.akazacompassneedlecooldown = message.data.akazacompassneedlecooldown;
					variables.sikusdevability = message.data.sikusdevability;
					variables.sikusdevselected = message.data.sikusdevselected;
					variables.logiacooldown = message.data.logiacooldown;
					variables.logiaamount = message.data.logiaamount;
					variables.logiamax = message.data.logiamax;
					variables.df = message.data.df;
					variables.stringactive = message.data.stringactive;
					variables.SelectingTarget = message.data.SelectingTarget;
					variables.stringFruit = message.data.stringFruit;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
