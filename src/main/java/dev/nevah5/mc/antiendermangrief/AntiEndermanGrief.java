package dev.nevah5.mc.antiendermangrief;

import org.bukkit.Bukkit;
import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiEndermanGrief extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void endermanPickup(EntityChangeBlockEvent entityChangeBlockEvent) {
        if(entityChangeBlockEvent.getEntity() instanceof Enderman){
            entityChangeBlockEvent.setCancelled(true);
        }
    }
}
