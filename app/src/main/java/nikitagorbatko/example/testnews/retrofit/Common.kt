package nikitagorbatko.example.testnews.retrofit

object Common {
    private const val BASE_URL = "https://newsapi.org/v2/"
    val retrofitService: NewsApi
        get() = RetrofitClient.getClient(BASE_URL).create(NewsApi::class.java)
}