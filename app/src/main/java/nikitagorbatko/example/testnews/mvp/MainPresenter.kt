package nikitagorbatko.example.testnews.mvp

import nikitagorbatko.example.testnews.mvp.ContractInterface.*
import nikitagorbatko.example.testnews.retrofit.NewsResponse

class MainPresenter(var view: View): Presenter, Model.OnLoadedListener {
    private var model: MainModel? = MainModel()

    override fun onListEnds() {
        model?.getNews(this)
    }

    override fun onDestroy() {
        model = null
    }

    override fun onLoaded(news: NewsResponse?) {
        view.updateNews(news?.articles)
    }
}