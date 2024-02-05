package fr.themdeil.worldmusic;

import fr.themdeil.worldmusic.commands.ZoneCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Worldmusic extends JavaPlugin implements Listener {
    private final Logger LOGGER = Logger.getLogger("WorldMusic");

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("wm").setExecutor(new ZoneCommand());
        getServer().getPluginManager().registerEvents(this,this);
        LOGGER.info("Plugin enabled!");
        // Add your startup logic here
        }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        LOGGER.info("Plugin disabled!");
        // Add your shutdown logic here
    }

}
