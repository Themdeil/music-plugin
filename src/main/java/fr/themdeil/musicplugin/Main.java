package fr.themdeil.musicplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();

        getLogger().info("Plugin activé");
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Plugin désactivé");
    }
}