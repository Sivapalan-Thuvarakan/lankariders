package com.example.ridelanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registrationrider extends AppCompatActivity {

    EditText ed1=findViewById(R.id.editTextTextname_signup);
    EditText ed2=findViewById(R.id.editTextTextEmail);
    EditText ed3=findViewById(R.id.editTextTexttelno);
    EditText ed4=findViewById(R.id.editTextTextSignup_Password);

    Button signup=findViewById(R.id.button_signup);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationrider);
        String name = ed1.getText().toString();
        String Email = ed2.getText().toString();
        String Tel = ed3.getText().toString();
        String password = ed4.getText().toString();
    }
}