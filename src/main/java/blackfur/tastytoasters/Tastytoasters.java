package blackfur.tastytoasters;

import blackfur.tastytoasters.block.ToasterBlock;
import blackfur.tastytoasters.items.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tastytoasters implements ModInitializer {

    public static final Item RAW_TOAST_ITEM = new RawToastItem();
    public static final Item TOAST_ITEM = new ToastItem();
    public static final Item BURNT_TOAST_ITEM = new BurntToastItem();
    public static final Item BUTTER_ITEM = new ButterItem();
    public static final Item BUTTERED_TOAST_ITEM = new ButteredToastItem();

    public static final ToasterBlock TOASTER_BLOCK = new ToasterBlock(FabricBlockSettings.of(Material.METAL).hardness(4.0f).requiresTool());
    
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("tastytoasters", "raw_toast"), RAW_TOAST_ITEM);
        Registry.register(Registry.ITEM, new Identifier("tastytoasters", "toast"), TOAST_ITEM);
        Registry.register(Registry.ITEM, new Identifier("tastytoasters", "burnt_toast"), BURNT_TOAST_ITEM);
        Registry.register(Registry.ITEM, new Identifier("tastytoasters", "butter"), BUTTER_ITEM);
        Registry.register(Registry.ITEM, new Identifier("tastytoasters", "buttered_toast"), BUTTERED_TOAST_ITEM);

        Registry.register(Registry.BLOCK, new Identifier("tastytoasters", "toaster"), TOASTER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("tastytoasters", "toaster"), new BlockItem(TOASTER_BLOCK, new Item.Settings().group(ItemGroup.FOOD)));
    }
}
