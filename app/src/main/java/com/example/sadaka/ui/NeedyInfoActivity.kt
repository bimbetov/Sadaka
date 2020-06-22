package com.example.sadaka.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.sadaka.R
import com.example.sadaka.ui.MainActivity.Companion.COLLECTED_AMOUNT
import com.example.sadaka.ui.MainActivity.Companion.IMAGE_INFO
import com.example.sadaka.ui.MainActivity.Companion.NEEDED_AMOUNT
import kotlinx.android.synthetic.main.information_for_the_needy.*

class NeedyInfoActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.information_for_the_needy)

        imageArray = intent.getStringArrayExtra(IMAGE_INFO)
        needed_amount.text = intent.getIntExtra(NEEDED_AMOUNT,0).toString()
        collected_amount.text = intent.getIntExtra(COLLECTED_AMOUNT,0).toString()

        Glide
            .with(this)
            .load(imageArray[0])
            .centerCrop()
            .into(picturesOfThoseInNeed)


    }
    companion object {
        lateinit var imageArray: Array<String?>
    }
}