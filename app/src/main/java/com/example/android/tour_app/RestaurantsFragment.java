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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.RFN1), getString(R.string.RFN_A1), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.RFN2), getString(R.string.RFN_A2), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.RFN3), getString(R.string.RFN_A3), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.RFN4), getString(R.string.RFN_A4), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.RFN5), getString(R.string.RFN_A5), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.RFN6), getString(R.string.RFN_A6), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.RFN7), getString(R.string.RFN_A7), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.RFN8), getString(R.string.RFN_A8), R.drawable.restaurant_food));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
