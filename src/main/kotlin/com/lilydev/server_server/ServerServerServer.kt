package com.lilydev.server_server

import net.fabricmc.api.DedicatedServerModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ServerServerServer : DedicatedServerModInitializer {

    const val MOD_ID: String = "server_server"
    const val MOD_NAME: String = "ServerServer"

    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_NAME)

    override fun onInitializeServer() {
        LOGGER.info("Hello Fabric world from $MOD_NAME!")
    }
}