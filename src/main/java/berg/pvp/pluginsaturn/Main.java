package berg.pvp.pluginsaturn;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.broadcastMessage("Hallo");
        System.out.println("BergPVPPlugin has been enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
