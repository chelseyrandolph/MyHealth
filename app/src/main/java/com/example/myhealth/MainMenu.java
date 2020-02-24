package com.example.myhealth;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
public class MainMenu extends AppCompatActivity {


    Toolbar toolbar, toolbartab;
    ViewPager viewPager;
    TabLayout tabLayout;

    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        toolbar = findViewById(R.id.toolbar);
        toolbartab = findViewById(R.id.toolbartab);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);


        setSupportActionBar(toolbar);

        pageAdapter = new PageAdapter(getSupportFragmentManager());
        pageAdapter.addFragment(new MedicalFragment(), "Medical");
        pageAdapter.addFragment(new LifestyleFragment(), "Lifestyle");
        pageAdapter.addFragment(new ProfileFragment(), "Profile");

        viewPager.setAdapter(pageAdapter);
        //This hides the tab names, but allows the users to change between tabs
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}