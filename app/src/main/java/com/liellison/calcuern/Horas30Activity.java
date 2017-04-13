package com.liellison.calcuern;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by liellison on 01/08/16.
 *
 * Implementacao do calculo para as disciplinas de 30h
 */

public class Horas30Activity extends Activity implements View.OnClickListener{
    EditText nota130, nota230;
    Button btCalc30;
    TextView text30;
    double n1, n2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_30horas);

        nota130 = (EditText) findViewById(R.id.nota130);
        nota230 = (EditText) findViewById(R.id.nota230);
        btCalc30 = (Button) findViewById(R.id.btCalc30);
        btCalc30.setOnClickListener(this);
        text30 = (TextView) findViewById(R.id.text30);
    }

    @Override
    public void onClick(View view) {
        String notaSe = nota230.getText().toString();
        if (!notaSe.equals("")) {
            n1 = Double.parseDouble(nota130.getText().toString());
            n2 = Double.parseDouble(nota230.getText().toString());
            resultado = ((n1 * 4) + (n2 * 5)) / 9;
            if (resultado < 7){
                text30.setText("Voce reprovou,tua nota foi "+String.valueOf(resultado));
            }else {
                text30.setText("Tua nota foi "+String.valueOf(resultado));
            }
        }else {
            n1 = Double.parseDouble(nota130.getText().toString());
            resultado = ((n1 * 4)-63) / -5;
            text30.setText("Voce precisa tirar "+String.valueOf(resultado)+" na segunda prova para passar");
        }
    }
}
