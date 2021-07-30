package com.example.ridelanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String name = ed1.getText().toString();
//        String password = ed2.getText().toString();
    }
    public void Login(View v){
        EditText edit = (EditText)findViewById(R.id.userName);
        String name = edit.getText().toString();
        EditText edit2 = (EditText)findViewById(R.id.password);
        String password = edit2.getText().toString();

        Intent intent=new Intent(getApplicationContext(),LandingPage.class);

        startActivity(intent);
    }
    public void Signup(View v){

        Intent intent=new Intent(getApplicationContext(),Registrationrider.class);

        startActivity(intent);
    }
}