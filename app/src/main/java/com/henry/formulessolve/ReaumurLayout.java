package com.henry.formulessolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ReaumurLayout extends AppCompatActivity {

    EditText valor;
    double datV, res, resta,multiplicar;
    String frmt,restaFRM,multiplicarFR;
    TextView infMs, resultado, formule;
    RadioButton rd1, rd2, rd3, rd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaumur_layout);

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
                    fah();
                } else if (rd3.isChecked()) {
                    klvn();
                } else if (rd4.isChecked()) {
                    rank();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void rank() {
        try {
            infMs.setText("Valor en Rankine");
            datV = Double.parseDouble(valor.getText().toString());
            res = (4*(datV-491.67)/9);
            frmt = new DecimalFormat("##.###").format(res)+" RM";
            resultado.setText(frmt);

            formule.setText("RM=4(RK - 491.67)/9 \n\n " +
                    "Sustituimos \n\n"+"RM= 4("+datV+" - 491.67)/9\n" +
                    "RM= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }

    private void klvn() {
        try {
            infMs.setText("Valor en Kelvin");
            datV = Double.parseDouble(valor.getText().toString());
            res = (4*(datV-273.15)/5);
            frmt = new DecimalFormat("##.###").format(res)+" RM";
            resultado.setText(frmt);

            formule.setText("RM=4(K - 273.15)/5 \n\n " +
                    "Sustituimos \n\n"+"RM= 4("+datV+" - 273.15)/5\n" +
                    "RM= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }

    private void fah() {
        try {
            infMs.setText("Valor en Fahrenheit");
            datV = Double.parseDouble(valor.getText().toString());
            res = (4*(datV-32)/9);
            frmt = new DecimalFormat("##.###").format(res)+" RM";
            resultado.setText(frmt);

            formule.setText("RM=4(F - 32)/9 \n\n " +
                    "Sustituimos \n\n"+"RM= 4("+datV+" - 32)/9\n" +
                    "RM= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }

    private void clss() {
        try {
            infMs.setText("Valor en Celcius");
            datV = Double.parseDouble(valor.getText().toString());
            res = ((4*datV)/5);
            frmt = new DecimalFormat("##.###").format(res)+" RM";
            resultado.setText(frmt);

            formule.setText("RM= 4C/5 \n\n " +
                    "Sustituimos \n\n"+"RM= 4("+datV+")/5\n" +
                    "RM= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    //----------------------------------------------//
    public void RKToRM(View view) {
        rank();
    }

    public void KtoRM(View view) {
        klvn();
    }

    public void FtoRM(View view) {
        fah();
    }

    public void CtoRM(View view) {
        clss();
    }
}