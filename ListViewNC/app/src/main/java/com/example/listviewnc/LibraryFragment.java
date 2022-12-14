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
        listMusic.add(new Music("H??y trao cho anh", "S??n T??ng",R.drawable.sontung));
        listMusic.add(new Music("Ph??a sau m???t c?? g??i", "Sobin Ho??ng S??n",R.drawable.sobin));
        listMusic.add(new Music("M??a tr??i", "Orange",R.drawable.orange));
        listMusic.add(new Music("N??i t??nh y??u b???t ?????u", "M??? T??m",R.drawable.mitam));
        listMusic.add(new Music("H???ng nhan", "Jack",R.drawable.jack));
        listMusic.add(new Music("Xin l???i t??nh y??u", "H??? Ng???c H??",R.drawable.hongocha));

    }
}
