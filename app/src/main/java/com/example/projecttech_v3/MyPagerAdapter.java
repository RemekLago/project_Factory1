package com.example.projecttech_v3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class MyPagerAdapter extends FragmentPagerAdapter {

private int numOfTabs;


    public MyPagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        String title = null;
//        if (position == 0)
//            title = "maszyna01";
//        if (position == 1)
//            title = "maszyna02";
//        if (position == 2)
//            title = "maszyna03";
//        return title;
//
//        return fragmentTitle.get(position);
//    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Maszyna01 tab1 = new Maszyna01();
                return tab1;
            case 1:
                Maszyna02 tab2 = new Maszyna02();
                return tab2;
            case 2:
                Maszyna03 tab3 = new Maszyna03();
                return tab3;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return numOfTabs;
        }

}
