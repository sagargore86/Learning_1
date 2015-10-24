package com.openup.learning_1;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityFragment extends Fragment {

    private static EditText topTextInput;
    private static EditText bottomTextInput;
    private static final String TAG = "Top Activity";

    TopSectionListener activityCommander;
    public interface TopSectionListener {
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopSectionListener)context;
        }catch (Exception e) {
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        topTextInput = (EditText) view.findViewById(R.id.TopInput);
        bottomTextInput = (EditText) view.findViewById(R.id.BottomInput);
        final Button button = (Button) view.findViewById(R.id.createMeme);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }
    public void buttonClicked(View v) {
        Log.i(TAG, "button clicked top" + topTextInput.getText().toString()+ "bottom " + bottomTextInput.getText().toString());
        activityCommander.createMeme(topTextInput.getText().toString(), bottomTextInput.getText().toString());
    }
}