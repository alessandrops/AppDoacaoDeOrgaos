package com.example.alessandro.appdoacaodeorgaos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReceptorActivity extends AppCompatActivity {

    Button btnCadastrarReceptor;
    Button btnListReceptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);
        btnCadastrarReceptor = (Button) findViewById(R.id.btnCadastrarReceptor);

        btnCadastrarReceptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itCadastrarReceptor = new Intent();
                itCadastrarReceptor.setClass(ReceptorActivity.this, CadastroReceptorActivity.class);
                startActivity(itCadastrarReceptor);
            }
        });
    }
}
