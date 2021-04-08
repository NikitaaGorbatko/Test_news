package nikitagorbatko.example.testnews.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    //001b1498d85d4063b8f5426beb4cc31a

    @GET("/v2/everything")
    fun getNews(
        @Query("apiKey") apiKey: String,
        @Query("q") q: String = "sports",
        @Query("pageSize") pageSize: Int = 100,
        @Query("page") page: Int
    ): Call<NewsResponse>
}