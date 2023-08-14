package de.emgress.registration.commonComposables

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AuthorBodyText(txt: String){
    Text(
        text = txt,
        style = MaterialTheme.typography.bodySmall
    )
}