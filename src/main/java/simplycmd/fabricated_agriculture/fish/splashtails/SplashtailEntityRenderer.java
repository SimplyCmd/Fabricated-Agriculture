package simplycmd.fabricated_agriculture.fish.splashtails;

import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.util.Identifier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;
import simplycmd.fabricated_agriculture.Main;
import simplycmd.fabricated_agriculture.fish.FishRegister;

@Environment(EnvType.CLIENT)
public class SplashtailEntityRenderer extends MobEntityRenderer<SplashtailEntity, SplashtailEntityModel<SplashtailEntity>> {
    public SplashtailEntityRenderer(FishRegister<SplashtailEntity> fish, Context context) {
        super(context, new SplashtailEntityModel<SplashtailEntity>(context.getPart(fish.layer)), 0.4F);
    }

    @Override
    public Identifier getTexture(SplashtailEntity entity) {
        return new Identifier(Main.MOD_ID, "textures/entity/fish/splashtails/" + entity.texturePath + ".png");
    }

    @Override
    protected void setupTransforms(SplashtailEntity entity, MatrixStack matrixStack, float f, float g, float h) {
        super.setupTransforms(entity, matrixStack, f, g, h);
       float i = 4.3F * MathHelper.sin(0.6F * f);
       matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(i));
       if (!entity.isTouchingWater()) {
          matrixStack.translate(0.10000000149011612D, 0.10000000149011612D, -0.10000000149011612D);
       }
    }
}
