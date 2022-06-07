package me.stilshem.notbreakingspawners.Handler;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionEventHandler implements Listener {

    @EventHandler
    public void on(EntityExplodeEvent e) {
        e.blockList().removeIf(block -> block.getType().equals(Material.SPAWNER));
    }

}
