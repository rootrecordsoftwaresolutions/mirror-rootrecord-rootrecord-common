package com.rootrecord.minecraft.common;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/**
 * Soft-depend helpers for Root-Discord. Missing plugin = Discord features stay off.
 */
public final class RootDiscordSupport {

    public static final String PLUGIN_NAME = "Root-Discord";

    private RootDiscordSupport() {
    }

    /** True when Root-Discord jar is present and enabled. */
    public static boolean isPluginEnabled() {
        Plugin discord = Bukkit.getPluginManager().getPlugin(PLUGIN_NAME);
        return discord != null && discord.isEnabled();
    }

    /**
     * Log once-style boot warning when Discord features will not post.
     * Safe to call every enable; does nothing when Root-Discord is loaded.
     */
    public static void warnIfMissing(Plugin consumer, String features) {
        if (consumer == null || isPluginEnabled()) {
            return;
        }
        String featureText = features == null || features.isBlank() ? "Discord features" : features;
        consumer.getLogger().warning(
                "Root-Discord not installed — " + featureText
                        + " will not post to Discord. Install Root-Discord and set cloud.yml discord.* to enable.");
    }
}
