package com.example.fizzbuzz.domain.usecase

import com.example.fizzbuzz.utils.Constants
import com.google.common.truth.Truth
import org.junit.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ValidateFormUseCaseTest : KoinComponent {
    private val validateFormUseCase: ValidateFormUseCase by inject()

    @Test
    fun checkLimit() {
        val result = validateFormUseCase.validLimit("5", "7963")
        Truth.assertThat(result.equals(null)).isTrue()
    }

    @Test
    fun checkLimitLength() {
        val result = validateFormUseCase.validLimit("5", "4587963")
        Truth.assertThat(result.equals(null)).isFalse()
    }

    @Test
    fun checkScondInt() {
        val result = validateFormUseCase.validSecondInteger("5", "7")
        Truth.assertThat(result.equals(null)).isTrue()
    }

    @Test
    fun checkFirstInt() {
        val result = validateFormUseCase.validFirstInteger("4")
        Truth.assertThat(result.equals(null)).isTrue()
    }

    @Test
    fun checkStringReturnError() {
        val result = validateFormUseCase.validStrings("")
        Truth.assertThat(result.equals(Constants.REQUIRED)).isTrue()
    }

    @Test
    fun checkStringNotEmpty() {
        val result = validateFormUseCase.validStrings("str1")
        Truth.assertThat(result.equals(null)).isTrue()
    }
}