package com.example.listviewnc;

import android.app.Dialog;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TipViewAdapter extends RecyclerView.Adapter<TipViewAdapter.MyViewHolder> {

    Context mContext;
    List<Top> mListTop;
    Dialog myDialog;

    public TipViewAdapter(Context mContext, List<Top> mListTop) {
        this.mContext = mContext;
        this.mListTop = mListTop;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_top, parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.activity_dailog_tieu_thuyet);


        vHolder.tieuthuyet_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView name_title = myDialog.findViewById(R.id.name_title);
                TextView name_tacgia = myDialog.findViewById(R.id.name_tacgia);
                TextView pharagraph = myDialog.findViewById(R.id.pharagraph);

                name_title.setText(mListTop.get(vHolder.getAdapterPosition()).getTitle());
                name_tacgia.setText(mListTop.get(vHolder.getAdapterPosition()).getTacGia());
                pharagraph.setText(mListTop.get(vHolder.getAdapterPosition()).getContent());

                myDialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img_background.setImageResource(mListTop.get(position).getPhotoBackground());
    }

    @Override
    public int getItemCount() {
        return mListTop.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_background;
        private CardView tieuthuyet_item;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_background = itemView.findViewById(R.id.img_background);
            tieuthuyet_item = itemView.findViewById(R.id.tieuthuyet_item);
        }
    }
}
