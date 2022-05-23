package dev.merunno.junkcore.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinPlayer implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String playerName = player.getName();

        // サーバーのログインメッセージ
        event.joinMessage(Component.text(playerName + "がJunkGamesにログインしました", NamedTextColor.YELLOW));

        // 軽い遊び方とルールリンク
        player.sendMessage(Component.text(playerName + "さん、ようこそ!", NamedTextColor.GOLD));
        player.sendMessage(Component.text("/jgselector から遊ぶミニゲームを選ぼう!", NamedTextColor.GOLD));
        player.sendMessage(Component.text("ルール: https://www.azisaba.net/minecraft-all-srv-rule/", NamedTextColor.GOLD));
    }
}
