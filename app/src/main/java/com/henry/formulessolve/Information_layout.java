package com.henry.formulessolve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Information_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_layout);
    }

    public void politicas(View view) {
        Uri uri = Uri.parse("https://intec-120.web.app/politicas.html#convtemperaturas");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void otras(View view) {
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=henrydiaz"));
        startActivity(intentNavegador);
        finish();
    }

    public void back(View view) {
        finish();
    }
}