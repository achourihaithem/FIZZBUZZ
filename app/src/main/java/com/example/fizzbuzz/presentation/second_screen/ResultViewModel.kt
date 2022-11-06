package com.example.fizzbuzz.presentation.second_screen

import androidx.lifecycle.ViewModel
import com.example.fizzbuzz.models.GameModel

class ResultViewModel : ViewModel() {

    /**
     *  prepare list of character strings with numbers from 1 to limit
     *   where: all multiples of int1 are replaced by str1, all multiples of int2 are replaced by str2
     *   all multiples of int1 and int2 are replaced by str1str2
     */
    fun showData(gameModel: GameModel):List<String> {
        val myList:MutableList<String> =  mutableListOf()
        val multipleInt1Int2 = gameModel.firstInt * gameModel.secondInt
        for (position in 1..gameModel.limit) {

            if (position% multipleInt1Int2 == 0) {
                myList.add(gameModel.str1 + gameModel.str2)
            } else if (position % gameModel.firstInt == 0 && position!=gameModel.secondInt) {
                myList.add(gameModel.str1)
            } else if (position % gameModel.secondInt == 0) {
                myList.add(gameModel.str2)
            } else {
                myList.add(position.toString())
            }
        }
        return myList
    }


}

