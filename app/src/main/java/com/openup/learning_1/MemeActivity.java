package com.openup.learning_1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MemeActivity extends Fragment {

    private static final String TAG = "Meme Activity";
    private static TextView topMemeText;
    private static TextView bottomMemeText;

    public MemeActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topMemeText = (TextView) view.findViewById(R.id.top_meme);
        bottomMemeText = (TextView) view.findViewById(R.id.bottom_meme);
        return view;
    }

    public void setMemeText(String top, String bottom) {
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
