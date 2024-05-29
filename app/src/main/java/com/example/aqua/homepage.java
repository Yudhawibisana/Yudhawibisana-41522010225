package com.example.aqua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button tombol = findViewById(R.id.tombol);

        tombol.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
    }
    private void openDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.main);
        NavigationView navigationView = findViewById(R.id.hal_view);
        drawerLayout.openDrawer(GravityCompat.END);
    }
    public void scan(View view) {
        Intent scan = new Intent(homepage.this, scan_tutup_botol.class);
        startActivity(scan);
    }

    public void redeem(View view) {
        Intent redeem = new Intent(homepage.this, redeemvaganzapt2.class);
        startActivity(redeem);
    }

    public void extra(View view) {
        Intent extra = new Intent(homepage.this, extravaganzapt4.class);
        startActivity(extra);
    }
}