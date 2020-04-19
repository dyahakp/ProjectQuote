package com.example.projectandroid.Quotes;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QuoteResult extends ArrayList<QuoteResult> {

    @SerializedName("favorites_count")
    private int favoritesCount;

    @SerializedName("author")
    private String author;

    @SerializedName("dialogue")
    private boolean dialogue;

    @SerializedName("upvotes_count")
    private int upvotesCount;

    @SerializedName("author_permalink")
    private String authorPermalink;

    @SerializedName("id")
    private int id;

    @SerializedName("body")
    private String body;

    @SerializedName("favorite")
    private boolean favorite;

    @SerializedName("url")
    private String url;

    @SerializedName("tags")
    private ArrayList<String> tags;

    @SerializedName("downvotes_count")
    private int downvotesCount;

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isDialogue() {
        return dialogue;
    }

    public void setDialogue(boolean dialogue) {
        this.dialogue = dialogue;
    }

    public int getUpvotesCount() {
        return upvotesCount;
    }

    public void setUpvotesCount(int upvotesCount) {
        this.upvotesCount = upvotesCount;
    }

    public String getAuthorPermalink() {
        return authorPermalink;
    }

    public void setAuthorPermalink(String authorPermalink) {
        this.authorPermalink = authorPermalink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public int getDownvotesCount() {
        return downvotesCount;
    }

    public void setDownvotesCount(int downvotesCount) {
        this.downvotesCount = downvotesCount;
    }

    @Override
    public String toString() {
        return
                "Quote{" +
                        "favorites_count = '" + favoritesCount + '\'' +
                        ",author = '" + author + '\'' +
                        ",dialogue = '" + dialogue + '\'' +
                        ",upvotes_count = '" + upvotesCount + '\'' +
                        ",author_permalink = '" + authorPermalink + '\'' +
                        ",id = '" + id + '\'' +
                        ",body = '" + body + '\'' +
                        ",favorite = '" + favorite + '\'' +
                        ",url = '" + url + '\'' +
                        ",tags = '" + tags + '\'' +
                        ",downvotes_count = '" + downvotesCount + '\'' +
                        "}";
    }
}