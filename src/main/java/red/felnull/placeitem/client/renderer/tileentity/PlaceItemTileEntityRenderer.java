package red.felnull.placeitem.client.renderer.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import red.felnull.placeitem.tileentity.PlaceItemTileEntity;

public class PlaceItemTileEntityRenderer extends TileEntityRenderer<PlaceItemTileEntity> {

	public PlaceItemTileEntityRenderer(TileEntityRendererDispatcher p_i226006_1_) {
		super(p_i226006_1_);

	}

	@Override
	public void func_225616_a_(PlaceItemTileEntity tile, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buff,
			int light, int overlay) {

		ItemStack putingstack = tile.getItems().get(0);

		if (!putingstack.isEmpty()) {
			Minecraft.getInstance().getItemRenderer().func_229110_a_(putingstack,
					TransformType.FIXED, light, overlay, matrix, buff);
		}

	}

}
