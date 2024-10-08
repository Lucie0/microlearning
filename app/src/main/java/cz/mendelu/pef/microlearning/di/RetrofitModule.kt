package cz.mendelu.pef.microlearning.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    @Singleton
    fun provideMoshiConverter(): Moshi =
        Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    // todo NGROK URL
    //https://d600-195-113-216-27.ngrok-free.app/lessons/1
    @Provides
    @Singleton
    fun provideRetrofit(moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://55aa-94-113-102-25.ngrok-free.app/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }
}