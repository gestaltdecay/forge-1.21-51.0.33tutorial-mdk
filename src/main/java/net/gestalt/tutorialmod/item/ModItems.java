package net.gestalt.tutorialmod.item;

import net.gestalt.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> CRUDEGOBOG = ITEMS.register("crudegobog",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOBOG = ITEMS.register("gobog",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);


    }
}
