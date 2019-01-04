package sub_mod.techne_block5.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import sub_mod.techne_block5.ModBlockTechne5;
import sub_mod.techne_block5.ProxyCommon;
import sub_mod.techne_block5.client.render.RenderItemBlockTechne1;
import sub_mod.techne_block5.client.render.RenderItemBlockTechne2;
import sub_mod.techne_block5.client.render.RenderItemBlockTechne3;
import sub_mod.techne_block5.client.render.RenderItemBlockTechne4;
import sub_mod.techne_block5.client.render.RenderItemBlockTechne5;
import sub_mod.techne_block5.client.render.RenderTileEntityTechne1;
import sub_mod.techne_block5.client.render.RenderTileEntityTechne2;
import sub_mod.techne_block5.client.render.RenderTileEntityTechne3;
import sub_mod.techne_block5.client.render.RenderTileEntityTechne4;
import sub_mod.techne_block5.client.render.RenderTileEntityTechne5;
import sub_mod.techne_block5.tile.TileEntityTechne1;
import sub_mod.techne_block5.tile.TileEntityTechne2;
import sub_mod.techne_block5.tile.TileEntityTechne3;
import sub_mod.techne_block5.tile.TileEntityTechne4;
import sub_mod.techne_block5.tile.TileEntityTechne5;

public class ProxyClient extends ProxyCommon {

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTechne1.class, new RenderTileEntityTechne1());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockTechne5.block_techne1), new RenderItemBlockTechne1());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTechne2.class, new RenderTileEntityTechne2());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockTechne5.block_techne2), new RenderItemBlockTechne2());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTechne3.class, new RenderTileEntityTechne3());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockTechne5.block_techne3), new RenderItemBlockTechne3());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTechne4.class, new RenderTileEntityTechne4());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockTechne5.block_techne4), new RenderItemBlockTechne4());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTechne5.class, new RenderTileEntityTechne5());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockTechne5.block_techne5), new RenderItemBlockTechne5());

	}

}
