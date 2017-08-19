package com.android.belajarxml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuUtama extends AppCompatActivity {

    Button btnBirthday, btnWeight, btnScroll, btnUbahLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnBirthday = (Button) findViewById(R.id.btnBirtday);
        btnWeight = (Button) findViewById(R.id.btnWeight);
        btnScroll = (Button) findViewById(R.id.btnScroll);
        btnUbahLokasi = (Button) findViewById(R.id.btnUbahLokasi);

        btnBirthday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(menuUtama.this, BirthdayCard.class);
                startActivity(i);
            }
        });

        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menuUtama.this, belajarWeight.class);
                startActivity(i);
            }
        });

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menuUtama.this, ScrollView.class);
                startActivity(i);
            }
        });

        btnUbahLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menuUtama.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
