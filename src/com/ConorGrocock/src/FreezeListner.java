package com.ConorGrocock.src;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class FreezeListner implements Listener{
	public static freeze plugin;
	
	public FreezeListner(freeze instance){
		plugin = instance;
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		if(plugin.freeze){
			Player p = event.getPlayer();
			p.teleport(p);
		}
	}
}
