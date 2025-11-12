package net.kris.kristestmod.item;

import net.kris.kristestmod.TestMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> CORNDOGCAT = ITEMS.register("corndogcat",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("kristestmod:corndogcat")))));
    public static final RegistryObject<Item> RAW_CORNDOGCAT = ITEMS.register("raw_corndogcat",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("kristestmod:raw_corndogcat")))));


    public static void register(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }
}
