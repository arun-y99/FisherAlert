package com.example.fisheralert;

public class Coordinate {
    /**
    * This class is to represent the location of any object, be it the phone or any port.
    *
    * Data members:
    *   1.  latitude : the latitude, expressed as a double value
    *                   positive value indicates N, negative indicates S
    *   2.  longitude : the longitude, expressed as a double value
     *                   positive value indicates E, negative indicates W
     *  3.  name    :   the thing represented, i.e. phone,port,etc.
    * */

    private double latitude; //LATITUDE
    private double longitude; //LONGITUDE
    private String name; //NAME OF THE PORT

    Coordinate() {
        latitude=longitude=0.0;
        name="XXX";
    }

    Coordinate(String p,double a, double b) {
        latitude=a*3.14/180; //Converting into radians
        longitude=b*3.14/180;
        name=p;
    }

    void setLatitude(double a) {
        latitude=a*3.14/180;
    }

    void setLongitude(double a) {
        longitude=a*3.14/180;
    }

    void setName(String a) {
        name=a;
    }

    double getLatitude() {
        return latitude;
    }

    double getLongitude() {
        return longitude;
    }

    String getName() {
        return name;
    }
}
