package com.sametersoyoglu.hiltkullanimi.di

import com.sametersoyoglu.hiltkullanimi.Adres
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideAdres() : Adres {
        return Adres("Kadıköy / İSTANBUL")
    }
}