package com.example.alessandro.appdoacaodeorgaos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDoador;
    Button btnReceptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDoador = (Button) findViewById(R.id.btnDoador);
        btnReceptor = (Button) findViewById(R.id.btnReceptor);

        btnDoador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itDoador = new Intent();
                itDoador.setClass(MainActivity.this, DoadorActivity.class);
                startActivity(itDoador);
            }
        });
        btnReceptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itReceptor = new Intent();
                itReceptor.setClass(MainActivity.this, ReceptorActivity.class);
                startActivity(itReceptor);
            }
        });
    }
}
