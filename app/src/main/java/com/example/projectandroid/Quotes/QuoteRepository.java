package com.example.projectandroid.Quotes;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteRepository {
    @GET("/qotd")
    Call<QuotesResponse> getQuotes();

}
