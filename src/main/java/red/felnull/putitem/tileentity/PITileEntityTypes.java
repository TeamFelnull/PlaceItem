package red.felnull.putitem.tileentity;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import red.felnull.putitem.PutItem;
import red.felnull.putitem.block.PIBlocks;

public class PITileEntityTypes {

	@ObjectHolder(PutItem.MODID + ":" + "put_item")
	public static TileEntityType<PutItemTileEntity> PUT_ITEM;

	public static void registerTileEntityType(IForgeRegistry<TileEntityType<?>> r) {
		registryTileEntityType(r, PutItemTileEntity::new, PUT_ITEM, "put_item",
				PIBlocks.PUT_ITEM);
	}

	private static void registryTileEntityType(IForgeRegistry<TileEntityType<?>> r,
			Supplier<? extends TileEntity> factoryIn, TileEntityType<?> te, String name,
			Block... blocks) {
		te = TileEntityType.Builder.create(factoryIn, blocks).build(null)
				.setRegistryName(new ResourceLocation(PutItem.MODID, name));
		r.register(te);

	}
}
