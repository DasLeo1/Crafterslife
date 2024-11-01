package de.crafterslife.crafterslife;

import java.util.logging.Logger;

import static org.bukkit.Bukkit.getName;

public class Display {
    public void display(Logger logger , String string ) {
        logger.info(string + "Display");
        logger.info( " " );
        logger.info("------" + getName() + "------");
        logger.info(" ");
        logger.info("Crafterslife is enabled!");
        logger.info(" ");
        logger.info("------" + getName() + "------");






    }
}
