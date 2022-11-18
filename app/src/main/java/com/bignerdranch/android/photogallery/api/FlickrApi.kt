package com.bignerdranch.android.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList"+"&api_key=7f05ce355870fa3d166c10bad08f325a\n" +
                "&format=json"+"&nojsoncallback=1"+
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>

}

