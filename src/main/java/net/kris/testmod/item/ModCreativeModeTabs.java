package net.kris.testmod.item;

import net.kris.testmod.TestMod;
import net.kris.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final RegistryObject<CreativeModeTab> CORNDOGTAB = CREATIVE_MODE_TABS.register("corndogtab", ()
    -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.testmod.corndogcat_items"))
            .icon(() -> new ItemStack(ModItems.CORNDOGCAT.get()))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.CORNDOGCAT.get());
                pOutput.accept(ModItems.RAW_CORNDOGCAT.get());
                pOutput.accept(ModBlocks.CORNDOGCAT_BLOCK.get());
            }).build());
        // New Creative Mode Tab

    public static void register(BusGroup eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
