package com.example.myhealth;
import android.os.Bundle;

import com.example.myhealth.ui.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
public class MainMenu extends AppCompatActivity {


    Toolbar toolbar, toolbartab;
    ViewPager viewPager;
    TabLayout tabLayout;

    SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbartab = findViewById(R.id.toolbartab);

        viewPager = findViewById(R.id.viewpager);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
