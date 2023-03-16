package io.rapidz.kmmbridgekickstart

import io.rapidz.kmmbridgekickstart.ktor.DogApi
import io.rapidz.kmmbridgekickstart.ktor.DogApiImpl
import io.rapidz.kmmbridgekickstart.repository.BreedRepository
import com.russhwolf.settings.Settings
import com.squareup.sqldelight.db.SqlDriver
import io.ktor.client.engine.HttpClientEngine
import kotlinx.coroutines.Dispatchers
import kotlinx.datetime.Clock

internal const val SETTINGS_KEY = "KMMBridgeKickStartSettings"
internal const val DB_NAME = "KMMBridgeKickStartDb"

internal abstract class BaseServiceLocator(private val analyticsHandle: AnalyticsHandle) : ServiceLocator {

    override val breedRepository: BreedRepository by lazy {
        BreedRepository(
            dbHelper = databaseHelper,
            settings = settings,
            dogApi = dogApi,
            clock = Clock.System,
            breedAnalytics = breedAnalytics
        )
    }

    override val appAnalytics: AppAnalytics
        get() = analyticsHandle.appAnalytics

    override val breedAnalytics: BreedAnalytics
        get() = analyticsHandle.breedAnalytics

    override val httpClientAnalytics: HttpClientAnalytics
        get() = analyticsHandle.httpClientAnalytics

    private val databaseHelper: DatabaseHelper by lazy {
        DatabaseHelper(
            sqlDriver = sqlDriver,
            backgroundDispatcher = Dispatchers.Default,
            breedAnalytics = breedAnalytics
        )
    }

    private val dogApi: DogApi by lazy {
        DogApiImpl(engine = clientEngine, httpClientAnalytics = httpClientAnalytics, breedAnalytics = breedAnalytics)
    }

    protected abstract val sqlDriver: SqlDriver
    protected abstract val settings: Settings
    protected abstract val clientEngine: HttpClientEngine
}
