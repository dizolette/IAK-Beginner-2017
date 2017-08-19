package com.android.belajarxml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView nama, lokasi;
    String namaA, lokasiA, namaB, lokasiB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (TextView) findViewById(R.id.nama_tempat);
        lokasi = (TextView) findViewById(R.id.lokasi);

        namaA = "Pantai Derawan";
        lokasiA = "Kalimantan Timur";
        namaB = "Borobudur";
        lokasiB = "Magelang";
    }

    public void ubahTempatLokasi(View view){
        int id = view.getId();

        switch(id){

            case R.id.gambar_pantai :
                nama.setText(namaA);
                lokasi.setText(lokasiA);
                break;

            case R.id.gambar_borobudur :
                nama.setText(namaB);
                lokasi.setText(lokasiB);
                break;
        }
    }

    public void btnShare(View view){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT, "Nama tempat :" + nama.getText() + "\n Lokasi : " + lokasi.getText());
        i.setType("text/plain");
        startActivity(i);
    }

}
