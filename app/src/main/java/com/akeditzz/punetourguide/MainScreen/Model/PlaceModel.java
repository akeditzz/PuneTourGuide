package com.akeditzz.punetourguide.MainScreen.Model;

/**
 * Custom Object to main places data
 */
public class PlaceModel {
    private String place_name;
    private String place_contact;
    private String place_location;
    private int place_image;

    public PlaceModel(String place_name, String place_contact, String place_location, int place_image) {
        this.place_name = place_name;
        this.place_contact = place_contact;
        this.place_image = place_image;
        this.place_location = place_location;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_contact() {
        return place_contact;
    }

    public void setPlace_contact(String place_contact) {
        this.place_contact = place_contact;
    }

    public String getPlace_location() {
        return place_location;
    }

    public void setPlace_location(String place_location) {
        this.place_location = place_location;
    }

    public int getPlace_image() {
        return place_image;
    }

    public void setPlace_image(int place_image) {
        this.place_image = place_image;
    }
}
