package com.example.fizzbuzz.di

import com.example.fizzbuzz.domain.usecase.GenerateListUseCase
import com.example.fizzbuzz.domain.usecase.ValidationUseCase
import com.example.fizzbuzz.presentation.first_screen.MainViewModel
import com.example.fizzbuzz.presentation.second_screen.ItemRVAdapter
import com.example.fizzbuzz.presentation.second_screen.ResultViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {

    // View models
    val viewModelModule = module {
        viewModel { MainViewModel() }
        viewModel { ResultViewModel() }
    }

    // Use cases
    val useCasesModule = module {
        factory { ValidationUseCase() }
        factory { GenerateListUseCase() }
    }
/*
    // UI components
    val adapterModule = module {
        // Media posts list adapter
        factory { ItemRVAdapter(c) }
    }
    */

}