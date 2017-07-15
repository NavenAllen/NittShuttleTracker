package com.navenallen.nittshuttletracker;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by navenallen on 14/7/17.
 */

public class LatLngInterpolator {

    public LatLng interpolate(float fraction, LatLng a, LatLng b) {
        double lat = (b.latitude - a.latitude) * fraction + a.latitude;
        double lng = (b.longitude - a.longitude) * fraction + a.longitude;
        return new LatLng(lat, lng);
    }
}
