package de.vendettagroup.NoCrepperEndermanMobgriefing;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NoCrepperEndermanMobgriefing is enabeld");
        this.getServer().getPluginManager().registerEvents(new NoCrepperEndermanMobgriefing(), this);
    }


    @Override
    public void onDisable() {
        super.onDisable();
    }
}
