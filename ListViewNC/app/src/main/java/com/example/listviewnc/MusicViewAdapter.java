package com.example.listviewnc;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicViewAdapter extends RecyclerView.Adapter<MusicViewAdapter.MyViewHolder>{

    Context mContext;
    List<Music> mMusicList;
    MediaPlayer player;
    private IClickItemListener iClickItemListener;

    public interface IClickItemListener{
        void onClickItemMusic(Music music);

    }

    public MusicViewAdapter(Context mContext, List<Music> mMusicList) {
        this.mContext = mContext;
        this.mMusicList = mMusicList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_book,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

//        name_title.setText(mMusicList.get(vHolder.getAdapterPosition()).getName());
//        name_tacgia.setText(mMusicList.get(vHolder.getAdapterPosition()).getTacGia());
//        pharagraph.setText(mMusicList.get(vHolder.getAdapterPosition()).get());

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvName.setText(mMusicList.get(position).getName());
        holder.tvTacGia.setText(mMusicList.get(position).getTacGia());
        holder.img.setImageResource(mMusicList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mMusicList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout contact_item;
        private TextView tvName;
        private TextView tvTacGia;
        private ImageView img;

        Button play;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            play = itemView.findViewById(R.id.play);
            contact_item = itemView.findViewById(R.id.contact_item);
            tvName = itemView.findViewById(R.id.tv_name);
            tvTacGia = itemView.findViewById(R.id.tv_tacgia);
            img = itemView.findViewById(R.id.img_book);
        }
    }
}
