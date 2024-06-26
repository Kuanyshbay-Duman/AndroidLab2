package kz.android.androidlab2.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repository {
    val service: Service by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.api-ninjas.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Service::class.java)
    }
}