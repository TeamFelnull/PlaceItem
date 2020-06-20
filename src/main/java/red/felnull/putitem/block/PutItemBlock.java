package red.felnull.putitem.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import red.felnull.putitem.tileentity.PutItemTileEntity;

public class PutItemBlock extends Block {

	public PutItemBlock(Properties properties) {
		super(properties);

	}

	@Nullable
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new PutItemTileEntity();
	}

	@Override
	public final boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public ActionResultType func_225533_a_(BlockState stateIn, World worldIn, BlockPos pos,
			PlayerEntity player, Hand hand, BlockRayTraceResult brtr) {

		if (!(worldIn.getTileEntity(pos) instanceof PutItemTileEntity))
			return ActionResultType.PASS;

		ItemStack helditem = player.getHeldItem(hand);
		PutItemTileEntity tile = (PutItemTileEntity) worldIn.getTileEntity(pos);

		if (tile.getItems().get(0).isEmpty()) {
			ItemStack insertstack = helditem.copy();
			insertstack.setCount(1);
			if (!player.isCreative()) {
				helditem.shrink(1);
			}
			tile.getItems().set(0, insertstack);
			return ActionResultType.SUCCESS;
		}

		return ActionResultType.PASS;
	}
}
