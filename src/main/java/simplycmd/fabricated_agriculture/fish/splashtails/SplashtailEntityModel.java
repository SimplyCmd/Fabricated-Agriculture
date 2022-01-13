package simplycmd.fabricated_agriculture.fish.splashtails;

import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CodEntityModel;
import net.minecraft.entity.Entity;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class SplashtailEntityModel<T extends Entity> extends CodEntityModel<T> {
    public SplashtailEntityModel(ModelPart root) {
        super(root);
    }
}
