package com.example.projectandroid.Quotes;

import com.google.gson.annotations.SerializedName;

public class QuotesResponse {

    @SerializedName("quote")
    private QuoteResult quote;

    @SerializedName("qotd_date")
    private String qotdDate;

    public QuoteResult getQuote() {
        return quote;
    }

    public void setQuote(QuoteResult quote) {
        this.quote = quote;
    }

    public String getQotdDate() {
        return qotdDate;
    }

    public void setQotdDate(String qotdDate) {
        this.qotdDate = qotdDate;
    }

    @Override
    public String toString() {
        return
                "QuotesResponse{" +
                        "quote = '" + quote + '\'' +
                        ",qotd_date = '" + qotdDate + '\'' +
                        "}";
    }
}