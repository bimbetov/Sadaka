package com.example.sadaka.repository

import com.example.sadaka.model.Needy

interface NeedyRepository {
    fun getNeedy() : List<Needy>
}