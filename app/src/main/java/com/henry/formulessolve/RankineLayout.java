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

public class RankineLayout extends AppCompatActivity {

    EditText valor;
    double datV, res;
    String frmt;
    TextView infMs, resultado, formule;
    RadioButton rd1, rd2, rd3, rd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankine_layout);

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
                    remr();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void remr() {
    }

    public void klvn() {
    }

    public void fah() {
        try {
            infMs.setText("Valor en Fahrenheit");
            datV = Double.parseDouble(valor.getText().toString());
            res = datV + 459.67;
            frmt = new DecimalFormat("##.###").format(res)+" RK";
            resultado.setText(frmt);

            formule.setText("RK=F + 459.67 \n\n " +
                    "Sustituimos \n\n"+"RK= "+datV+" + 459.67\n" +
                    "RK= "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }

    public void clss() {
        try {
            infMs.setText("Valor en Celcius");
            datV = Double.parseDouble(valor.getText().toString());
            res = ((9*datV)/5)+491.67;
            frmt = new DecimalFormat("##.###").format(res)+" Rk";
            resultado.setText(frmt);

            formule.setText("RK=(9C/5) + 491.67 \n\n " +
                    "Sustituimos \n\n"+"RK= ((9 * "+datV+") / 5) + 491.67\n" +
                    "RK= ("+(9*datV)+"/5) + 491.67\n\n " +
                    "Sacamos el mínimo común múltiplo (mcm), en este caso siempre es 5\n\n" +
                    "Entonces, primer valor 5/5 = 1 => 1 x "+(9*datV) + " = "+(9*datV)+"\n\n" +
                    "Segundo valor, 5/1 = 5 => 5 * 491.67 = "+(5*491.67)+"\n\n" +
                    "Nos queda lo siguiente\n\n" +
                    "RK = ("+(9*datV)+" + "+(5*491.67)+") / 5\n" +
                    "RK= ("+((9*datV)+(5*491.67))+") / 5\n" +
                    "RK = "+frmt);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Debes ingresar un valor.", Toast.LENGTH_SHORT).show();
        }
    }




    public void RMToRK(View view) {
        remr();
    }

    public void KtoRk(View view) {
        klvn();
    }

    public void FtoRK(View view) {
        fah();
    }

    public void CtoRK(View view) {
        clss();
    }
}