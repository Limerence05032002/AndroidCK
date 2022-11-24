package com.example.listviewnc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TipFragment extends Fragment {

    View v;
    private RecyclerView Question_recyclerview;
    private List<Question> listQuestion;

    public TipFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.tip_fragment, container, false);

        Question_recyclerview = v.findViewById(R.id.Question_recyclerview);
        QuestionViewAdapter question_recyclerview = new QuestionViewAdapter(getContext(),listQuestion);
        Question_recyclerview.setLayoutManager(new GridLayoutManager(getActivity(),2));
        Question_recyclerview.setAdapter(question_recyclerview);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listQuestion = new ArrayList<>();

        listQuestion.add(new Question("Sự phát triển của trí tuệ nhân tạo.",R.drawable.ai));
        listQuestion.add(new Question("Lợi ích của việc tập Yoga mỗi ngày.",R.drawable.yoga));
        listQuestion.add(new Question("Những thiết kế làm nên thương hiệu.",R.drawable.thietke));
        listQuestion.add(new Question("Chuyện người nổi tiếng.",R.drawable.famous));
    }
}
