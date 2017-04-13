package com.liellison.calcuern;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/**
 * Created by liellison on 27/06/16.
 *
 * Implementacao do calculo para as disciplinas de 90h
 */
public class Horas90Activity extends Activity implements View.OnClickListener{
    EditText nota1, nota2, nota3;
    Button btCalc90;
    TextView text90;
    double n1, n2, n3, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_90horas);

        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        btCalc90 = (Button) findViewById(R.id.btCalc90);
        text90 = (TextView) findViewById(R.id.text90);

        btCalc90.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String notad3 = nota3.getText().toString();
        System.out.println("Nota 3"+ notad3);

        if (notad3.equals("")) {
            n1 = Double.parseDouble(nota1.getText().toString());
            n2 = Double.parseDouble(nota2.getText().toString());
            resultado = (((n1 * 4) + (n2 * 5))-105)/-6;
            text90.setText("Voce precisa tirar " + String.valueOf(resultado)+" na 3° prova");
        } else {
            n1 = Double.parseDouble(nota1.getText().toString());
            n2 = Double.parseDouble(nota2.getText().toString());
            n3 = Double.parseDouble(nota3.getText().toString());
            resultado = ((n1 * 4) + (n2 * 5) + (n3 * 6)) / 15;
            if (resultado < 7){
                text90.setText("Voce reprovou,tua nota foi "+String.valueOf(resultado));
            }else {
                text90.setText("Tua nota foi "+String.valueOf(resultado));
            }
        }

    }
}
