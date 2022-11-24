package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dailog_music extends AppCompatActivity {
    Button play,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailog_music);

        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opent();
            }
        });

    }

    private void opent() {

    }
}