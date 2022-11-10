package com.example.fizzbuzz.domain.usecase

import com.example.fizzbuzz.utils.Constants
import org.koin.core.component.KoinComponent

class ValidateFormUseCase : KoinComponent {
    /**
     * check that the 1st int is higher or equals 1
     */
    fun validFirstInteger(firstInt: String): String? {

        if (firstInt.isBlank())
            return Constants.REQUIRED
        val firstIntVal = firstInt.toInt()
        if (firstIntVal < 1)
            return Constants.INVALID_FIRST_INTEGER_ERROR
        return null
    }

    /**
     * check that the 2nd int is higher or equals 1
     * check that the 2nd int is higher or equals 1st int
     */
    fun validSecondInteger(firstInt: String, secondInt: String): String? {
        if (secondInt.isBlank())
            return Constants.REQUIRED
        if (firstInt.isBlank())
            return null
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
     * check that the limit is higher or equals 2nd int
     * check length of limit
     */
    fun validLimit(int2: String, limit: String): String? {

        if (limit.isBlank())
            return Constants.REQUIRED
        if (int2.isBlank())
            return null
        val limitV = limit.toLong()
        val int2V = int2.toInt()
        if (limitV < 1)
            return Constants.INVALID_LIMIT_ERROR
        if (int2V > limitV)
            return Constants.INVALID_LIMIT_SECOND_INTEGER_ERROR
        if (limitV.toString().length > 6)
            return Constants.INVALID_LENGTH_LIMIT_ERROR
        return null
    }

    /**
     * check length of Strings
     */
    fun validStrings(str: String): String? {
        if (str.isBlank())
            return Constants.REQUIRED
        if (str.length > 10) {
            return Constants.INVALID_STRINGS_LENGTH_ERROR
        }
        return null
    }
}