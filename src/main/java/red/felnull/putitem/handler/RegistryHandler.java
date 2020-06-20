package red.felnull.putitem.handler;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import red.felnull.putitem.PutItem;
import red.felnull.putitem.block.PIBlocks;
import red.felnull.putitem.tileentity.PITileEntityTypes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemsRegistry(final RegistryEvent.Register<Item> e) {
		e.getRegistry().register(new BlockItem(PIBlocks.PUT_ITEM, new Item.Properties()).setRegistryName(PutItem.MODID, "put_item"));
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
