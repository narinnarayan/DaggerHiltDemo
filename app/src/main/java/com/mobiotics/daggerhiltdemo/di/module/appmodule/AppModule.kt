package com.mobiotics.daggerhiltdemo.di.module.appmodule

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class) // Application component deprecated latest versions
class AppModule {
}