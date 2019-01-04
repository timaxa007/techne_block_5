package sub_mod.techne_block5;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import sub_mod.techne_block5.block.BlockTechne1;
import sub_mod.techne_block5.block.BlockTechne2;
import sub_mod.techne_block5.block.BlockTechne3;
import sub_mod.techne_block5.block.BlockTechne4;
import sub_mod.techne_block5.block.BlockTechne5;
import sub_mod.techne_block5.tile.TileEntityTechne1;
import sub_mod.techne_block5.tile.TileEntityTechne2;
import sub_mod.techne_block5.tile.TileEntityTechne3;
import sub_mod.techne_block5.tile.TileEntityTechne4;
import sub_mod.techne_block5.tile.TileEntityTechne5;

@Mod (modid = ModBlockTechne5.MODID, name = ModBlockTechne5.MODNAME, version = ModBlockTechne5.VERSION)

public class ModBlockTechne5 {

	public static final String MODID = "sub_mod_techne_block_5";
	public static final String MODNAME = "SM_TB (x5)";
	public static final String VERSION = "0.2a";

	@Instance(ModBlockTechne5.MODID) public static ModBlockTechne5 instance;
	@SidedProxy(modId = ModBlockTechne5.MODID, clientSide = "sub_mod.techne_block5.client.ProxyClient", serverSide = "sub_mod.techne_block5.ProxyCommon")
	public static ProxyCommon proxy;

	public static Block
	block_techne1,
	block_techne2,
	block_techne3,
	block_techne4,
	block_techne5
	;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		block_techne1 = new BlockTechne1();
		GameRegistry.registerBlock(block_techne1, "block_techne1");
		GameRegistry.registerTileEntity(TileEntityTechne1.class, "TileEntityTechne1");

		block_techne2 = new BlockTechne2();
		GameRegistry.registerBlock(block_techne2, "block_techne2");
		GameRegistry.registerTileEntity(TileEntityTechne2.class, "TileEntityTechne2");

		block_techne3 = new BlockTechne3();
		GameRegistry.registerBlock(block_techne3, "block_techne3");
		GameRegistry.registerTileEntity(TileEntityTechne3.class, "TileEntityTechne3");

		block_techne4 = new BlockTechne4();
		GameRegistry.registerBlock(block_techne4, "block_techne4");
		GameRegistry.registerTileEntity(TileEntityTechne4.class, "TileEntityTechne4");

		block_techne5 = new BlockTechne5();
		GameRegistry.registerBlock(block_techne5, "block_techne5");
		GameRegistry.registerTileEntity(TileEntityTechne5.class, "TileEntityTechne5");

		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

}