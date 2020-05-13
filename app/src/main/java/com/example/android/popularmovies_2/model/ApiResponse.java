package com.example.android.popularmovies_2.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse<T> {
    @SerializedName("results")
    public List<T> results;
}
