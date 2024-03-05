package com.ashkiano.setonhead;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SetOnHeadCommandExecutor implements CommandExecutor {

    private final SetOnHead plugin;

    public SetOnHeadCommandExecutor(SetOnHead plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack itemInHand = player.getInventory().getItemInMainHand();

            if (itemInHand != null) {
                player.getInventory().setHelmet(itemInHand);
                player.getInventory().setItemInMainHand(null);
                player.sendMessage("Item has been set on your head!");
            } else {
                player.sendMessage("You need to hold an item in your hand!");
            }
            return true;
        }
        sender.sendMessage("This command can only be used by players.");
        return false;
    }
}
