package io.github.OblivionGunner.randomevents;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Random;

public class wisper {
    public void onDecline(){
        return;
    }
    public void onAccept(){

    }
    public void makeRequest(){


    }
    public Object getPlayer(){
        ArrayList<Player> allPlayers = new ArrayList<>();
        for(Player players : Bukkit.getOnlinePlayers()) {
            allPlayers.add(players);
        }
        int random = new Random().nextInt(allPlayers.size());
        Object picked = allPlayers.get(random);
        return picked;
    }

}
