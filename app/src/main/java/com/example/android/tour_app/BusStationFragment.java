package com.example.android.tour_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BusStationFragment extends Fragment {


        public BusStationFragment() {
        }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.BERGER), getString(R.string.Address1), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station2), getString(R.string.Address2), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station3), getString(R.string.Address3), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station4), getString(R.string.Address4), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station5), getString(R.string.Address5), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station6), getString(R.string.Address6), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station7), getString(R.string.Address7), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station8),getString(R.string.Address8), R.drawable.bus_stations));
        dataWord.add(new DataWord(getString(R.string.station9), getString(R.string.Address9), R.drawable.bus_stations));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}

