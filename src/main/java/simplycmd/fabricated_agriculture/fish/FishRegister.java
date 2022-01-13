package simplycmd.fabricated_agriculture.fish;

import io.github.simplycmd.featherlib.registry.ID;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.TexturedModelDataProvider;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;
import simplycmd.fabricated_agriculture.Entities;
import simplycmd.fabricated_agriculture.fish.splashtails.SplashtailEntity;

public class FishRegister<T extends LivingEntity> {
    private final EntityType<T> type;
    private final ID id;
    public final EntityModelLayer layer;

    FishRegister(ID fish, EntityType.EntityFactory<T> factory) {
        this.type = Registry.register(
            Registry.ENTITY_TYPE,
            fish.getIdentifier(),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_AMBIENT, factory).trackRangeBlocks(4).dimensions(EntityDimensions.changing(0.5f, 0.3f)).build()
        );
        this.id = fish;
        this.layer = Entities.regLayer(id.getId());
    }

    public <E extends Entity> void client(EntityRendererFactory<T> renderFactory, TexturedModelDataProvider provider) {
        EntityRendererRegistry.register(type, renderFactory);
        EntityModelLayerRegistry.registerModelLayer(layer, provider);
    }

    public void server() {
        FabricDefaultAttributeRegistry.register(type, SplashtailEntity.createMobAttributes());
    }
}