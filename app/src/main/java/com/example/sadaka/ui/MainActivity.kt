package com.example.sadaka.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sadaka.R
import com.example.sadaka.model.Needy
import com.example.sadaka.repository.FakeNeedyRepository
import com.example.sadaka.repository.NeedyRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val repository: NeedyRepository = FakeNeedyRepository()

        recyclerView.apply {
            adapter = NeedyAdapter(repository.getNeedy(), ::itemClick)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun itemClick(needy: Needy){
        val intent = Intent(this, NeedyInfoActivity::class.java).apply{
            putExtra(IMAGE_INFO, needy.getImage().toTypedArray())
            putExtra(NEEDED_AMOUNT, needy.getNeededAmount())
            putExtra(COLLECTED_AMOUNT, needy.getCollectedAmount())
        }
        startActivity(intent)
    }

    companion object {
        const val IMAGE_INFO: String = "IMAGE_INFO"
        const val NEEDED_AMOUNT: String = "NEEDED_AMOUNT"
        const val COLLECTED_AMOUNT: String = "COLLECTED_AMOUNT"
    }
}
