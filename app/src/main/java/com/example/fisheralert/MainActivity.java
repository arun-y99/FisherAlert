package com.example.fisheralert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String key = "com.example.HelloWorld.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getLocation(View view) {
        Intent intent = new Intent(this,location.class);
        intent.putExtra(key,"S");
        startActivity(intent);
    }
}
