package com.example.fizzbuzz.domain.model

import java.io.Serializable

data class GameModel ( var firstInt: Int, var secondInt:Int, var limit:Long,
                       var str1:String,var str2:String):Serializable{

}