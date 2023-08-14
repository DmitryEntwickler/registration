package de.emgress.registration.screens.homeScreen

import androidx.lifecycle.MutableLiveData
import de.emgress.registration.screens.homeScreen.dtos.KrimiAuthorDTO
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json

class KrimiRepository {

    val mApiKrimiAuthors = "http://jkap.eu/api/api_db_krimi.php"
    val mListOfKrimiAuthorsDTO: MutableLiveData<List<KrimiAuthorDTO>> = MutableLiveData()

    private val mHttpClient = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }
    suspend fun fetchAllKrimiAuthors() {
        withContext(Dispatchers.IO) {
            val responseKrimiAuthors: List<KrimiAuthorDTO> = mHttpClient.get(mApiKrimiAuthors).body()
            withContext(Dispatchers.Main) {
                mListOfKrimiAuthorsDTO.value = responseKrimiAuthors
            }
        }
    }
}