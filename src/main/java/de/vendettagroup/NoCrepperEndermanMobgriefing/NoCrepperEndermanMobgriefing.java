package de.vendettagroup.NoCrepperEndermanMobgriefing;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class NoCrepperEndermanMobgriefing implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onEntityChangeBlock(EntityChangeBlockEvent event) {
        if(event.getEntityType() == EntityType.ENDERMAN) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onEntityExplode(EntityExplodeEvent event) {
        Entity ent = event.getEntity();
        if(ent instanceof Creeper) {
            event.blockList().clear();
            return;
        }
        if(ent instanceof WitherSkull) {
            event.blockList().clear();
            return;
        }
        if(event.getEntity() instanceof Wither) {
            event.blockList().clear();
        }
    }


}
