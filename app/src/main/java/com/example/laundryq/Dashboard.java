package com.example.laundryq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        CardView pc = findViewById(R.id.pickup);
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,Pickup.class);
                startActivity(log);
            }
        });
        CardView ct = findViewById(R.id.contact);
        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,Contact.class);
                startActivity(log);
            }
        });
        CardView st = findViewById(R.id.status);
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,Status.class);
                startActivity(log);
            }
        });
        CardView mp = findViewById(R.id.maps);
        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,MapsActivity.class);
                startActivity(log);
            }
        });
    }
}
