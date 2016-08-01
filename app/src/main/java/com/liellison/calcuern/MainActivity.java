package com.liellison.calcuern;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
	Button bt90horas, bt30horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt90horas = (Button) findViewById (R.id.bt90horas);
        bt30horas = (Button) findViewById(R.id.bt30horas);


    }
}
