package com.example.baitap4;

public class Place {
    private int ID;
    private String PlaceName;
    private String PlaceLink;
    private double PlaceLat;
    private double PlaceLng;

    public Place(int ID, String PlaceName, String PlaceLink, double PlaceLat, double PlaceLng)
    {
        this.ID = ID;
        this.PlaceName = PlaceName;
        this.PlaceLink = PlaceLink;
        this.PlaceLat = PlaceLat;
        this.PlaceLng = PlaceLng;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String placeName) {
        PlaceName = placeName;
    }

    public String getPlaceLink() {
        return PlaceLink;
    }

    public void setPlaceLink(String placeLink) {
        PlaceLink = placeLink;
    }

    public double getPlaceLat() {
        return PlaceLat;
    }

    public void setPlaceLat(double placeLat) {
        PlaceLat = placeLat;
    }

    public double getPlaceLng() {
        return PlaceLng;
    }

    public void setPlaceLng(double placeLng) {
        PlaceLng = placeLng;
    }
}
