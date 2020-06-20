package red.felnull.placeitem.handler;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import red.felnull.placeitem.PlaceItem;
import red.felnull.placeitem.block.PIBlocks;
import red.felnull.placeitem.tileentity.PITileEntityTypes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemsRegistry(final RegistryEvent.Register<Item> e) {
		e.getRegistry().register(new BlockItem(PIBlocks.PLACE_ITEM, new Item.Properties())
				.setRegistryName(PlaceItem.MODID, "place_item"));
	}

	@SubscribeEvent
	public static void onBlockRegistry(final RegistryEvent.Register<Block> e) {
		PIBlocks.registerBlock(e.getRegistry());
	}

	@SubscribeEvent
	public static void onTileEntityTypeRegistry(final RegistryEvent.Register<TileEntityType<?>> e) {
		PITileEntityTypes.registerTileEntityType(e.getRegistry());
	}
}
