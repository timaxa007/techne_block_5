package sub_mod.techne_block5.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import sub_mod.techne_block5.ModBlockTechne5;
import sub_mod.techne_block5.tile.TileEntityTechne4;

public class BlockTechne4 extends Block implements ITileEntityProvider {

	public BlockTechne4() {
		super(Material.circuits);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.25F);
		setStepSound(soundTypeMetal);
		setBlockTextureName("iron_block");
		setBlockName(ModBlockTechne5.MODID + ".block_techne4");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityTechne4();
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
