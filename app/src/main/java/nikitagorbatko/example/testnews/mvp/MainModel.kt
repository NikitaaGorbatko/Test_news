package nikitagorbatko.example.testnews.mvp

import nikitagorbatko.example.testnews.retrofit.Common
import nikitagorbatko.example.testnews.retrofit.NewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainModel: ContractInterface.Model {
    private val API_KEY = "001b1498d85d4063b8f5426beb4cc31a"

    override fun getNews(listener: ContractInterface.Model.OnLoadedListener?) {
        Common.retrofitService.getNews(API_KEY, page = 1).enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                listener?.onLoaded(response.body())
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                val a = 0
                //something gone wrong
            }
        })
    }




}