package com.lukewaugh.paradiddles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.lukewaugh.paradiddles.authClasses.AccountActivity;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, myToolbar, R.string.navigationDrawerOpen, R.string.navigationDrawerClose);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button singlesBtn  = (Button) findViewById(R.id.btnSingles);
        singlesBtn.setOnClickListener(this);

        Button doublesBtn  = (Button) findViewById(R.id.btnDoubles);
        doublesBtn.setOnClickListener(this);

        Button tripletsBtn = (Button) findViewById(R.id.btnTriplets);
        tripletsBtn.setOnClickListener(this);

        Button flamsBtn = (Button) findViewById(R.id.btnFlams);
        flamsBtn.setOnClickListener(this);

        Button dragsBtn = (Button) findViewById(R.id.btnDrags);
        dragsBtn.setOnClickListener(this);

        Button rollsBtn = (Button) findViewById(R.id.btnRolls);
        rollsBtn.setOnClickListener(this);


    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.settings) {
//            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
//            startActivity(intent);
//
//        } else if (id == R.id.account) {
//            Intent intent = new Intent(MainActivity.this, AccountActivity.class);
//            startActivity(intent);
//
//        } else if (id == R.id.home) {
//            Intent intent = new Intent(MainActivity.this, MainActivity.class);
//            startActivity(intent);
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.settings:
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            case R.id.account:
                startActivity(new Intent(this, AccountActivity.class));
                break;
            case R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
        return true;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSingles:
                startActivity(new Intent(this, SinglesActivity.class));
                break;
            case R.id.btnDoubles:
                startActivity(new Intent(this, DoublesActivity.class));
                break;
            case R.id.btnTriplets:
                startActivity(new Intent(this, TripletsActivity.class));
                break;
            case R.id.btnDrags:
                startActivity(new Intent(this, DragsActivity.class));
                break;
            case R.id.btnFlams:
                startActivity(new Intent(this, FlamsActivity.class));
                break;
            case R.id.btnRolls:
                startActivity(new Intent(this, RollsActivity.class));
                break;
        }

    }
}
