/*
Theia: an open-source anti-cheat for fabric-modloader
Copyright (C) 2021 Jaxii

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package dev.jaxi
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
import com.google.gson
import net.fabricmc.api.ModInitializer
import net.minecraft.server.MinecraftServer
import net.minecraft.util.profiler.Profiler
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import dev.jaxi.Config



/*

important?

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents


 */

import net.minecraft.entity.mob.EndermanEntity
//Anti-xray: Don't render/tick all ore blocks that are naturally generated and not touching air, and check on every block break if it "reveals" ores to render them


class TheiaMod extends ModInitializer {

	val MODID = "theia"
	val MOD_NAME = "Theia Anti-Cheat"
	val LOG: Logger = LogManager.getLogger(MOD_NAME)

	override def onInitialize(): Unit = {



		ServerLifecycleEvents.SERVER_STOPPING.register((_: MinecraftServer) => {
			LOG.traceExit()
		})



	}


}
