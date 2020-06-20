package red.felnull.placeitem.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.placeitem.PlaceItem;

public class PIBlocks {
	public static final Block PLACE_ITEM = new PlaceItemBlock(Block.Properties.create(Material.IRON)
			.sound(SoundType.LANTERN).hardnessAndResistance(1f, 0.5f).func_226896_b_()).setRegistryName(
					PlaceItem.MODID, "place_item");

	public static void registerBlock(IForgeRegistry<Block> r) {
		r.register(PLACE_ITEM);
	}
}
