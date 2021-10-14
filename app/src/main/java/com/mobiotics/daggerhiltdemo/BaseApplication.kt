package com.mobiotics.daggerhiltdemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
// it acts like container
// it provide dependency using @Inject like parameter(field), constructor injection
@HiltAndroidApp
class BaseApplication : Application()