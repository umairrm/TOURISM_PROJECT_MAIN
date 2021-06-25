package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shogran extends AppCompatActivity {

    Button shogran_interested;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shogran);
        shogran_interested = findViewById(R.id.shogran_interested);
        shogran_interested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shogran.this,GetShogranDetails.class);
                startActivity(intent);
            }
        });
    }
}