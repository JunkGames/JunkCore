package dev.merunno.junkcore;

import dev.merunno.junkcore.listeners.JoinPlayer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class JunkCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinPlayer(), this);

        getLogger().info("JunkCore enabled!");
    }

    @Override
    public void onDisable() { getLogger().info("JunkCore disabled!"); }
}
