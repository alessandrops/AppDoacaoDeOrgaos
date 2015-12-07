package com.example.alessandro.appdoacaodeorgaos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroDoadorActivity extends AppCompatActivity {

    Button btnSaveDoador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_doador);
        btnSaveDoador = (Button) findViewById(R.id.btnSaveCadastroDoador);

        btnSaveDoador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText) findViewById(R.id.EditTextNomeDoador);
                EditText idade = (EditText) findViewById(R.id.EditTextIdadeDoador);
                EditText tsangue = (EditText) findViewById(R.id.EditTextTipoSangueDoador);
                String nomeString = nome.getText().toString();
                String idadeString = idade.getText().toString();
                String tsangueString = tsangue.getText().toString();
                String resultado;

                resultado = crud.insereDoador(nomeString, idadeString, tsangueString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}
