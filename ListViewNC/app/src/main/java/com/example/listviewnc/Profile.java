package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {
    Button  dangxuat;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = findViewById(R.id.back);
        dangxuat = findViewById(R.id.dangXuat);

        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dangxuatH();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backHome();
            }
        });

    }

    private void dangxuatH() {
        Intent intent = new Intent(this, start.class);
        startActivity(intent);
    }

    private void backHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}