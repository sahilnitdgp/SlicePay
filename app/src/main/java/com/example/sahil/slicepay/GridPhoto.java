package com.example.sahil.slicepay;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class GridPhoto extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_grid_photo, container, false);

        GridView gridView = (GridView) view.findViewById(R.id.gridview);


        int image[]={ R.drawable.pic1, R.drawable.pic2,
                R.drawable.pic3, R.drawable.pic4,
                R.drawable.pic5, R.drawable.pic6,
                R.drawable.pic7, R.drawable.pic8,
                R.drawable.pic9, R.drawable.pic10,
                R.drawable.pic11, R.drawable.pic12,
                R.drawable.pic13, R.drawable.pic14,
                R.drawable.pic15, R.drawable.pic16,
                R.drawable.pic17, R.drawable.pic18,
                R.drawable.pic19, R.drawable.pic20};
        //GridView gridView= (GridView) rootView.findViewById(R.id.gv);

        ArrayList al=new ArrayList();

        for(int i=0;i<image.length;i++)
        {
            HashMap hm=new HashMap();
            hm.put("image",image[i]);
            al.add(hm);
        }
        String keys[]={"image"};
        int to[]={R.id.iv1};
        SimpleAdapter sm1=new SimpleAdapter(getActivity(),al,R.layout.image_grid,keys,to);
        gridView.setAdapter(sm1);




        //gridView.setAdapter(new ImageAdapter(getActivity()));
        return view;
    }

}
