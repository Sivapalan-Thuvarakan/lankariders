package com.example.ridelanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }
    public void SubmitRide(View v){


        Intent intent=new Intent(getApplicationContext(),Available_Vehicles.class);

        startActivity(intent);
    }
}