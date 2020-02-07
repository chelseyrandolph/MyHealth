package com.example.myhealth;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.example.myhealth.ui.main.SectionsPagerAdapter;

public class MainMenu extends AppCompatActivity {


    Toolbar toolbar, toolbartab;
    ViewPager viewPager;
    TabLayout tabLayout;

    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbartab=(Toolbar)findViewById(R.id.toolbartab);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);

        pageAdapter=new PageAdapter(getSupportFragmentManager());
        pageAdapter.addFragment(new MedicalFragment(), "Medical");
        pageAdapter.addFragment(new LifestyleFragment(), "Lifestyle");
        pageAdapter.addFragment(new ProfileFragment(), "Profile");

        viewPager.setAdapter(pageAdapter);

    }
}