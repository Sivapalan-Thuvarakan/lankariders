package com.example.ridelanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrationrider extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationrider);

    }
    public void SignupHome(View v){

        Intent intent=new Intent(getApplicationContext(),LandingPage.class);

        startActivity(intent);
    }
}