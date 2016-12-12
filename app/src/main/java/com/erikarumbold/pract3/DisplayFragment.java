package com.erikarumbold.pract3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayFragment extends Fragment {

    /**
     * This function is run when the Fragment is created.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_results, container, false);
        return view;
    }

    /**
     * This function stringifies the text from the survey to be displayed.
     * @param charInfo
     */
    public void setText(String charInfo) {
        TextView view = (TextView) getView().findViewById(R.id.textView2);
        view.setText(charInfo);
    }
}
