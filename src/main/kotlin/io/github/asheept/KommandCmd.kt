package io.github.asheept

import io.github.monun.kommand.PluginKommand
import net.kyori.adventure.text.Component.text
import org.bukkit.plugin.Plugin

object KommandCmd {

    lateinit var plugin: KotlinPlugin

    internal fun register(plugin: KotlinPlugin, kommand: PluginKommand)
    {
        this.plugin = plugin

        kommand.register("hello") {
            requires { sender.isOp }

            executes { sender.sendMessage(text("hello")) }
        }
    }
}