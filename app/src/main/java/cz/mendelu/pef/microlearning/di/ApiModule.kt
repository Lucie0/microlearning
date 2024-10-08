package cz.mendelu.pef.microlearning.di


import cz.mendelu.pef.microlearning.communication.API
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): API {
        return retrofit.create(API::class.java)
    }

}