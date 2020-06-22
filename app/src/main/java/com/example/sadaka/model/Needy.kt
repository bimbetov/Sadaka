package com.example.sadaka.model

class Needy (
    private val fundName: String,
    private val city: String,
    private val neededAmount: Int,
    private val collectedAmount: Int,
    val imageList: List<String>
){

    fun getFundName(): String{
        return fundName
    }
    fun getCityName(): String{
        return city
    }
    fun getNeededAmount(): Int{
        return neededAmount
    }
    fun getCollectedAmount(): Int{
        return collectedAmount
    }
    fun getImage() : List<String>{
        return imageList
    }
}