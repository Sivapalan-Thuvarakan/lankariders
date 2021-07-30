package com.example.ridelanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Available_Vehicles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_vehicles);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner_seats);

    }
    public void BookBus(View v){


        Intent intent=new Intent(getApplicationContext(),Review.class);

        startActivity(intent);
    }
}