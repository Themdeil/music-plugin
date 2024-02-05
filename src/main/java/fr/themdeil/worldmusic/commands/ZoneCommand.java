package fr.themdeil.worldmusic.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ZoneCommand implements CommandExecutor {

    // /wm setZonePoint <name>
    // /wm setZonePoint <name> <x> <y> <z>
    // /wm listZonePoints <name>
    // /wm removeZonePoint <name> <x> <y> <z>
    // /wm removeZonePoint <name> <n:number>
    // /wm purgeZonePoints <name>
    // /wm addZone <name>
    // /wm removeZone <name>
    // /wm listZones
    // /wm addZoneMusic <name> <url>
    // /wm listZoneMusics <name>
    // /wm removeZoneMusic <name> <url>
    // /wm removeZoneMusic <name> <n:number>
    // /wm purgeZoneMusics <name>
    // /wm manageZonePlaylist <name> loop
    // /wm manageZonePlaylist <name> shuffle
    // /wm manageZonePlaylist <name> stop
    // /wm manageZonePlaylist <name> play
    // /wm help

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.hasPermission("worldmusic.play")) {
                if (args.length == 0) {
                    player.sendMessage(this.formatHelp());

                } else if (args.length == 1) {
                    switch (args[0]) {
                        case "setZonePoint":
                            break;
                        case "listZonePoints":
                            break;
                        case "removeZonePoint":
                            break;
                        case "purgeZonePoints":
                            break;
                        case "addZone":
                            break;
                        case "removeZone":
                            break;
                        case "listZones":
                            break;
                        case "addZoneMusic":
                            break;
                        case "listZoneMusics":
                            break;
                        case "removeZoneMusic":
                            break;
                        case "manageZonePlaylist":
                            break;
                        case "help":
                            player.sendMessage(this.formatHelp());
                            break;
                        default:
                            break;
                    }

                }
            }
        }
        return false;
    }

    private String formatHelp() {
        String message;
        message = "§c/wm setZonePoint <name>\n" +
                "§c/wm setZonePoint <name> <x> <y> <z>\n" +
                "§c/wm listZonePoints <name>\n" +
                "§c/wm removeZonePoint <name> <x> <y> <z>\n" +
                "§c/wm removeZonePoint <name> <n:number>\n" +
                "§c/wm purgeZonePoints <name>\n" +
                "§c/wm addZone <name>\n" +
                "§c/wm removeZone <name>\n" +
                "§c/wm listZones\n" +
                "§c/wm addZoneMusic <name> <url>\n" +
                "§c/wm listZoneMusics <name>\n" +
                "§c/wm removeZoneMusic <name> <url>\n" +
                "§c/wm removeZoneMusic <name> <n:number>\n" +
                "§c/wm purgeZoneMusics <name>\n" +
                "§c/wm manageZonePlaylist <name> loop\n" +
                "§c/wm manageZonePlaylist <name> shuffle\n" +
                "§c/wm manageZonePlaylist <name> stop\n" +
                "§c/wm manageZonePlaylist <name> play\n" +
                "§c/wm help";

        return message;
    }

}
