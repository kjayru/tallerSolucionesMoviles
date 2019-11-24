package com.mwp.tatalleresmoviles;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;

import com.mwp.tatalleresmoviles.Fragments.deportesFragment;
import com.mwp.tatalleresmoviles.Fragments.electroFragment;
import com.mwp.tatalleresmoviles.Fragments.juegosFragment;
import com.mwp.tatalleresmoviles.Fragments.tecnologiaFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_main) ;

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_launcher_background);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view );
        navigationView.setNavigationItemSelectedListener(this);
        setFragmentByDefault();



    }

    private void setFragmentByDefault(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame,new tecnologiaFragment() )
                .commit();
    }


    @Override
    public void onBackPressed () {
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super .onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_drawer, menu);


        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        //int id = item.getItemId();
        //if (id == R.id.action_settings){
        //    return true;
       // }
        switch (item.getItemId()){
            case android.R.id.home:
                return true;
        }
        return super .onOptionsItemSelected(item);
    }

    @SuppressWarnings ( "StatementWithEmptyBody" )
    @Override
    public boolean onNavigationItemSelected (@NonNull MenuItem item) {
        // eventos de navegación menu
        boolean fragmentTransactions = false;
        Fragment fragment = null;

        int id = item.getItemId() ;
        if (id == R.id.tecnologia ) {

            fragment = new tecnologiaFragment();
            fragmentTransactions = true;

        } else if (id == R.id.deportes ) {
            fragment = new deportesFragment();
            fragmentTransactions = true;

        } else if (id == R.id.juegos ) {
            fragment = new juegosFragment();
            fragmentTransactions = true;

        } else if (id == R.id.electro ) {
            fragment = new electroFragment();
            fragmentTransactions = true;

        }

        if(fragmentTransactions){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content_frame,fragment)
                    .commit();

            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

            DrawerLayout drawer =  findViewById(R.id.drawer_layout);
            drawer.closeDrawers();

        }

        DrawerLayout drawer =  findViewById(R.id.drawer_layout );
        drawer.closeDrawer(GravityCompat.START ) ;
        return true;
    }


}
