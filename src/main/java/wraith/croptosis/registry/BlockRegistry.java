package wraith.croptosis.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import wraith.croptosis.Utils;
import wraith.croptosis.block.CustomFarmlandBlock;
import wraith.croptosis.block.CustomOreBlock;
import wraith.croptosis.block.FertilizedDirtBlock;
import wraith.croptosis.block.FertilizedSandBlock;

import java.util.HashMap;
import java.util.Map;

public class BlockRegistry {

    public static final HashMap<String, Block> BLOCKS = new HashMap<String, Block>(){{
        put("fertilized_sand", new FertilizedSandBlock(0xc1bba3, FabricBlockSettings.of(Material.AGGREGATE, MaterialColor.SAND).strength(0.5F).sounds(BlockSoundGroup.SAND)));
        put("fertilized_farmland", new CustomFarmlandBlock(FabricBlockSettings.of(Material.SOIL).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRAVEL)));
        put("fertilized_dirt", new FertilizedDirtBlock(FabricBlockSettings.of(Material.SOIL, MaterialColor.DIRT).strength(0.5F).sounds(BlockSoundGroup.GRAVEL)));

        put("potash_block", new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.ORANGE).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.METAL)));
        put("apatite_block", new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.ORANGE).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.METAL)));

        put("potash_ore", new CustomOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)));
        put("apatite_ore", new CustomOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)));
    }};

    public static void register() {
        for (Map.Entry<String, Block> block : BLOCKS.entrySet()) {
            Registry.register(Registry.BLOCK, Utils.ID(block.getKey()), block.getValue());
        }
    }

}
