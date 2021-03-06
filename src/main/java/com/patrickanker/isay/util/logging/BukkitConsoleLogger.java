package com.patrickanker.isay.util.logging;

import java.util.logging.Level;
import org.bukkit.Bukkit;


public class BukkitConsoleLogger extends ConsoleLogger {

    private final String pluginName;
    
    public BukkitConsoleLogger(String plugin)
    {
        this.pluginName = plugin;
    }
    
    @Override
    public void log(String str)
    {
        log(str, 0);
    }

    @Override
    public void log(String str, int importance)
    {
        if (importance == 0) {
            Bukkit.getLogger().log(Level.INFO, "[{0}] {1}", new Object[] {this.pluginName, str});
        } else if (importance == 1) {
            Bukkit.getLogger().log(Level.WARNING, "[{0}] {1}", new Object[] {this.pluginName, str});
        } else if (importance == 2) {
            Bukkit.getLogger().log(Level.SEVERE, "[{0}] {1}", new Object[] {this.pluginName, str});
        }
    }

    @Override
    public void log(String str, String module, int importance)
    {
        if (importance == 0) {
            Bukkit.getLogger().log(Level.INFO, "[{0}:{1}] {2}", new Object[] {this.pluginName, module, str});
        } else if (importance == 1) {
            Bukkit.getLogger().log(Level.WARNING, "[{0}:{1}] {2}", new Object[] {this.pluginName, module, str});
        } else if (importance == 2) {
            Bukkit.getLogger().log(Level.SEVERE, "[{0}:{1}] {2}", new Object[] {this.pluginName, module, str});
        }
    }
}
