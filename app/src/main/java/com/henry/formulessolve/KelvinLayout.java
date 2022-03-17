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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.text.DecimalFormat;

public class KelvinLayout extends AppCompatActivity {

    private static final String TAG = "KelvinLayout";
    private AdView mAdView;

    EditText valor;
    double datV, res;
    String frmt;
    TextView infMs, resultado, formule;
    RadioButton rd1, rd2, rd3, rd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_layout);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

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

    public void remr() {
        try {
            infMs.setText("Valor en Réaumur");
            datV = Double.parseDouble(valor.getText().toString());
            res = ((5*datV)/4)+273.15;
            frmt = new DecimalFormat("##.###").format(res)+" k";
            resultado.setText(frmt);

            formule.setText("K=(5RE/4) + 273.15 \n\n " +
                    "Sustituimos \n\n"+"K= ((5 * "+datV+") / 4) + 273.15\n" +
                    "K= ("+(5*datV)+"/4) + 273.15\n\n " +
                    "Sacamos el mínimo común múltiplo (mcm), en este caso siempre es 4\n\n" +
                    "Entonces, primer valor 4/4 = 1 => 1 x "+(5*datV) + " = "+(5*datV)+"\n\n" +
                    "Segundo valor, 4/1 = 4 => 4 * 273.15 = "+(4*273.15)+"\n\n" +
                    "Nos queda lo siguiente\n\n" +
                    "K = ("+(5*datV)+" + "+(4*273.15)+") / 4\n" +
                    "K= ("+((5*datV)+(4*273.15))+") / 4\n" +
                    "K = "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }

    public void rank() {
        try {
            infMs.setText("Valor en Rankine");
            datV = Double.parseDouble(valor.getText().toString());
            res = (5*(datV-491.67)/9)+273.15;
            frmt = new DecimalFormat("##.###").format(res)+" k";
            resultado.setText(frmt);

            formule.setText("K=5(RK - 491.67)/9 + 273.15 \n\n " +
                    "Sustituimos \n\n"+"K= 5("+datV+" - 491.67) / 9 + 273.15\n" +
                    "K= 5("+(datV - 491.67)+")/9 + 273.15\n"+"K= ("+(5*(datV - 491.67))+")/9 + 273.15\n\n"+
                    "Sacamos el mínimo común múltiplo (mcm), en este caso siempre es 9\n\n" +
                    "Entonces, primer valor 9/9 = 1 => 1 x "+(5*(datV - 491.67)) + " = "+(5*(datV - 491.67))+"\n\n" +
                    "Segundo valor, 9/1 = 9 => 9 * 273.15 = "+(9*273.15)+"\n\n" +
                    "Nos queda lo siguiente\n\n" +
                    "K = ("+(5*(datV - 491.67))+" + "+(9*273.15)+") / 9\n" +
                    "K= ("+((5*(datV - 491.67))+(9*273.15))+") / 9\n" +
                    "K = "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }

    public void fah() {
        try {
            infMs.setText("Valor en Fahrenheit");
            datV = Double.parseDouble(valor.getText().toString());
            res = (5*(datV-32)/9)+273.15;
            frmt = new DecimalFormat("##.###").format(res)+" k";
            resultado.setText(frmt);

            formule.setText("K=5(F - 32)/9 + 273.15 \n\n " +
                    "Sustituimos \n\n"+"K= 5("+datV+" - 32) / 9 + 273.15\n" +
                    "K= 5("+(datV - 32)+")/9 + 273.15\n"+"K= ("+(5*(datV - 32))+")/9 + 273.15\n\n"+
                    "Sacamos el mínimo común múltiplo (mcm), en este caso siempre es 9\n\n" +
                    "Entonces, primer valor 9/9 = 1 => 1 x "+(5*(datV - 32)) + " = "+(5*(datV - 32))+"\n\n" +
                    "Segundo valor, 9/1 = 9 => 9 * 273.15 = "+(9*273.15)+"\n\n" +
                    "Nos queda lo siguiente\n\n" +
                    "K = ("+(5*(datV - 32))+" + "+(9*273.15)+") / 9\n" +
                    "K= ("+((5*(datV - 32))+(9*273.15))+") / 9\n" +
                    "K = "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }

    public void clss() {
        try {
            infMs.setText("Valor en Celcius");
            datV = Double.parseDouble(valor.getText().toString());
            res = datV + 273.15;
            frmt = new DecimalFormat("##.###").format(res)+" °C";
            resultado.setText(frmt);

            formule.setText("K=C + 273.15 \n\n " +
                    "Sustituimos \n\n"+"K= "+datV+" + 273.15\n" +
                    "K= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }


    public void KToRM(View view) {
        remr();
    }

    public void KtoRk(View view) {
        rank();
    }

    public void KtoF(View view) {
        fah();
    }

    public void KtoC(View view) {
        clss();
    }
}