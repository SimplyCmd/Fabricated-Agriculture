package simplycmd.fabricated_agriculture.fish.splashtails;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import simplycmd.fabricated_agriculture.fish.SOTFishEntity;

public class SplashtailEntity extends SOTFishEntity {
    public SplashtailEntity(String texture, EntityType<? extends SOTFishEntity> type, World world) {
        super(texture, type, world);
    }

    @Override
    public ItemStack getBucketItem() {
        return Items.COD_BUCKET.getDefaultStack();
    }
}
