package red.felnull.putitem.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.putitem.PutItem;

public class PIBlocks {
	public static final Block PUT_ITEM = new PutItemBlock(Block.Properties.create(Material.IRON)
			.sound(SoundType.LANTERN).hardnessAndResistance(1f, 0.5f).func_226896_b_()).setRegistryName(
					PutItem.MODID, "put_item");

	public static void registerBlock(IForgeRegistry<Block> r) {
		r.register(PUT_ITEM);
	}
}
