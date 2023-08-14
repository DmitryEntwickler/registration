package de.emgress.registration.commonComposables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.emgress.registration.screens.homeScreen.dtos.KrimiAuthorDTO

@Composable
fun AuthorItem(autor: KrimiAuthorDTO){

    Column(modifier = Modifier
        .fillMaxWidth().padding(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "${autor.vorname} ${autor.name}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "${autor.von}-${autor.bis}",
                style = MaterialTheme.typography.titleMedium
            )
        }
        AuthorBodyText(txt = "Pseudonym: ${autor.pseudonym}")
        AuthorBodyText(txt = autor.land)
        AuthorBodyText(txt = "Genre: ${autor.genre}")
    }
}