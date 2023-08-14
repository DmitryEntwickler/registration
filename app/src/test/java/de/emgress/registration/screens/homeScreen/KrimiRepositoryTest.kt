package de.emgress.registration.screens.homeScreen

import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class KrimiRepositoryTest{

    lateinit var mUUT: KrimiRepository

    @Before
    fun setUp() {
        mUUT = KrimiRepository()
    }

    @Test
    fun test_fetchData_bad_api(){
        mUUT.mApiKrimiAuthors = "http://jkap.eu/api/api_bad.php"
        runBlocking {
            assertTrue("API is nicht korrekt, aber Result ist Success", mUUT.fetchAllKrimiAuthors().isFailure)
        }
    }
}