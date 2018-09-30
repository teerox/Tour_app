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
public class ShoppingMallFragment extends Fragment {


    public ShoppingMallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.SM1),getString(R.string.SMA1), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM2), getString(R.string.SMA2), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM3),getString(R.string.SMA3), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM4), getString(R.string.SMA4), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM5), getString(R.string.SMA5), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM6), getString(R.string.SMA6), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM7), getString(R.string.SMA7), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM8), getString(R.string.SMA8), R.drawable.shopping_mall));
        dataWord.add(new DataWord(getString(R.string.SM9), getString(R.string.SMA9), R.drawable.shopping_mall));


        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.colorPrimaryDark);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
