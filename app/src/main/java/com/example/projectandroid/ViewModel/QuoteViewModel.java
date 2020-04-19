package com.example.projectandroid.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projectandroid.Quotes.ApiMain;
import com.example.projectandroid.Quotes.QuoteResult;
import com.example.projectandroid.Quotes.QuotesResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuoteViewModel extends ViewModel {
    private ApiMain apiMain;
    private MutableLiveData<ArrayList<QuoteResult>> listQuote = new MutableLiveData<>();

    public void setQuote() {
        if (this.apiMain == null) {
            apiMain = new ApiMain();
        }
        apiMain.getApiQuote().getQuotes().enqueue(new Callback<QuotesResponse>() {
            @Override
            public void onResponse(Call<QuotesResponse> call, Response<QuotesResponse> response) {
                QuotesResponse quotesResponse = response.body();
                if (quotesResponse != null && quotesResponse.getQuote() != null) {
                    ArrayList<QuoteResult> quoteResults = quotesResponse.getQuote();
                    listQuote.postValue(quoteResults);
                }
            }

            @Override
            public void onFailure(Call<QuotesResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<ArrayList<QuoteResult>> getQuote() {
        return listQuote;
    }

}
