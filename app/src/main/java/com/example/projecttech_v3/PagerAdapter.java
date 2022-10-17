package com.example.projecttech_v3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {


    public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Maszyna01();
            case 1:
                return new Maszyna02();
            case 2:
                return new Maszyna03();
            default:
                return new Maszyna01();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
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
}
