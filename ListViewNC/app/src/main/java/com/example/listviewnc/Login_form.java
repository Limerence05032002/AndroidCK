package com.example.listviewnc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_form extends AppCompatActivity {
    ImageView back_home,button_back;
    Button button_login;
    EditText nameed, passed;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        button_back = findViewById(R.id.button_back);
        button_login = findViewById(R.id.button_login);


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backStart();
            }
        });

        mAuth = FirebaseAuth.getInstance();
        nameed = findViewById(R.id.name);
        passed = findViewById(R.id.pass);


        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenHome();
            }
        });
    }

    private void backStart() {
        Intent intent = new Intent(this, start.class);
        startActivity(intent);
    }

    private void OpenHome() {
        String name, pass;
        name = nameed.getText().toString();
        pass = passed.getText().toString();

        if (TextUtils.isEmpty(name)){
            Toast.makeText(this,"Vui lòng nhập name !",Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(pass)){
            Toast.makeText(this,"Vui lòng nhập pass !",Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(name,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login_form.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}