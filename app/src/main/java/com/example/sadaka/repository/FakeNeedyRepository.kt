package com.example.sadaka.repository

import com.example.sadaka.model.Needy

class FakeNeedyRepository : NeedyRepository {

    private val hareketKory = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ2DrUbc79lWP-HoHWAflwbhtOiTRHJ1ebC54o-ajduo7AanJru&usqp=CAU")
    private val ulybka = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRyFTP_UjQj48dsHaz15JbHt2FfdWs5e_41AezrpPDbNj3BJAWn&usqp=CAU")

    override fun getNeedy(): List<Needy> {
        return ArrayList<Needy>().apply {
            add(Needy("Харекет коры","Алматы", 50000, 32120, hareketKory))
            add(Needy("Улыбка","Шымкент", 15000, 9800, ulybka))
        }
    }
}