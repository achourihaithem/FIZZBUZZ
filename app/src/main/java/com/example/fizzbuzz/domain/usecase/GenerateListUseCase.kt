package com.example.fizzbuzz.domain.usecase

import com.example.fizzbuzz.domain.model.GameModel
import org.koin.core.component.KoinComponent

class GenerateListUseCase : KoinComponent {

    fun showData(gameModel: GameModel): List<String> {
        val myList: MutableList<String> = mutableListOf()
        val multipleInt1Int2 = gameModel.firstInt * gameModel.secondInt
        for (position in 1..gameModel.limit) {

            when {
                position % multipleInt1Int2 == 0L -> myList.add(gameModel.str1 + gameModel.str2)

                position % gameModel.firstInt == 0L && position != gameModel.secondInt.toLong()
                -> myList.add(gameModel.str1)

                position % gameModel.secondInt == 0L -> myList.add(gameModel.str2)

                else -> myList.add(position.toString())
            }

        }
        return myList
    }


}