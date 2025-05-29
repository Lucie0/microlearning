package cz.mendelu.pef.microlearning.di.db

import cz.mendelu.pef.microlearning.database.MicrolearningDao
import cz.mendelu.pef.microlearning.database.MicrolearningDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DaoModule{

    @Provides
    @Singleton
    fun provideDao(database: MicrolearningDatabase): MicrolearningDao {
        return database.dao()
    }
}