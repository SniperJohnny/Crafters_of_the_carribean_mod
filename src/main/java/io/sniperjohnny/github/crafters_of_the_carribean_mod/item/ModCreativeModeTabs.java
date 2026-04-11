package io.sniperjohnny.github.crafters_of_the_carribean_mod.item;

import io.sniperjohnny.github.crafters_of_the_carribean_mod.Crafters_of_the_carribean_Mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Crafters_of_the_carribean_Mod.MOD_ID);

    public static RegistryObject<CreativeModeTab> MOD_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("mod_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYSTALLITE.get()))
                    .title(Component.translatable("creativetab.mod_ingredients_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CRYSTALLITE.get());
                        pOutput.accept(ModItems.METAL.get());
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
