package com.example.alessandro.appdoacaodeorgaos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoadorActivity extends AppCompatActivity {

    Button btnCadastro;
    Button btnListDoadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doador);
        btnCadastro = (Button) findViewById(R.id.btnCadastrarDoadores);
        btnListDoadores = (Button) findViewById(R.id.btnListDoadores);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itCadastro = new Intent();
                itCadastro.setClass(DoadorActivity.this, CadastroDoadorActivity.class);
                startActivity(itCadastro);
            }
        });
        btnListDoadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itList = new Intent();
                itList.setClass(DoadorActivity.this, ListDoadorActivity.class);
                startActivity(itList);
            }
        });
    }
}
