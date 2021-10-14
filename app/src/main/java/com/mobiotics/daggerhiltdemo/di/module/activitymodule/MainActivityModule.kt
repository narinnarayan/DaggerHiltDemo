package com.mobiotics.daggerhiltdemo.di.module.activitymodule

import com.mobiotics.daggerhiltdemo.ui.mainactivity.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class) // it will avail only to Activity
class MainActivityModule {

    @Provides
    @ActivityScoped // activity single time object creation
    @Title // same return type
    fun provideTitle(): String = "Dagger Hilt"

    @Provides
    @ActivityScoped
    @Header  // same return type
    fun provideHeader(): String = "dependency Injection"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Title

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Header