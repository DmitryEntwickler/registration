package de.emgress.registration.commonComposables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import de.emgress.registration.R
import de.emgress.registration.database.tables.UserEntity

@Composable
fun UserInfoComposable(user: UserEntity) {

    Column(modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "${stringResource(id = R.string.name)}: ",
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "${user.mName}")
        }
        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "${stringResource(id = R.string.surname)}: ",
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "${user.mSurname}")
        }
        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "${stringResource(id = R.string.adress)}: ",
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "${user.mAdress}")
        }
        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "${stringResource(id = R.string.city)}: ",
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "${user.mCity}")
        }
        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "${stringResource(id = R.string.email)}: ",
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "${user.mEmail}")
        }
    }
}