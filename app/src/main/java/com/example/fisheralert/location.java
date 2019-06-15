package com.example.fisheralert;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class location extends AppCompatActivity {

    //private Button button;
    private TextView latTextView;
    private TextView lonTextView;
    private TextView dTextView;
    private LocationManager locationManager;
    private LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        Intent intent = getIntent();

        //button = findViewById(R.id.button3);

        latTextView = findViewById(R.id.lat);
        lonTextView = findViewById(R.id.lon);
        dTextView = findViewById(R.id.textView);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                latTextView.setText("Lat: "+location.getLatitude());
                lonTextView.setText("Lon: "+ location.getLongitude());
                double x1 = location.getLatitude();
                double x2 = location.getLongitude();
                double a = Math.pow(Math.sin((x1*3.14/180-13.0815*3.14/180)/2),2) + Math.cos(x1*3.14/180)*Math.cos(13.0815*3.14/180)*Math.pow(Math.sin((x2*3.14/180-80.2921*3.14/180)/2),2);
                double c = Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
                double d = c*6371000;
                dTextView.setText("Distance: "+d);
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {
                Intent intent1 = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent1);
            }
        };




        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        } else {
            locationManager.requestLocationUpdates("gps", 1000, 0, locationListener);
        }


    }

    /*private void configureButton() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationManager.requestLocationUpdates("gps", 1000, 0, locationListener);
            }
        });

    }*/


}

