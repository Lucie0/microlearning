package cz.mendelu.pef.microlearning.di.db

import cz.mendelu.pef.microlearning.MainApplication
import cz.mendelu.pef.microlearning.database.MicrolearningDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(): MicrolearningDatabase {
        return MicrolearningDatabase.getDatabase(MainApplication.appContext)
    }
}
