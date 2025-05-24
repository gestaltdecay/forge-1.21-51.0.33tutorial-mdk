package net.gestalt.tutorialmod.item;

import net.gestalt.tutorialmod.TutorialMod;
import net.gestalt.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GOBOG_ITEMS_TAB = CREATIVE_MODE_TABS.register("gobog_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOBOG.get()))
                    .title(Component.translatable("creativetab.tutorialmod.gobog_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GOBOG.get());
                        output.accept(ModItems.CRUDEGOBOG.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> GOBOG_BLOCKS_TAB = CREATIVE_MODE_TABS.register("gobog_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GOBOGBLOCK.get()))
                    .withTabsBefore(GOBOG_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.gobog_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GOBLOCK.get());
                        output.accept(ModBlocks.GOBOGBLOCK.get());
                        output.accept(ModBlocks.GOBOGPILE.get());

                    }).build());



public static void register(IEventBus eventBus) {

    CREATIVE_MODE_TABS.register(eventBus);


    }

}
