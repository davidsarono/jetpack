package id.compose.jetpack.data.repository

import id.compose.jetpack.data.api.CharacterData
import id.compose.jetpack.data.model.Character
import javax.inject.Inject

class CharacterRepository @Inject constructor() {
    fun getCharacters(): List<Character> {
        return CharacterData.characters
    }
}