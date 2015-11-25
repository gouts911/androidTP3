

package com.example.xavfr.tp3;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class RensConifereActivity extends AppCompatActivity {

    private ListView listeNavigation;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        listeNavigation = (ListView) findViewById(R.id.list_navigation);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.ouvrir_menu,R.string.fermer_menu);

        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerLayout.setDrawerListener(drawerToggle);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listeNavigation.setOnItemClickListener(ecouterListeNavigation);


    }

    private AdapterView.OnItemClickListener ecouterListeNavigation = new AdapterView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> parent, View view , int position, long id){

            String itemChoisi = parent.getItemAtPosition(position).toString();

            String message = "Item : "+ itemChoisi;

            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

            drawerLayout.closeDrawers();
        }
    };
    @Override
    protected  void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);

        drawerToggle.syncState();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        boolean traiter = super.onOptionsItemSelected(item);

        switch (item.getItemId()){


            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), R.string.action_settings,
                        Toast.LENGTH_SHORT).show();
                traiter = true;
                break;

            default:
                break;
        }

        if(drawerToggle.onOptionsItemSelected(item)){
            traiter =true;
        }
        return traiter;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
