package com.example.projecttech_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TableLayout tabLayout = findViewById(R.id.tabLayout);
        TabItem maszyna01 = findViewById(R.id.maszyna01);
        TabItem maszyna02 = findViewById(R.id.maszyna02);
        TabItem maszyna03 = findViewById(R.id.maszyna03);
        ViewPager viewPager = findViewById(R.id.viewpager);
    }
}