package com.example.transition_fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {
    private MainActivity parent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.main_fragment,container,false);
        Button btnMove=(Button)view.findViewById(R.id.button);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.move();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        Activity a;
        a = (Activity) context;
        parent = (MainActivity) a;
        super.onAttach(context);
    }
}
