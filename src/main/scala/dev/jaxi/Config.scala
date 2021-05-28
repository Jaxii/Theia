package dev.jaxi
import com.google.gson
import com.google.gson.GsonBuilder
import net.fabricmc.loader.api.FabricLoader


object Config {

  private val GSON = new GsonBuilder().setPrettyPrinting.create

  def load(): Unit = {
    val configDir = FabricLoader.getInstance.getConfigDir.normalize.resolve("theia")

  }

}
