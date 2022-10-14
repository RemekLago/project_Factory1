package com.example.projecttech_v3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyPagerAdapter extends FragmentPagerAdapter {

//    private int numOfTabs;
    private final ArrayList <Fragment> fragmentArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentTitle = new ArrayList<>();


//    public MyPagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
//        this.numOfTabs = numOfTabs;


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        String title = null;
//        if (position == 0)
//            title = "maszyna01";
//        if (position == 1)
//            title = "maszyna02";
//        if (position == 2)
//            title = "maszyna03";
//        return title;

        return fragmentTitle.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
//        switch (position){
//            case 0:
//                return new Maszyna01();
//            case 1:
//                return new Maszyna02();
//            case 2:
//                return new Maszyna03();
//            default:
//                return null;
        return fragmentArrayList.get(position);
        }


    @Override
    public int getCount() {
//        return numOfTabs;
    return fragmentArrayList.size();
        }

    public void addFragment(Fragment fragment, String title){
        fragmentArrayList.add(fragment);
        fragmentTitle.add(title);
    }

}
