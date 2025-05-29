package cz.mendelu.pef.microlearning.di.db

import cz.mendelu.pef.microlearning.database.IMicrolearningRepository
import cz.mendelu.pef.microlearning.database.MicrolearningDao
import cz.mendelu.pef.microlearning.database.MicrolearningRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(dao: MicrolearningDao): IMicrolearningRepository {
        return MicrolearningRepositoryImpl(dao)
    }
}
