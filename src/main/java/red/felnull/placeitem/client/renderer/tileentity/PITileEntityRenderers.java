package red.felnull.placeitem.client.renderer.tileentity;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import red.felnull.placeitem.tileentity.PITileEntityTypes;

public class PITileEntityRenderers {
	public static void registerTileEntityRenderer() {
		ClientRegistry.bindTileEntityRenderer(PITileEntityTypes.PLACE_ITEM, PlaceItemTileEntityRenderer::new);
	}
}
