package com.bassanidevelopment.santiago.hci_movil;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);



        //displayBottomNav();
    }

    /*public void displayBottomNav(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.navigation_home:
                        Toast.makeText(MainActivity.this, "Goes Home", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.navigation_rooms:
                        startRooms();
                        break;

                    case R.id.navigation_routines:
                        Toast.makeText(MainActivity.this, "Goes to Routines", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }*/

    public void startRooms(){
        Intent intent = new Intent(this, RoomsView.class);
        startActivity(intent);
    }

    public void startRotuines(){

    }
}
