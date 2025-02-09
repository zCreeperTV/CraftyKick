package de.zcreeper.craftykick;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;


public class KickCommand extends Command {
    public KickCommand() {
        super("kick", "craftykick.command.kick");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (args.length < 2) {
            sender.sendMessage(ChatColor.RED + "Usage: /kick <Player> <Reason>");
            return;
        }

        ProxiedPlayer target = ProxyServer.getInstance().getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Player not found.");
            return;
        }

        if (target.hasPermission("craftykick.bypass")) {
            sender.sendMessage(ChatColor.RED + "You cannot kick this player!");
            return;
        }

        String reason = ChatColor.translateAlternateColorCodes('&', String.join(" ", args).substring(args[0].length()).trim());
        target.disconnect(ChatColor.RED + "You have been kicked!\n Reason: " + ChatColor.RESET + reason);
        sender.sendMessage(ChatColor.GREEN + "Successfully kicked " + target.getName() + " for: " + reason);
    }
}


