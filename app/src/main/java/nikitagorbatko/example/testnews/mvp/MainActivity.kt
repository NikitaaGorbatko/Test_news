package nikitagorbatko.example.testnews.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import nikitagorbatko.example.testnews.R
import nikitagorbatko.example.testnews.adapter.NewsAdapter
import nikitagorbatko.example.testnews.retrofit.Article

class MainActivity : AppCompatActivity(), ContractInterface.View {
    private var presenter: MainPresenter? = null
    private var newsAdapter: NewsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newsAdapter = NewsAdapter()
        findViewById<RecyclerView>(R.id.news).also {
            it.adapter = newsAdapter
            it.layoutManager = LinearLayoutManager(applicationContext)
        }
        presenter = MainPresenter(this).also { it.onListEnds() }
    }

    override fun updateNews(articles: List<Article>?) {
        newsAdapter?.add(articles)
    }

}