package pavelkov.rpdprops.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pavelkov.rpdprops.RpdProps;

public class RpdModItems {
    public static Item register(Item item, String id){
        Identifier itemID = Identifier.of(RpdProps.MOD_ID, id);

        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void initialize() {
    }
}

