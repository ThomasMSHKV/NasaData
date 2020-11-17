package com.eugens.example.nasadata.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eugens.example.nasadata.R
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer,FirstFragment())
            .commit()



    }
}