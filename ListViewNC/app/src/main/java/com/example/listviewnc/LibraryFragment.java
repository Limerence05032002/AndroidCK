package com.example.listviewnc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LibraryFragment extends Fragment {

    View v;
    private Button play,pause;
    private LinearLayout contact_item;
    private Fragment item_music;
    private RecyclerView myRecyclerview;
    private List<Music> listMusic;

    public LibraryFragment(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.library_fragment, container, false);

        myRecyclerview = v.findViewById(R.id.Music_recyclerview);
        MusicViewAdapter musicViewAdapter = new MusicViewAdapter(getContext(),listMusic);
        myRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerview.setAdapter(musicViewAdapter);

        play = (Button) v.findViewById(R.id.play);
        MediaPlayer sound  = MediaPlayer.create(getActivity(), R.raw.song1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.setLooping(true);
                sound.start();
            }
        });

        pause = (Button) v.findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sound.isPlaying()){
                    sound.pause();
                }
            }
        });

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listMusic = new ArrayList<>();
        listMusic.add(new Music("Waiting for you", "Mono",R.drawable.mono));
        listMusic.add(new Music("Hãy trao cho anh", "Sơn Tùng",R.drawable.sontung));
        listMusic.add(new Music("Phía sau một cô gái", "Sobin Hoàng Sơn",R.drawable.sobin));
        listMusic.add(new Music("Mưa trôi", "Orange",R.drawable.orange));
        listMusic.add(new Music("Nơi tình yêu bắt đầu", "Mỹ Tâm",R.drawable.mitam));
        listMusic.add(new Music("Hồng nhan", "Jack",R.drawable.jack));
        listMusic.add(new Music("Xin lỗi tình yêu", "Hồ Ngọc Hà",R.drawable.hongocha));

    }
}
