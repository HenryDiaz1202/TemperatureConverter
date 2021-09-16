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

public class FahrenheirLayout extends AppCompatActivity {

    EditText valor;
    double datV, res, resta,multiplicar;
    String frmt,restaFRM,multiplicarFR;
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
    public void clss(){
        try {
            infMs.setText("Valor en Celcius");
            datV = Double.parseDouble(valor.getText().toString());
            res = ((9*datV)/5)+32;
            frmt = new DecimalFormat("##.###").format(res)+" F";
            resultado.setText(frmt);

            formule.setText("F=(9C°/5) + 32 \n\n " +
                    "Sustituimos \n\n"+"F= ((9 * "+datV+") / 5) + 32\n" +
                    "F= ("+(9*datV)+"/5) + 32\n\n " +
                    "Sacamos el mínimo común múltiplo (mcm), en este caso siempre es 5\n\n" +
                    "Entonces, primer valor 5/5 = 1 => 1 x "+(9*datV) + " = "+(9*datV)+"\n\n" +
                    "Segundo valor, 5/1 = 5 => 5 * 32 = "+(5*32)+"\n\n" +
                    "Nos queda lo siguiente\n\n" +
                    "F = ("+(9*datV)+" + "+(5*32)+") / 5\n" +
                    "F= ("+((9*datV)+(5*32))+") / 5\n" +
                    "F = "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void FtoC(View view) {
        clss();
    }

    //DE FAHRENHEIT A KELVIN
    public void klvn(){
        try {
            infMs.setText("Valor en Kelvin");
            datV = Double.parseDouble(valor.getText().toString());
            res = (9*(datV - 273.15)/5)+32;
            frmt = new DecimalFormat("##.###").format(res)+" F";
            resultado.setText(frmt);

            resta = (datV - 273.15);
            restaFRM = new DecimalFormat("##.###").format(resta);
            multiplicar = (9 * resta);
            multiplicarFR  = new DecimalFormat("##.###").format(multiplicar);


            formule.setText("F=9(K - 273.15)/5 + 32 \n\n " +
                    "Sustituimos \n\n"+"F= 9("+datV+" - 273.15)/5 + 32\n" +
                    "F= 9("+restaFRM+")/5 + 32\n" +"F= ("+multiplicarFR+")/5 + 32\n\n"+
                    "Sacamos el mínimo común múltiplo (mcm), en este caso siempre es 5\n\n" +
                    "Entonces, primer valor 5/5 = 1 => 1 x "+multiplicarFR + " = "+multiplicarFR+"\n\n" +
                    "Segundo valor, 5/1 = 5 => 5 * 32 = "+(5*32)+"\n\n" +
                    "Nos queda lo siguiente\n\n" +
                    "F = ("+multiplicarFR+" + "+(5*32)+") / 5\n" +
                    "F= ("+(multiplicar + (5*32))+") / 5\n" +
                    "F = "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void FtoK(View view) {
        klvn();
    }

    //DE FAHRENHEIT A RANKIO
    public void rank(){
        try {
            infMs.setText("Valor en Rankine");
            datV = Double.parseDouble(valor.getText().toString());
            res = (datV - 459.67);
            frmt = new DecimalFormat("##.###").format(res)+" F";
            resultado.setText(frmt);

            formule.setText("F=RK - 459.67 \n\n " +
                    "Sustituimos \n\n"+
                    "F= "+datV+" - 459.67\n" +
                    "F = "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void FtoRk(View view) {
        rank();
    }

    //DE FAHRENHEIT A RÉAUMUR
    public void remr(){
        try {
            infMs.setText("Valor en Réaumur");
            datV = Double.parseDouble(valor.getText().toString());
            res = ((9*datV)/4)+32;
            frmt = new DecimalFormat("##.###").format(res)+" F";
            resultado.setText(frmt);

            formule.setText("F=(9RE/4) + 32 \n\n " +
                    "Sustituimos \n\n"+"F= ((9 * "+datV+") / 4) + 32\n" +
                    "F= ("+(9*datV)+"/4) + 32\n\n " +
                    "Sacamos el mínimo común múltiplo (mcm), en este caso siempre es 4\n\n" +
                    "Entonces, primer valor 4/4 = 1 => 1 x "+(9*datV) + " = "+(9*datV)+"\n\n" +
                    "Segundo valor, 4/1 = 4 => 4 * 32 = "+(4*32)+"\n\n" +
                    "Nos queda lo siguiente\n\n" +
                    "F = ("+(9*datV)+" + "+(4*32)+") / 4\n" +
                    "F= ("+((9*datV)+(4*32))+") / 4\n" +
                    "F = "+frmt);


        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }
    public void FToRM(View view) {
        remr();
    }
}