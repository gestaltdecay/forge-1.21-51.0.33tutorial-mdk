package net.gestalt.tutorialmod.block;

import net.gestalt.tutorialmod.TutorialMod;
import net.gestalt.tutorialmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> GOBOGBLOCK = registerBlock("gobogblock", () -> new Block(BlockBehaviour.Properties.of()
            .strength( 4f). requiresCorrectToolForDrops().sound(SoundType.NETHER_GOLD_ORE)

    ));

    public static final RegistryObject<Block> GOBLOCK = registerBlock("goblock", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1f).sound(SoundType.WOOD).requiresCorrectToolForDrops()

    ));

    public static final RegistryObject<SlabBlock> GOBOGPILE = registerBlock("gobogpile",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
            .strength(1f).sound(SoundType.AMETHYST_CLUSTER)

    ));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
