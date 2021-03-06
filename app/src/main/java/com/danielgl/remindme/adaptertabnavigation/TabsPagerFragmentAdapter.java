package com.danielgl.remindme.adaptertabnavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.danielgl.remindme.adaptertabnavigation.fragment.FirstFragment;

/**
 * Created by dedbob5 on 17.01.2017.
 */

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {
    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Новости",
                "Научные статьи",
                "Полезная информация"
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.getInstance();
            case 1:
                return FirstFragment.getInstance();
            case 2:
                return FirstFragment.getInstance();

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
