package io.sniperjohnny.github.crafters_of_the_carribean_mod.block;

import io.sniperjohnny.github.crafters_of_the_carribean_mod.Crafters_of_the_carribean_Mod;
import io.sniperjohnny.github.crafters_of_the_carribean_mod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Crafters_of_the_carribean_Mod.MOD_ID);


public static final RegistryObject<Block> CRYSTALLITE_BLOCK = registerBlock("crystallite_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.SCULK)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn= BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
//registers item for block
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }

}
