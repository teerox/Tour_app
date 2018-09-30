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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hotel), getString(R.string.Address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel1), getString(R.string.Address22), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel2), getString(R.string.Address23), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel3), getString(R.string.Address24), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel4), getString(R.string.Address25), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel5), getString(R.string.Address26), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel6), getString(R.string.Address27), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel7), getString(R.string.Address28), R.drawable.hotel));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.colorPrimaryDark);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
