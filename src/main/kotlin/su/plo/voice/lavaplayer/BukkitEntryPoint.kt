package su.plo.voice.lavaplayer

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import su.plo.voice.api.server.PlasmoVoiceServer

class BukkitEntryPoint : JavaPlugin() {

    private val pvAddonLavaplayerLib = LavaPlayerAddon()

    override fun onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlasmoVoice") != null) {
            try {
                PlasmoVoiceServer.getAddonsLoader().load(pvAddonLavaplayerLib)
            } catch (e: Throwable) {
                slF4JLogger.warn("Failed to load Plasmo Voice addon: ${e.message}")
            }
        } else {
            slF4JLogger.info("LavaPlayer library loaded in standalone mode")
        }
    }

    override fun onDisable() {
        if (Bukkit.getPluginManager().getPlugin("PlasmoVoice") != null) {
            try {
                PlasmoVoiceServer.getAddonsLoader().unload(pvAddonLavaplayerLib)
            } catch (_: Throwable) {}
        }
    }
}

