package com.example.transition_fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class SubActivity extends FragmentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
}
