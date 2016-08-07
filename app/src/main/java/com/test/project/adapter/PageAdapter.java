package com.test.project.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.test.project.fragment.CurrentFragment;
import com.test.project.fragment.ForecastFragment;

public class PageAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;
    private String searchkeyword;

    public PageAdapter(FragmentManager fm, int NumOfTabs, String searchkeyword) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.searchkeyword = searchkeyword;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                CurrentFragment currentWeatherFragment = CurrentFragment.newInstance(searchkeyword);
                return currentWeatherFragment;
            case 1:
                ForecastFragment forecastWeatherFragment = ForecastFragment.newInstance(searchkeyword);
                return forecastWeatherFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}