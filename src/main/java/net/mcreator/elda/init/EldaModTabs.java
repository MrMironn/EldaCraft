
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elda.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.elda.EldaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EldaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EldaMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EldaModItems.HJJH_ARMOR_HELMET.get());
			tabData.accept(EldaModItems.HJJH_ARMOR_CHESTPLATE.get());
			tabData.accept(EldaModItems.HJJH_ARMOR_LEGGINGS.get());
			tabData.accept(EldaModItems.HJJH_ARMOR_BOOTS.get());
		}
	}
}