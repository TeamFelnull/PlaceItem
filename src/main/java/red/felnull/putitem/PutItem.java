package red.felnull.putitem;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import red.felnull.putitem.proxy.ClientProxy;
import red.felnull.putitem.proxy.CommonProxy;

@Mod(PutItem.MODID)
public class PutItem {

	//	private static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "putitem";

	@SuppressWarnings("deprecation")
	public static final CommonProxy proxy = DistExecutor
			.runForDist(() -> () -> new ClientProxy(), () -> () -> new CommonProxy());

	public PutItem() {

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

	}

	private void setup(final FMLCommonSetupEvent event) {
		proxy.preInit();
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		ClientProxy.clientInit();

	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
		proxy.init();
	}

	private void processIMC(final InterModProcessEvent event) {
		proxy.posInit();
	}
}
