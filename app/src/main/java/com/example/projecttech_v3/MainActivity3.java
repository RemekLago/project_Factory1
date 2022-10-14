package com.example.projecttech_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        TabLayout tabLayout = findViewById(R.id.tabLayout);
////        TabItem maszyna01 = findViewById(R.id.maszyna01);
////        TabItem maszyna02 = findViewById(R.id.maszyna02);
////        TabItem maszyna03 = findViewById(R.id.maszyna03);
//        ViewPager viewPager = findViewById(R.id.viewpager);
//
//        tabLayout.setupWithViewPager(viewPager);
//
////        MyPagerAdapter pagerAdapter = new MyPagerAdapter(
////                getSupportFragmentManager(), tabLayout.getTabCount());
//        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        pagerAdapter.addFragment(new Maszyna01(), "maszyna01");
//        pagerAdapter.addFragment(new Maszyna02(), "maszyna02");
//        pagerAdapter.addFragment(new Maszyna03(), "maszyna03");
//        viewPager.setAdapter(pagerAdapter);
//
//
//        // it is used to join TabLayout with ViewPager
////        tabLayout.setupWithViewPager(viewPager);
    }
}