package com.example.android.tour_app;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new BusStationFragment();
        } else if (position == 3) {
            return new ShoppingMallFragment();
        } else   {
            return new HospitalFragment();
        }
    }
    @Override
    public int getCount() {
        return 5;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.Bus_station);
        } else if (position == 3) {
            return mContext.getString(R.string.shopping_mall);
        } else {
            return mContext.getString(R.string.hospitals);
        }

    }
}
