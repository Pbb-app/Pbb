package com.riseinsteps.packbagbuddy_leisuretravelandtourism.model;

public class AdventureTripModel {
    private String ImageURL;

    public AdventureTripModel(String imageURL) {
        ImageURL = imageURL;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
