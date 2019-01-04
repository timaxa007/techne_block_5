package sub_mod.techne_block5.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import sub_mod.techne_block5.ModBlockTechne5;
import sub_mod.techne_block5.tile.TileEntityTechne5;

public class BlockTechne5 extends Block implements ITileEntityProvider {

	public BlockTechne5() {
		super(Material.circuits);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.25F);
		setStepSound(soundTypeMetal);
		setBlockTextureName("iron_block");
		setBlockName(ModBlockTechne5.MODID + ".block_techne5");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityTechne5();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

}
