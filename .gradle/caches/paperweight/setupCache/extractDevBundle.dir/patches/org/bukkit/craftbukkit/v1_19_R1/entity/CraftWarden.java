package org.bukkit.craftbukkit.v1_19_R1.entity;

import com.google.common.base.Preconditions;
import net.minecraft.world.entity.monster.warden.Warden;
import org.bukkit.craftbukkit.v1_19_R1.CraftServer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class CraftWarden extends CraftMonster implements org.bukkit.entity.Warden {

    public CraftWarden(CraftServer server, Warden entity) {
        super(server, entity);
    }

    @Override
    public Warden getHandle() {
        return (Warden) entity;
    }

    @Override
    public String toString() {
        return "CraftWarden";
    }

    @Override
    public EntityType getType() {
        return EntityType.WARDEN;
    }

    @Override
    public int getAnger(Entity entity) {
        Preconditions.checkArgument(entity != null, "Entity cannot be null");

        return this.getHandle().getAngerManagement().getActiveAnger(((CraftEntity) entity).getHandle());
    }

    @Override
    public void increaseAnger(Entity entity, int increase) {
        Preconditions.checkArgument(entity != null, "Entity cannot be null");

        this.getHandle().getAngerManagement().increaseAnger(((CraftEntity) entity).getHandle(), increase);
    }

    @Override
    public void setAnger(Entity entity, int anger) {
        Preconditions.checkArgument(entity != null, "Entity cannot be null");

        this.getHandle().clearAnger(((CraftEntity) entity).getHandle());
        this.getHandle().getAngerManagement().increaseAnger(((CraftEntity) entity).getHandle(), anger);
    }
}
