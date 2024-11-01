package de.crafterslife.crafterslife;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Crafterslife extends JavaPlugin {


    @Override
    public void onEnable() {
        String prefix = "Crafterslife";
        // Plugin startup logic

        new Display().display(getLogger() , prefix);






        try {
            getLogger().log(Level.INFO, "All System`s loaded");   //Alles in bester ordnung
        } catch (Exception exception) {
            getLogger().log(Level.WARNING, "loading onEnable has failed", exception);  //Plugin kann nicht geladen werden , gibt fehler aus
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Crafterslife is disabled!");

    }
}
