
package net.mcreator.test.commands;

import org.bukkit.entity.Entity;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.World;

public class Jonathanzur implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("jonathanzur")) {
			double x = 0;
			double y = 0;
			double z = 0;
			Entity entity = null;
			World world = null;
			if (sender instanceof Entity) {
				entity = (Entity) sender;
				x = entity.getLocation().getX();
				y = entity.getLocation().getX();
				z = entity.getLocation().getX();
				world = entity.getWorld();
			} else if (sender instanceof BlockCommandSender) {
				x = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				y = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				z = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				world = ((BlockCommandSender) sender).getBlock().getWorld();
			}
			return true;
		}
		return false;
	}
}
