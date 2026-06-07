package me.novoro.cobblemonbroadcaster.util

import com.cobblemon.mod.common.api.pokemon.PokemonProperties
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity
import com.cobblemon.mod.common.pokemon.Pokemon

object PokemonUtil {

    fun Pokemon.hasSpawningProperty(properties: String = ""): Boolean {
        if (properties.equals("config-version", true)) return false;
        val props = PokemonProperties.parse(properties, " ", "=")
        return props.matches(this)
    }

    fun PokemonEntity.hasSpawningProperty(properties: String = ""): Boolean {
        if (properties.equals("config-version", true)) return false;
        val props = PokemonProperties.parse(properties, " ", "=")
        return props.matches(this)
    }

}