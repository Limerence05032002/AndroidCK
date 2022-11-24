package com.example.listviewnc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestionViewAdapter extends RecyclerView.Adapter<QuestionViewAdapter.MyViewHolder> {

    Context mContext;
    List<Question> mListQuestion;

    public QuestionViewAdapter(Context mContext, List<Question> mListQuestion) {
        this.mContext = mContext;
        this.mListQuestion = mListQuestion;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_question, parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_question_title.setText(mListQuestion.get(position).getTv_question_title());
        holder.img_background.setImageResource(mListQuestion.get(position).getPhotoBackground());
    }

    @Override
    public int getItemCount() {
        return mListQuestion.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private CardView item_question;
        private TextView tv_question_title;
        private ImageView img_background;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_question = itemView.findViewById(R.id.item_question);
            tv_question_title = itemView.findViewById(R.id.tv_question_title);
            img_background = itemView.findViewById(R.id.img_background);
        }
    }
}
