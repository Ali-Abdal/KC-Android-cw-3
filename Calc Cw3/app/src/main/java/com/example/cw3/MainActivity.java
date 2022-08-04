package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button z = findViewById(R.id.PressWontBite);
        TextView T1 = findViewById(R.id.CalcMain);
        TextView T2 = findViewById(R.id.Total);
        EditText E1 = findViewById(R.id.FirstNumber);
        EditText E2 = findViewById(R.id.SecondNumber);
        TextView True = findViewById(R.id.FactNoCap);


    }
}