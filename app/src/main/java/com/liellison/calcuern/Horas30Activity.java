package com.liellison.calcuern;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
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
        text30 = (TextView) findViewById(R.id.text30);

        btCalc30.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        n1 = Double.parseDouble(nota130.getText().toString());
        n2 = Double.parseDouble(nota230.getText().toString());
        resultado = ((n1 * 4) + (n2 * 5)) / 9;
        text30.setText(String.valueOf(resultado));

    }
}
