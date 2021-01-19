package wraith.croptosis.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import wraith.croptosis.Croptosis;
import wraith.croptosis.block.FertilizedSandBlock;

import java.util.HashMap;
import java.util.Map;

public class BlockRegistry {

    public static final HashMap<String, Block> BLOCKS = new HashMap<String, Block>(){{
        put("fertilized_sand", new FertilizedSandBlock(0xc1bba3, FabricBlockSettings.of(Material.AGGREGATE, MaterialColor.SAND).strength(0.5F).sounds(BlockSoundGroup.SAND)));
    }};

    public static void register() {
        for (Map.Entry<String, Block> block : BLOCKS.entrySet()) {
            Registry.register(Registry.BLOCK, Croptosis.ID(block.getKey()), block.getValue());
        }
    }

}