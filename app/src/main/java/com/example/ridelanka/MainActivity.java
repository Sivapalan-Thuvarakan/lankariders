package com.example.ridelanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1=findViewById(R.id.editTextTextUserName);
    EditText ed2=findViewById(R.id.editTextTextPassword);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = ed1.getText().toString();
        String password = ed2.getText().toString();
    }
}