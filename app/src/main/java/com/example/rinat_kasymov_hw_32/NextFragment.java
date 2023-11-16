package com.example.rinat_kasymov_hw_32;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class NextFragment extends Fragment {
    private int counter = 0;
    private TextView textView;
    private Button buttonPlus, buttonMinus;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_next, container, false);

        textView = view.findViewById(R.id.tv_counter);
        buttonPlus = view.findViewById(R.id.btn_plus);
        buttonMinus = view.findViewById(R.id.btn_minus);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                updateCounter();
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                updateCounter();
            }
        });

        updateCounter(); // Установка начального значения

        return view;
    }

    private void updateCounter() {
        textView.setText(String.valueOf(counter));
    }
}