package com.example.fizzbuzz.presentation.first_screen

import androidx.lifecycle.ViewModel
import com.example.fizzbuzz.domain.usecase.ValidateFormUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainViewModel : ViewModel(), KoinComponent {

    private val validateFormUseCase: ValidateFormUseCase by inject()

    fun validFirstInteger(firstInt: String): String? {
        return validateFormUseCase.validFirstInteger(firstInt)
    }

    fun validSecondInteger(firstInt: String, secondInt: String): String? {
        return validateFormUseCase.validSecondInteger(firstInt, secondInt)
    }

    fun validLimit(int2: String, limit: String): String? {

        return validateFormUseCase.validLimit(int2, limit)
    }

    fun validStrings(str: String): String? {
        return validateFormUseCase.validStrings(str)
    }

}



