package com.henry.formulessolve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void celciusW(View view) {
        Intent i = new Intent(this, CelciusLayout.class );
        startActivity(i);
    }

    public void fahrenheitW(View view) {
        Intent i = new Intent(this, FahrenheirLayout.class );
        startActivity(i);
    }

    public void kelvinW(View view) {
        Intent i = new Intent(this, KelvinLayout.class );
        startActivity(i);
    }

    public void rankineW(View view) {
        Intent i = new Intent(this, RankineLayout.class );
        startActivity(i);
    }

    public void reamureW(View view) {
        Intent i = new Intent(this, ReaumurLayout.class );
        startActivity(i);
    }

    public void aboutView(View view) {
        Intent i = new Intent(this, Information_layout.class );
        startActivity(i);
    }

    public void Biografias(View view) {
        Intent i = new Intent(this, BiografiasActivity.class );
        startActivity(i);
    }

}