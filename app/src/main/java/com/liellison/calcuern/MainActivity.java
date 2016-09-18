package com.liellison.calcuern;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by liellison on 27/06/16.
 *
 * Tela inicial com 2 button, um para calcular as materias de 90h e outra para as de 30h.
 */

public class MainActivity extends Activity implements View.OnClickListener{
	Button bt90horas, bt30horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt90horas = (Button) findViewById (R.id.bt90horas);
        bt30horas = (Button) findViewById(R.id.bt30horas);

        bt90horas.setOnClickListener(this);
        bt30horas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Horas30Activity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,Horas90Activity.class);
        startActivity(intent);
    }
}
