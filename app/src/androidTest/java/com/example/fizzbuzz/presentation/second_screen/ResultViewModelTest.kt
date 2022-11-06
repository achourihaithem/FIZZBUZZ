package com.example.fizzbuzz.presentation.second_screen

import com.example.fizzbuzz.models.GameModel
import com.google.common.truth.Truth
import org.junit.Test

class ResultViewModelTest{

    private val viewModel= ResultViewModel()

    @Test
    fun validListSize(){
        val gameModel=GameModel(3,6,10,"A","B")
        val list=viewModel.showData(gameModel)
        Truth.assertThat(list.size==gameModel.limit).isTrue()
    }
    @Test
    fun validFirstString(){
        val gameModel=GameModel(3,6,10,"A","B")
        val list=viewModel.showData(gameModel)
        Truth.assertThat(list[gameModel.firstInt-1] == gameModel.str1).isTrue()
    }

    @Test
    fun validSecondString(){
        val gameModel=GameModel(3,6,10,"A","B")
        val list=viewModel.showData(gameModel)
        Truth.assertThat(list[gameModel.secondInt-1] ==gameModel.str2).isTrue()
    }
}