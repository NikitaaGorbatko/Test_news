package nikitagorbatko.example.testnews.mvp

import nikitagorbatko.example.testnews.retrofit.Article
import nikitagorbatko.example.testnews.retrofit.NewsResponse


interface ContractInterface {

    interface View {
        fun updateNews(articles: List<Article>?)
    }

    interface Presenter {
        fun onListEnds()
        fun onDestroy()
    }

    interface Model {
        interface OnLoadedListener {
            fun onLoaded(news: NewsResponse?)
        }

        fun getNews(listener: OnLoadedListener?)
    }

}