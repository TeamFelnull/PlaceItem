package red.felnull.placeitem.proxy;

import net.minecraft.client.Minecraft;
import red.felnull.placeitem.client.renderer.tileentity.PITileEntityRenderers;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();

	}

	public static void clientInit() {
		PITileEntityRenderers.registerTileEntityRenderer();
	}

	@Override
	public void init() {
		super.init();

	}

	@Override
	public void posInit() {
		super.posInit();

	}

	@Override
	public Minecraft getMinecraft() {
		return Minecraft.getInstance();
	}
}
