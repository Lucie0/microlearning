package cz.mendelu.pef.microlearning.di

import cz.mendelu.pef.microlearning.communication.API
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RemoteRepositoryModule {

    @Provides
    @Singleton
    fun provideRemoteRepository(api: API): RemoteRepositoryImpl {
        return RemoteRepositoryImpl(api)
    }
}
