package com.example.sih2022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment=new HomeFragment();
    AddmissionFragment addmissionFragment=new AddmissionFragment();
    ResultFragment resultFragment=new ResultFragment();
    CertificationFragment certificationFragment=new CertificationFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_navi);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;

                    case R.id.addmiss:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,addmissionFragment).commit();
                        return true;

                    case R.id.result:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,resultFragment).commit();
                        return true;

                    case R.id.certi:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,certificationFragment).commit();
                }
                return false;

            }
        });

    }
}