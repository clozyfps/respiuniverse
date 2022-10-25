
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.animecross.client.model.Modelwingsofffreee;
import net.mcreator.animecross.client.model.Modelwadobite;
import net.mcreator.animecross.client.model.Modelvaccineman;
import net.mcreator.animecross.client.model.Modeluzuiarmor;
import net.mcreator.animecross.client.model.Modelsteve5;
import net.mcreator.animecross.client.model.Modelssj1;
import net.mcreator.animecross.client.model.Modelodm;
import net.mcreator.animecross.client.model.Modelmikeycloak;
import net.mcreator.animecross.client.model.Modelmihawkhatmodel;
import net.mcreator.animecross.client.model.Modelmihawkdrippworkrn;
import net.mcreator.animecross.client.model.Modelmihawkdripp;
import net.mcreator.animecross.client.model.Modelmarineredcape;
import net.mcreator.animecross.client.model.Modelmarinered;
import net.mcreator.animecross.client.model.Modelmarinebluecape;
import net.mcreator.animecross.client.model.Modelmarineblue;
import net.mcreator.animecross.client.model.Modelmaikyyo;
import net.mcreator.animecross.client.model.Modelluffyhat;
import net.mcreator.animecross.client.model.Modelluffyfist;
import net.mcreator.animecross.client.model.Modelkokudrip;
import net.mcreator.animecross.client.model.Modelkizaru;
import net.mcreator.animecross.client.model.Modelkimono1;
import net.mcreator.animecross.client.model.Modelinferno;
import net.mcreator.animecross.client.model.Modelhanami;
import net.mcreator.animecross.client.model.Modelgoblinmodel1;
import net.mcreator.animecross.client.model.Modelgob;
import net.mcreator.animecross.client.model.Modelgleameyes;
import net.mcreator.animecross.client.model.Modelfireballjutsudra;
import net.mcreator.animecross.client.model.Modelfireball2;
import net.mcreator.animecross.client.model.Modeldivinedog;
import net.mcreator.animecross.client.model.Modeldestruct;
import net.mcreator.animecross.client.model.Modeldaworldd2;
import net.mcreator.animecross.client.model.Modelcustom_model;
import net.mcreator.animecross.client.model.Modelcrimsonlionsss;
import net.mcreator.animecross.client.model.Modelblackwings;
import net.mcreator.animecross.client.model.Modelblackslash1;
import net.mcreator.animecross.client.model.Modelblackbullscloak;
import net.mcreator.animecross.client.model.Modelbathollow;
import net.mcreator.animecross.client.model.Modelalrightmihawkyugimme;
import net.mcreator.animecross.client.model.ModelSSJPLAYER;
import net.mcreator.animecross.client.model.ModelSSJGOKU;
import net.mcreator.animecross.client.model.ModelSHARINGANNUMBERONE;
import net.mcreator.animecross.client.model.ModelKidBuu;
import net.mcreator.animecross.client.model.ModelGoku;
import net.mcreator.animecross.client.model.ModelGoddessClanWings;
import net.mcreator.animecross.client.model.ModelGoblin;
import net.mcreator.animecross.client.model.ModelFireForceChest;
import net.mcreator.animecross.client.model.ModelEscanor2;
import net.mcreator.animecross.client.model.ModelEscanor;
import net.mcreator.animecross.client.model.ModelDBZArmor1;
import net.mcreator.animecross.client.model.ModelCruel_Sun;
import net.mcreator.animecross.client.model.ModelArc;
import net.mcreator.animecross.client.model.ModelAM_ArmorV1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AnimecrossworkspaceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcrimsonlionsss.LAYER_LOCATION, Modelcrimsonlionsss::createBodyLayer);
		event.registerLayerDefinition(Modelkokudrip.LAYER_LOCATION, Modelkokudrip::createBodyLayer);
		event.registerLayerDefinition(Modelbathollow.LAYER_LOCATION, Modelbathollow::createBodyLayer);
		event.registerLayerDefinition(Modelfireball2.LAYER_LOCATION, Modelfireball2::createBodyLayer);
		event.registerLayerDefinition(ModelSHARINGANNUMBERONE.LAYER_LOCATION, ModelSHARINGANNUMBERONE::createBodyLayer);
		event.registerLayerDefinition(ModelDBZArmor1.LAYER_LOCATION, ModelDBZArmor1::createBodyLayer);
		event.registerLayerDefinition(Modelluffyfist.LAYER_LOCATION, Modelluffyfist::createBodyLayer);
		event.registerLayerDefinition(ModelGoku.LAYER_LOCATION, ModelGoku::createBodyLayer);
		event.registerLayerDefinition(Modelfireballjutsudra.LAYER_LOCATION, Modelfireballjutsudra::createBodyLayer);
		event.registerLayerDefinition(ModelAM_ArmorV1.LAYER_LOCATION, ModelAM_ArmorV1::createBodyLayer);
		event.registerLayerDefinition(Modelgoblinmodel1.LAYER_LOCATION, Modelgoblinmodel1::createBodyLayer);
		event.registerLayerDefinition(Modelgleameyes.LAYER_LOCATION, Modelgleameyes::createBodyLayer);
		event.registerLayerDefinition(ModelEscanor2.LAYER_LOCATION, ModelEscanor2::createBodyLayer);
		event.registerLayerDefinition(Modeldestruct.LAYER_LOCATION, Modeldestruct::createBodyLayer);
		event.registerLayerDefinition(Modelkizaru.LAYER_LOCATION, Modelkizaru::createBodyLayer);
		event.registerLayerDefinition(Modelmarinebluecape.LAYER_LOCATION, Modelmarinebluecape::createBodyLayer);
		event.registerLayerDefinition(Modelmihawkdripp.LAYER_LOCATION, Modelmihawkdripp::createBodyLayer);
		event.registerLayerDefinition(Modelgob.LAYER_LOCATION, Modelgob::createBodyLayer);
		event.registerLayerDefinition(Modelmihawkhatmodel.LAYER_LOCATION, Modelmihawkhatmodel::createBodyLayer);
		event.registerLayerDefinition(ModelGoddessClanWings.LAYER_LOCATION, ModelGoddessClanWings::createBodyLayer);
		event.registerLayerDefinition(ModelSSJPLAYER.LAYER_LOCATION, ModelSSJPLAYER::createBodyLayer);
		event.registerLayerDefinition(Modelinferno.LAYER_LOCATION, Modelinferno::createBodyLayer);
		event.registerLayerDefinition(Modelmarineblue.LAYER_LOCATION, Modelmarineblue::createBodyLayer);
		event.registerLayerDefinition(Modelmarinered.LAYER_LOCATION, Modelmarinered::createBodyLayer);
		event.registerLayerDefinition(Modelmihawkdrippworkrn.LAYER_LOCATION, Modelmihawkdrippworkrn::createBodyLayer);
		event.registerLayerDefinition(Modeldaworldd2.LAYER_LOCATION, Modeldaworldd2::createBodyLayer);
		event.registerLayerDefinition(Modelmarineredcape.LAYER_LOCATION, Modelmarineredcape::createBodyLayer);
		event.registerLayerDefinition(ModelGoblin.LAYER_LOCATION, ModelGoblin::createBodyLayer);
		event.registerLayerDefinition(Modelwadobite.LAYER_LOCATION, Modelwadobite::createBodyLayer);
		event.registerLayerDefinition(Modelalrightmihawkyugimme.LAYER_LOCATION, Modelalrightmihawkyugimme::createBodyLayer);
		event.registerLayerDefinition(Modelodm.LAYER_LOCATION, Modelodm::createBodyLayer);
		event.registerLayerDefinition(ModelFireForceChest.LAYER_LOCATION, ModelFireForceChest::createBodyLayer);
		event.registerLayerDefinition(Modelluffyhat.LAYER_LOCATION, Modelluffyhat::createBodyLayer);
		event.registerLayerDefinition(ModelCruel_Sun.LAYER_LOCATION, ModelCruel_Sun::createBodyLayer);
		event.registerLayerDefinition(Modelmaikyyo.LAYER_LOCATION, Modelmaikyyo::createBodyLayer);
		event.registerLayerDefinition(Modelhanami.LAYER_LOCATION, Modelhanami::createBodyLayer);
		event.registerLayerDefinition(ModelSSJGOKU.LAYER_LOCATION, ModelSSJGOKU::createBodyLayer);
		event.registerLayerDefinition(Modelblackbullscloak.LAYER_LOCATION, Modelblackbullscloak::createBodyLayer);
		event.registerLayerDefinition(Modelvaccineman.LAYER_LOCATION, Modelvaccineman::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelEscanor.LAYER_LOCATION, ModelEscanor::createBodyLayer);
		event.registerLayerDefinition(Modelsteve5.LAYER_LOCATION, Modelsteve5::createBodyLayer);
		event.registerLayerDefinition(ModelKidBuu.LAYER_LOCATION, ModelKidBuu::createBodyLayer);
		event.registerLayerDefinition(Modelwingsofffreee.LAYER_LOCATION, Modelwingsofffreee::createBodyLayer);
		event.registerLayerDefinition(ModelArc.LAYER_LOCATION, ModelArc::createBodyLayer);
		event.registerLayerDefinition(Modelblackslash1.LAYER_LOCATION, Modelblackslash1::createBodyLayer);
		event.registerLayerDefinition(Modelmikeycloak.LAYER_LOCATION, Modelmikeycloak::createBodyLayer);
		event.registerLayerDefinition(Modelblackwings.LAYER_LOCATION, Modelblackwings::createBodyLayer);
		event.registerLayerDefinition(Modelkimono1.LAYER_LOCATION, Modelkimono1::createBodyLayer);
		event.registerLayerDefinition(Modeldivinedog.LAYER_LOCATION, Modeldivinedog::createBodyLayer);
		event.registerLayerDefinition(Modelssj1.LAYER_LOCATION, Modelssj1::createBodyLayer);
		event.registerLayerDefinition(Modeluzuiarmor.LAYER_LOCATION, Modeluzuiarmor::createBodyLayer);
	}
}
