package io.sniperjohnny.github.crafters_of_the_carribean_mod.item;

import io.sniperjohnny.github.crafters_of_the_carribean_mod.Crafters_of_the_carribean_Mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Crafters_of_the_carribean_Mod.MOD_ID);

    public static final RegistryObject<Item> CRYSTALLITE = ITEMS.register("crystallite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL = ITEMS.register("metal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
