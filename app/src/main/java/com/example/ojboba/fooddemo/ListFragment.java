package com.example.ojboba.fooddemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflates the view which would be created within the main activity
        // Does not overRide like an activity class, needs to inflate
        View rootView = inflater.inflate(R.layout.activity_final_list, container, false);



        return rootView;
    }

}
