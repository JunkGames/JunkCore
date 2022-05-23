package dev.merunno.junkcore;

import dev.merunno.junkcore.listeners.ChangeWorldPlayer;
import dev.merunno.junkcore.listeners.JoinPlayer;
import dev.merunno.junkcore.listeners.QuitPlayer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class JunkCore extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager plManager = Bukkit.getPluginManager();
        plManager.registerEvents(new JoinPlayer(), this);
        plManager.registerEvents(new QuitPlayer(), this);
        plManager.registerEvents(new ChangeWorldPlayer(), this);

        getLogger().info("JunkCore enabled!");
    }

    @Override
    public void onDisable() { getLogger().info("JunkCore disabled!"); }
}
