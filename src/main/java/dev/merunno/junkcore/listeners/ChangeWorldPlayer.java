package dev.merunno.junkcore.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class ChangeWorldPlayer implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onMove(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();
        String toWorldName = event.getFrom().getName();
        Server jg = Bukkit.getServer();

        jg.broadcast(Component.text(player.getName() + "が" + toWorldName + "へ移動しました"));
    }
}
