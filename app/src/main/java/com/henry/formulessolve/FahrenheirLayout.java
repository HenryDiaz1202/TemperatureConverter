package com.henry.formulessolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class FahrenheirLayout extends AppCompatActivity {

    EditText valor;
    double datV, res;
    String frmt;
    TextView infMs, resultado, formule;
    RadioButton rd1, rd2, rd3, rd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheir_layout);

        valor = findViewById(R.id.idValorG);
        infMs = findViewById(R.id.idInfo);
        resultado = findViewById(R.id.idRes1);
        formule = findViewById(R.id.idFormule);
        rd1 = findViewById(R.id.idRBCS);
        rd2 = findViewById(R.id.idRBKV);
        rd3 = findViewById(R.id.idRBRK);
        rd4 = findViewById(R.id.idRBRM);

        valor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (rd1.isChecked()) {
                    clss();
                } else if (rd2.isChecked()) {
                    klvn();
                } else if (rd3.isChecked()) {
                    rank();
                } else if (rd4.isChecked()) {
                    remr();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    //DE FAHRENHEIT A CELCIUS
    public void clss(){}
    public void FtoC(View view) {
    }

    //DE FAHRENHEIT A KELVIN
    public void klvn(){}
    public void FtoK(View view) {
    }

    //DE FAHRENHEIT A RANKIO
    public void rank(){}
    public void FtoRk(View view) {
    }

    //DE FAHRENHEIT A RÉAUMUR
    public void remr(){}
    public void FToRM(View view) {
    }
}