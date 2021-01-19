package wraith.croptosis;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.croptosis.registry.BlockRegistry;
import wraith.croptosis.registry.ItemRegistry;

public class Croptosis implements ModInitializer {

    public static final String MOD_ID = "croptosis";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        BlockRegistry.register();
        ItemRegistry.register();
        LOGGER.info("[Croptosis] has been initiated.");
    }

    public static Identifier ID(String id) {
        return new Identifier(MOD_ID, id);
    }

}