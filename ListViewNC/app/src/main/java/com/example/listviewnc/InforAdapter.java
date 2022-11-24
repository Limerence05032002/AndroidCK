package com.example.listviewnc;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InforAdapter extends RecyclerView.Adapter<InforAdapter.InforViewHolder> {

    private Context mContext;
    private List<Infor> mListInfor;
    Dialog myDialog;

    public InforAdapter(Context mContext,List<Infor> mListInfor) {
        this.mContext = mContext;
        this.mListInfor = mListInfor;
    }

    @NonNull
    @Override
    public InforViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.iteminformation, parent,false);
        InforViewHolder vHolder = new InforViewHolder(v);

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.activity_dailog_thong_tin);


        vHolder.infor_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img_background = myDialog.findViewById(R.id.img_background);
                TextView tv_title = myDialog.findViewById(R.id.name_title);
                TextView tip = myDialog.findViewById(R.id.name_tip);
                TextView content = myDialog.findViewById(R.id.pharagraph);

                img_background.setImageResource(mListInfor.get(vHolder.getAdapterPosition()).getResourceId());
                tv_title.setText(mListInfor.get(vHolder.getAdapterPosition()).getTv_title());
                tip.setText(mListInfor.get(vHolder.getAdapterPosition()).getTip());
                content.setText(mListInfor.get(vHolder.getAdapterPosition()).getContent());

                myDialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull InforViewHolder holder, int position) {

        holder.imgInfor.setImageResource(mListInfor.get(position).getResourceId());
        holder.tv_title.setText(mListInfor.get(position).getTv_title());
        holder.tip.setText(mListInfor.get(position).getTip());
    }

    @Override
    public int getItemCount() {
            return mListInfor.size();
    }

    public static class InforViewHolder extends RecyclerView.ViewHolder{
        private CardView infor_item;
        private ImageView imgInfor;
        private TextView tv_title;
        private TextView tip;

        public InforViewHolder(@NonNull View itemView) {
            super(itemView);

            infor_item = itemView.findViewById(R.id.infor_item);
            imgInfor = itemView.findViewById(R.id.img_user);
            tv_title = itemView.findViewById(R.id.tv_title_1);
            tip = itemView.findViewById(R.id.tip);
        }
    }
}
