package top.npucraft.npuvproj.block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import top.npucraft.npuvproj.item.ItemBus;

public class BlockBus {
	public static void registerBlock(Block blockIn) {
		ForgeRegistries.BLOCKS.register(blockIn);
		ItemBus.registerItemBlock(blockIn);
	}
}
