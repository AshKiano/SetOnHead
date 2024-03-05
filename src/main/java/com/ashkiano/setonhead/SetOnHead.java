package com.ashkiano.setonhead;

import org.bukkit.plugin.java.JavaPlugin;

public final class SetOnHead extends JavaPlugin {

    @Override
    public void onEnable() {
        // Registering the command executor for "setonhead" command
        this.getCommand("setonhead").setExecutor(new SetOnHeadCommandExecutor(this));

        Metrics metrics = new Metrics(this, 20940);

        this.getLogger().info("Thank you for using the SetOnHead plugin! If you enjoy using this plugin, please consider making a donation to support the development. You can donate at: https://donate.ashkiano.com");
    }
}
