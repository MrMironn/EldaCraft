
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elda.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.elda.item.HjjhArmorItem;
import net.mcreator.elda.EldaMod;

public class EldaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EldaMod.MODID);
	public static final RegistryObject<Item> HJJH_ARMOR_HELMET = REGISTRY.register("hjjh_armor_helmet", () -> new HjjhArmorItem.Helmet());
	public static final RegistryObject<Item> HJJH_ARMOR_CHESTPLATE = REGISTRY.register("hjjh_armor_chestplate", () -> new HjjhArmorItem.Chestplate());
	public static final RegistryObject<Item> HJJH_ARMOR_LEGGINGS = REGISTRY.register("hjjh_armor_leggings", () -> new HjjhArmorItem.Leggings());
	public static final RegistryObject<Item> HJJH_ARMOR_BOOTS = REGISTRY.register("hjjh_armor_boots", () -> new HjjhArmorItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}
