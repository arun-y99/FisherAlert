package com.example.fisheralert;

public class Coordinate {

    private double latitude;
    private double longitude;
    private String port;

    Coordinate() {
        latitude=longitude=0.0;
        port="XXX";
    }

    Coordinate(String p,double a, double b) {
        latitude=a*3.14/180;
        longitude=b*3.14/180;
        port=p;
    }

    void setLatitude(double a) {
        latitude=a*3.14/180;
    }

    void setLongitude(double a) {
        longitude=a*3.14/180;
    }

    void setPort(String a) {
        port=a;
    }

    double getLatitude() {
        return latitude;
    }

    double getLongitude() {
        return longitude;
    }

    String getPort() {
        return port;
    }
}
