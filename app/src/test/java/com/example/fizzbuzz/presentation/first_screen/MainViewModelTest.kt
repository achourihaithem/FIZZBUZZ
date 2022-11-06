package com.example.fizzbuzz.presentation.first_screen

import com.example.fizzbuzz.utils.Constants
import com.google.common.truth.Truth
import org.junit.Test

class MainViewModelTest{

    private val viewModel=MainViewModel()

    @Test
    fun `check that the limit is higher or equals second integer`(){
        val result= viewModel.validLimit("5","7963")
        Truth.assertThat(result.equals(null)).isTrue()
    }

    @Test
    fun `check lenght of limit`(){
        val result= viewModel.validLimit("5","4587963")
        Truth.assertThat(result.equals(null)).isFalse()
    }

    @Test
    fun `check that the second integer is higher or equals first integer`(){
        val result= viewModel.validSecondInteger("5","7")
        Truth.assertThat(result.equals(null)).isTrue()
    }
    @Test
    fun `check that the first integer is higher or equals 1`(){
        val result= viewModel.validFirstInteger("4")
        Truth.assertThat(result.equals(null)).isTrue()
    }

    @Test
    fun `check String is empty return error`(){
        val result= viewModel.validStrings("")
        Truth.assertThat(result.equals(Constants.REQUIRED)).isTrue()
    }

    @Test
    fun `check String is not empty `(){
        val result= viewModel.validStrings("str1")
        Truth.assertThat(result.equals(null)).isTrue()
    }
}