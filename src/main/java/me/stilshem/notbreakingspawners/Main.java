package me.stilshem.notbreakingspawners;

import me.stilshem.notbreakingspawners.Handler.ExplosionEventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[NBS] => Enabled");
        getServer().getPluginManager().registerEvents(new ExplosionEventHandler(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("[NBS] => Disabled");
    }
}
