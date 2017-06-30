package com.example.sahil.slicepay;


import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Contacts extends Fragment {


    private static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 1;
    Cursor cursor;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_contacts, container, false);

        listView = (ListView)view.findViewById(R.id.contacts);

        int result = ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_CONTACTS);
        if (result == PackageManager.PERMISSION_GRANTED) {

            cursor = getActivity().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            getActivity().startManagingCursor(cursor);

            String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};

            int[] to = {android.R.id.text1, android.R.id.text2};

            SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(getActivity(), android.R.layout.simple_list_item_2, cursor, from, to);

            listView.setAdapter(listAdapter);
            listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        }else {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_CONTACTS}, MY_PERMISSIONS_REQUEST_READ_CONTACTS);


            cursor = getActivity().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            getActivity().startManagingCursor(cursor);

            String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};

            int[] to = {android.R.id.text1, android.R.id.text2};

            SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(getActivity(), android.R.layout.simple_list_item_2, cursor, from, to);

            listView.setAdapter(listAdapter);
            listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        }


        return view;
    }

}
