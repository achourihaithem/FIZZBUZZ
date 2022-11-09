package com.example.fizzbuzz.presentation.second_screen

import androidx.lifecycle.ViewModel
import com.example.fizzbuzz.domain.model.GameModel
import com.example.fizzbuzz.domain.usecase.GenerateListUseCase
import com.example.fizzbuzz.domain.usecase.ValidationUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ResultViewModel : ViewModel(), KoinComponent {

    private val generateListUseCase: GenerateListUseCase by inject()

    /**
     *  prepare list of character strings with numbers from 1 to limit
     *   where: all multiples of int1 are replaced by str1, all multiples of int2 are replaced by str2
     *   all multiples of int1 and int2 are replaced by str1str2
     */
    fun showData(gameModel: GameModel): List<String> {

        return generateListUseCase.showData(gameModel)
    }


}

