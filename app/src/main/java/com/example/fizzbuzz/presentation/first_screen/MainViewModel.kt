package com.example.fizzbuzz.presentation.first_screen

import androidx.lifecycle.ViewModel
import com.example.fizzbuzz.utils.Constants

class MainViewModel: ViewModel() {

    /**
     * check that the first integer is higher or equals 1
     */
    fun validFirstInteger(firstInt:String): String? {
        if (firstInt.isBlank())
            return Constants.REQUIRED
        val firstIntVal = firstInt.toInt()
        if (firstIntVal < 1)
            return Constants.INVALID_FIRST_INTEGER_ERROR
        return null
    }

    /**
     * check that the second integer is higher or equals 1
     * check that the second integer is higher or equals first integer
     */
     fun validSecondInteger(firstInt:String,secondInt:String): String? {
        if (secondInt.isBlank())
            return Constants.REQUIRED
        val secondIntVal = secondInt.toInt()
        val firstIntVal = firstInt.toInt()
        if (secondIntVal < 1)
            return Constants.INVALID_SECOND_INTEGER_ERROR
        if (secondIntVal < firstIntVal)
            return Constants.INVALID_FIRST_SECOND_INTEGER_ERROR
        return null
    }

    /**
     * check that the limit is higher or equals 1
     * check that the limit is higher or equals second integer
     * check lenght of limit
     */
     fun validLimit(int2: String,limit:String): String? {

        if (limit.isBlank())
            return Constants.REQUIRED
        val limitV = limit.toInt()
        val int2V = int2.toLong()
        if (limitV < 1)
            return Constants.INVALID_LIMIT_ERROR
        if (int2V > limitV)
            return Constants.INVALID_LIMIT_SECOND_INTEGER_ERROR
         if(limitV.toString().length>6)
             return Constants.INVALID_LENGTH_LIMIT_ERROR
        return null
    }

    /**
     * check lenght of Strings
     */
     fun validStrings( str:String):String?{
        if(str.isBlank())
            return Constants.REQUIRED
         if(str.length>10){
             return Constants.INVALID_STRINS_LENGTH_ERROR

         }
        return null
    }

}



