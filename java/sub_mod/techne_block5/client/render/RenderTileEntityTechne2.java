package sub_mod.techne_block5.client.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import sub_mod.techne_block5.ModBlockTechne5;
import sub_mod.techne_block5.client.ModelBlock;
import sub_mod.techne_block5.tile.TileEntityTechne2;

public class RenderTileEntityTechne2 extends TileEntitySpecialRenderer {

	public static final ModelBlock model = new ModelBlock();
	public static final ResourceLocation texture = new ResourceLocation(ModBlockTechne5.MODID, "textures/blocks/model_techne2.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileEntityTechne2)tile, x, y, z, f);
	}

	private void render(TileEntityTechne2 tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
	}

}
