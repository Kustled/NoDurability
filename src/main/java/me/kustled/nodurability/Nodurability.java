package me.kustled.nodurability;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Nodurability extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("The NoDurability plugin was enabled.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerItemDamaged(PlayerItemDamageEvent dmgevent) {
        dmgevent.setCancelled(true);
    }

    @Override
    public void onDisable() {
        System.out.println("The NoDurability plugin was disabled.");
    }
}
