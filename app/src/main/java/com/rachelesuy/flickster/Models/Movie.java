package com.rachelesuy.flickster.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Movie {

    

    String posterPath;
    String originalTitle;
    String overview;

    public Movie (JSONObject jsonObject) throws JSONException{

        this.posterPath = jsonObject.getString("posterPath");
        this.originalTitle =jsonObject.getString("originalTitle");
        this.overview =jsonObject.getString("overview")

    }
    public static ArrayList<Movie> fromJSONArray(JSONArray array){
        ArrayList<Movie> results = new ArrayList<>();

        for(int x=0; x< array.length(); x++){
            try{
                results.add(Movie(array.getJSONObject(x)));
            }catch (JSONException e){
             e.printStackTrace();
            }
        }
        return results;
    }
}
