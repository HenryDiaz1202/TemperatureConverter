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

public class CelciusLayout extends AppCompatActivity {


    EditText valor;
    double datV,res;
    String frmt;
    TextView infMs, resultado, formule;
    RadioButton rd1,rd2,rd3,rd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_layout);

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
                if(rd1.isChecked()){
                    fah();
                }
                else if(rd2.isChecked()){
                    klvn();
                }
                else if(rd3.isChecked()){
                    rank();
                }
                else if(rd4.isChecked()){
                    remr();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
    //CONVERTIR DE FAHRENHEIT
    public void fah(){
        try {
            infMs.setText("Valor en Fahrenheit");
            datV = Double.parseDouble(valor.getText().toString());
            res = 5*(datV-32)/9;
            frmt = new DecimalFormat("##.###").format(res)+" °C";
            resultado.setText(frmt);

            formule.setText("C=5(F - 32)/9 \n\n " +
                    "Sustituimos \n\n"+"C= 5("+datV+" - 32)/9\n" +
                    "C= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void CtoF(View view) {
        fah();
    }

    //CONVERTIR DE KELVIN
    public void klvn(){
        try {
            infMs.setText("Valor en Kelvin");
            datV = Double.parseDouble(valor.getText().toString());
            res = datV - 273.15;
            frmt = new DecimalFormat("##.###").format(res)+" °C";
            resultado.setText(frmt);

            formule.setText("C=K - 273.15 \n\n " +
                    "Sustituimos \n\n"+"C= "+datV+" - 273.15\n" +
                    "C= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void CtoK(View view) {
        klvn();
    }

    //CONVERTIR DE RANKIO
    public void rank(){
        try {
            infMs.setText("Valor en Rankine");
            datV = Double.parseDouble(valor.getText().toString());
            res = 5*(datV-491.67)/9;
            frmt = new DecimalFormat("##.###").format(res)+" °C";
            resultado.setText(frmt);

            formule.setText("C=5(RK - 491.67)/9 \n\n " +
                    "Sustituimos \n\n"+"C= 5("+datV+" - 491.67)/9\n" +
                    "C= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void CtoRk(View view) {
       rank();
    }

    //CONVERTIR DE RÉAUMUR
    public void remr(){
        try {
            infMs.setText("Valor en Réaumur");
            datV = Double.parseDouble(valor.getText().toString());
            res = (5*datV)/4;
            frmt = new DecimalFormat("##.###").format(res)+" °C";
            resultado.setText(frmt);

            formule.setText("C=(5 * RM)/4 \n\n " +
                    "Sustituimos \n\n"+"C= (5 * "+datV+")/4\n" +
                    "C= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void CToRM(View view) {
        remr();
    }



}