package com.example.ridelanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Available_Vehicles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_vehicles);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner_seats);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Available_Vehicles.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.arra))
    }
}