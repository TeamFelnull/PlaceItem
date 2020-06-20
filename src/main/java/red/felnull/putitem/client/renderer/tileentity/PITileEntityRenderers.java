package red.felnull.putitem.client.renderer.tileentity;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import red.felnull.putitem.tileentity.PITileEntityTypes;

public class PITileEntityRenderers {
	public static void registerTileEntityRenderer() {
		ClientRegistry.bindTileEntityRenderer(PITileEntityTypes.PUT_ITEM, PutItemTileEntityRenderer::new);
	}
}
