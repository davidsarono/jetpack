package id.compose.jetpack.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import id.compose.jetpack.ui.composable.CharacterCard
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CharacterListScreen(characterViewModel: CharacterViewModel = viewModel()) {
    val characters = characterViewModel.characters.value

    Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            characters.forEach { character ->
                CharacterCard(
                    url = character.image,
                    name = character.name,
                    ethnicity = character.bio.ethnicity
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}