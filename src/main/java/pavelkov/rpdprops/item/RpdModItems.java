package pavelkov.rpdprops.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import pavelkov.rpdprops.RpdProps;

public class RpdModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        ResourceLocation itemID = ResourceLocation.fromNamespaceAndPath(RpdProps.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(BuiltInRegistries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }
    public static void initialize(){
        RpdProps.LOGGER.info("Initializing class RpdModItems");
    }

}