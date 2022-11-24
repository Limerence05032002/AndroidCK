package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {
    Button button_Dangnhap,button_Dangki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button_Dangnhap = findViewById(R.id.home_login);
        button_Dangki = findViewById(R.id.home_signUp);

        button_Dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDangKiForm();
            }
        });
        button_Dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDangNhapForm();
            }
        });
    }

    private void openDangKiForm() {
        Intent intent = new Intent(this, create_form.class);
        startActivity(intent);
    }

    private void openDangNhapForm() {
        Intent intent = new Intent(this, Login_form.class);
        startActivity(intent);
    }
}