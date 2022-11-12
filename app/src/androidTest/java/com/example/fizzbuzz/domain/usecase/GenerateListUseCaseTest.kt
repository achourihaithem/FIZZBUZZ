package com.example.fizzbuzz.domain.usecase

import com.example.fizzbuzz.domain.model.GameModel
import com.google.common.truth.Truth
import org.junit.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GenerateListUseCaseTest : KoinComponent {

    private val generateListUseCase: GenerateListUseCase by inject()

    @Test
    fun validListSize() {
        val gameModel = GameModel(3, 6, 10, "A", "B")
        val list = generateListUseCase.showData(gameModel)
        Truth.assertThat(list.size.toLong() == gameModel.limit).isTrue()
    }

    @Test
    fun validFirstString() {
        val gameModel = GameModel(3, 6, 10, "A", "B")
        val list = generateListUseCase.showData(gameModel)
        Truth.assertThat(list[gameModel.firstInt - 1] == gameModel.str1).isTrue()
    }

    @Test
    fun validSecondString() {
        val gameModel = GameModel(3, 6, 10, "A", "B")
        val list = generateListUseCase.showData(gameModel)
        Truth.assertThat(list[gameModel.secondInt - 1] == gameModel.str2).isTrue()
    }
}