package com.example.pbb;

class persons
{
    private static String tour;
     static int img;
    private static String day;
    private static String takeoff;
    private static String land;
    private static String monthstart;



    public persons(String tour, int img, String day, String monthstart, String takeoff, String land)
    {
        this.tour=tour;
        this.img=img;
        this.day= day;
        this.monthstart=monthstart;
        this.takeoff=takeoff;
        this.land=land;
    }


    public static String getTxt()
    {
        return tour;
    }

    public static int getImg()
    {
        return img;
    }

    public static String getDays() {
        return day;
    }

    public static String getMonthstart() {
        return monthstart;
    }

    public static String getTakeoff() {
        return takeoff;
    }

    public static String getLand() {
        return land;
    }



}
