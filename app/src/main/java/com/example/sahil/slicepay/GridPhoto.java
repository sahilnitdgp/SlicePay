package com.example.sahil.slicepay;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class GridPhoto extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_grid_photo, container, false);

        GridView gridView = (GridView) view.findViewById(R.id.gridview);

        gridView.setAdapter(new ImageAdapter(getActivity()));
        return view;
    }

}
