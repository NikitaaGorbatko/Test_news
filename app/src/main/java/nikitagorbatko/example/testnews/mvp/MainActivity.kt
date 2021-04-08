package nikitagorbatko.example.testnews.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nikitagorbatko.example.testnews.R
import nikitagorbatko.example.testnews.retrofit.Article

class MainActivity : AppCompatActivity(), ContractInterface.View {
    var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this).also { it.onListEnds() }
    }

    override fun updateNews(articles: List<Article>?) {
        val ae = articles
        val a = 0
    }

}