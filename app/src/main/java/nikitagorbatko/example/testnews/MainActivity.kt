package nikitagorbatko.example.testnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//https://newsapi.org/v2/everything?apiKey=e7a4d3493ec84a1a9232789bf7a943cf&q=sports&pageSize=10&page=1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}