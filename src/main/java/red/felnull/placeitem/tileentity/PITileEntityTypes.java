package red.felnull.placeitem.tileentity;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import red.felnull.placeitem.PlaceItem;
import red.felnull.placeitem.block.PIBlocks;

public class PITileEntityTypes {

	@ObjectHolder(PlaceItem.MODID + ":" + "place_item")
	public static TileEntityType<PlaceItemTileEntity> PLACE_ITEM;

	public static void registerTileEntityType(IForgeRegistry<TileEntityType<?>> r) {
		registryTileEntityType(r, PlaceItemTileEntity::new, PLACE_ITEM, "place_item",
				PIBlocks.PLACE_ITEM);
	}

	private static void registryTileEntityType(IForgeRegistry<TileEntityType<?>> r,
			Supplier<? extends TileEntity> factoryIn, TileEntityType<?> te, String name,
			Block... blocks) {
		te = TileEntityType.Builder.create(factoryIn, blocks).build(null)
				.setRegistryName(new ResourceLocation(PlaceItem.MODID, name));
		r.register(te);

	}
}
