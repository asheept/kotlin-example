package org.bukkit.craftbukkit.v1_19_R1.entity;

import net.minecraft.world.entity.animal.allay.Allay;
import org.bukkit.craftbukkit.v1_19_R1.CraftServer;
import org.bukkit.craftbukkit.v1_19_R1.inventory.CraftInventory;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.Inventory;

public class CraftAllay extends CraftCreature implements org.bukkit.entity.Allay {

    public CraftAllay(CraftServer server, Allay entity) {
        super(server, entity);
    }

    @Override
    public Allay getHandle() {
        return (Allay) entity;
    }

    @Override
    public String toString() {
        return "CraftAllay";
    }

    @Override
    public EntityType getType() {
        return EntityType.ALLAY;
    }

    @Override
    public Inventory getInventory() {
        return new CraftInventory(this.getHandle().getInventory());
    }
}
