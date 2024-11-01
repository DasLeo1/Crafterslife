package de.crafterslife.crafterslife;

import org.bukkit.plugin.java.JavaPlugin;

public final class Crafterslife extends JavaPlugin {


    @Override
    public void onEnable() {
        getLogger().info("Crafterslife is enabled!");

        String prefix = "Crafterslife";
        // Plugin startup logic

        new Display().display(getLogger() , prefix);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Crafterslife is disabled!");

    }
}
