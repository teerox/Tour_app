package com.example.android.tour_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HospitalFragment extends Fragment {


    public HospitalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hospital1), getString(R.string.address1),
                R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital2), getString(R.string.address2), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital3),
                getString(R.string.address3), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital4), getString(R.string.address),
                R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital6), getString(R.string.address4), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital),
                getString(R.string.address5), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital7), getString(R.string.address6), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital9), getString(R.string.address7), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital8), getString(R.string.address8), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital10), getString(R.string.address9),
                R.drawable.hospital));


        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.colorPrimaryDark);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}