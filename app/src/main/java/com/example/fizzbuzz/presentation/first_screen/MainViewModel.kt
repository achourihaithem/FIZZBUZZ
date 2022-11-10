package com.example.fizzbuzz.presentation.first_screen

import androidx.lifecycle.ViewModel
import com.example.fizzbuzz.domain.usecase.ValidateFormUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainViewModel : ViewModel(), KoinComponent {

    private val validateFormUseCase: ValidateFormUseCase by inject()

    /**
     * check that the 1st int is higher or equals 1
     */
    fun validFirstInteger(firstInt: String): String? {
        return validateFormUseCase.validFirstInteger(firstInt)
    }

    /**
     * check that the 2nd int is higher or equals 1
     * check that the 2nd int is higher or equals 1st int
     */
    fun validSecondInteger(firstInt: String, secondInt: String): String? {
        return validateFormUseCase.validSecondInteger(firstInt, secondInt)
    }

    /**
     * check that the limit is higher or equals 1
     * check that the limit is higher or equals 2nd int
     * check length of limit
     */
    fun validLimit(int2: String, limit: String): String? {

        return validateFormUseCase.validLimit(int2, limit)
    }

    /**
     * check length of Strings
     */
    fun validStrings(str: String): String? {
        return validateFormUseCase.validStrings(str)
    }

}



