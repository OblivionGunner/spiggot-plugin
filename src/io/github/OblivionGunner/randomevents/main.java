package io.github.OblivionGunner.randomevents;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin {
    public void onEnable(){
        Bukkit.getLogger().info("Random Events Started");
    }
    public void onDisable(){
        Bukkit.getLogger().info("Random Events Disabled");
    }
    //command handler
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        return false;
    }
}
