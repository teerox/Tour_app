package com.example.android.tour_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent code for Hotels
        LinearLayout hotelsLinearLayout = (LinearLayout) findViewById(R.id.hotels);
        hotelsLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, AnotherActivity.class);
                startActivity(hotelsIntent);
            }
        });

        //Intent code for Atm
        LinearLayout shopingmallLinearLayout = (LinearLayout) findViewById(R.id.shoping_mall);
       shopingmallLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingMallIntent = new Intent(MainActivity.this,AnotherActivity.class);
                startActivity(shoppingMallIntent);
            }
        });

        //Intent code for Hospitals
        LinearLayout hospitalsLinearLayout = (LinearLayout) findViewById(R.id.hospitals);
        hospitalsLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hospitalsIntent = new Intent(MainActivity.this, AnotherActivity.class);
                startActivity(hospitalsIntent);
            }
        });

        //Intent code for Metro Stations
        LinearLayout metroLinearLayout = (LinearLayout) findViewById(R.id.Bus_Station);
        metroLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent busStationIntent = new Intent(MainActivity.this, AnotherActivity.class);
                startActivity(busStationIntent);
            }
        });
    }
}

