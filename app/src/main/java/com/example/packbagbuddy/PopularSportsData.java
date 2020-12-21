package com.example.packbagbuddy;

public class PopularSportsData {

    private String title;
    private String tour;
    private int image_id;

    public PopularSportsData(String title, String tour,int image_id) {
        this.title = title;
        this.tour = tour;
        this.image_id=image_id;
    }

    public String getTitle() {
        return title;
    }

    public String getTour() {
        return tour;
    }

    public int getImage_id() {
        return image_id;
    }
}
