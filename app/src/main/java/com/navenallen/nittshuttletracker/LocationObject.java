package com.navenallen.nittshuttletracker;

/**
 * Created by navenallen on 14/7/17.
 */

public class LocationObject {
    private double lng;
    private double lat;

    public LocationObject(){}

    public LocationObject(double lng, double lat){
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng(){
        return lng;
    }
}

