package io.github.asheept

import io.github.monun.kommand.kommand
import org.bukkit.plugin.java.JavaPlugin

class KotlinPlugin : JavaPlugin() {

    override fun onEnable() {

        println("hello")

        server.pluginManager.registerEvents(KotlinListener(), this)
        setupCommands()
    }


    private fun setupCommands() = kommand { KommandCmd.register(this@KotlinPlugin, this) }
}