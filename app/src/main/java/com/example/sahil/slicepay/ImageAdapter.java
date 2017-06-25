package com.example.sahil.slicepay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by SAHIL on 24-06-2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.pic1, R.drawable.pic2,
            R.drawable.pic3, R.drawable.pic4,
            R.drawable.pic5, R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8,
            R.drawable.pic9, R.drawable.pic10,
            R.drawable.pic11, R.drawable.pic12,
            R.drawable.pic13, R.drawable.pic14,
            R.drawable.pic15, R.drawable.pic16,
            R.drawable.pic17, R.drawable.pic18,
            R.drawable.pic19, R.drawable.pic20,
    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView==null) {

             imageView = new ImageView(mContext);

            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(270, 200));
            imageView.setPadding(3, 3, 3, 3);
        }else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

}

