package com.example.dotaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Haroldodois extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        return inflater.inflate (R.layout.activity_haroldodois, container, false);
    }
}