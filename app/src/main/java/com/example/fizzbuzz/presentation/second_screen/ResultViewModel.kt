package com.example.fizzbuzz.presentation.second_screen

import androidx.lifecycle.ViewModel
import com.example.fizzbuzz.domain.model.GameModel
import com.example.fizzbuzz.domain.usecase.GenerateListUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ResultViewModel : ViewModel(), KoinComponent {

    private val generateListUseCase: GenerateListUseCase by inject()

    fun showData(gameModel: GameModel): List<String> {
        return generateListUseCase.showData(gameModel)
    }


}

