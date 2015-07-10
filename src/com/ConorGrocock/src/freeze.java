package com.ConorGrocock.src;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class freeze extends JavaPlugin {
	public int num = 3;
	public boolean freeze = false;
	public final FreezeListner fl = new FreezeListner(this);
	
	public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager(); 
		pm.registerEvents(fl, this);
	}

	public void onDisable() {
	}


	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("freeze")){
			if(args.length == 0){
				if(freeze){
					freeze = false;
				}else{
					freeze = true;
				}
			}
		}
		return false;
	}
}
