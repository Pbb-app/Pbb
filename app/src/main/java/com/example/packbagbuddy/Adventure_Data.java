package com.example.packbagbuddy;

public class Adventure_Data {

    private String discount;
    private int image_id;
    private String title;
    private String time;
    private String amount;

    public Adventure_Data(String discount, int image_id, String title, String time, String amount) {
        this.discount = discount;
        this.image_id = image_id;
        this.title = title;
        this.time = time;
        this.amount = amount;
    }

    public String getDiscount() {
        return discount;
    }

    public int getImage_id() {
        return image_id;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getAmount() {
        return amount;
    }
}
