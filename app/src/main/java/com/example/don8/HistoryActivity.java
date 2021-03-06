package com.example.don8;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class HistoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_history:
                        //startActivity(new Intent(HistoryActivity.this, HistoryActivity.class));
                        break;
                    case R.id.action_data:
                        startActivity(new Intent(HistoryActivity.this, DataActivity.class));                        break;
                    case R.id.action_donate:
                        startActivity(new Intent(HistoryActivity.this, MapsActivity.class));                        break;
                    case R.id.action_profile:
                        startActivity(new Intent(HistoryActivity.this, ProfileActivity.class));
                        break;
                }
                return true;
            }
        });
    }
}
