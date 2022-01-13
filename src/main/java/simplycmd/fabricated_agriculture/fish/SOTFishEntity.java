package simplycmd.fabricated_agriculture.fish;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.SchoolingFishEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public abstract class SOTFishEntity extends SchoolingFishEntity {
    public final String texturePath;

    public SOTFishEntity(String texture, EntityType<? extends SchoolingFishEntity> entityType, World world) {
        super(entityType, world);
        this.texturePath = texture;
    }

    @Override
    public int getMaxGroupSize() {
        return 5;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.ENTITY_SALMON_FLOP;
    }
}
