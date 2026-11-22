package pavelkov.rpdprops.item;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.world.item.Item;

import static pavelkov.rpdprops.item.RpdModItems.register;

public class ModItems {

    //Ban Hammer
    // У предмета есть текстура, но она не загружается + по неизвестной
    //причине модель предмета принимает модель блока
    public static final Item ban_hammer = register(
            new Item(new Item.Properties()),
            "ban_hammer"
    );

    public static void initialize() {

        //Ничего не проверено
        CompostingChanceRegistry.INSTANCE.add(ModItems.ban_hammer, 0.3f);
        FuelRegistry.INSTANCE.add(ModItems.ban_hammer, 30 * 20);

    }
}
