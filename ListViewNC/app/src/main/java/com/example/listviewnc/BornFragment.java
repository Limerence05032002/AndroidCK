package com.example.listviewnc;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BornFragment extends Fragment {
    private Button play;

    public BornFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_born, container, false);

        play = (Button) root.findViewById(R.id.play);
        MediaPlayer sound  = MediaPlayer.create(getActivity(), R.raw.song1);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.setLooping(true);
                sound.start();
            }
        });

        return root;
    }
}