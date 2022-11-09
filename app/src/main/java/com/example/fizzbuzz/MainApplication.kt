package com.example.fizzbuzz

import android.app.Application
import com.example.fizzbuzz.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class MainApplication   : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()
        configureDI()
    }

    /**
     * Configure dependency injection library (Koin)
     */
    private fun configureDI() {
        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(

                AppModule.viewModelModule,
                AppModule.useCasesModule,
                //AppModule.adapterModule
            )
        }
    }
}