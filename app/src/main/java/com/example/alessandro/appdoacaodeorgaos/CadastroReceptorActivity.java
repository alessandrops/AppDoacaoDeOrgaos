package com.example.alessandro.appdoacaodeorgaos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroReceptorActivity extends AppCompatActivity {

    Button btnSaveReceptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_receptor);
        btnSaveReceptor = (Button) findViewById(R.id.btnSaveCadastroReceptor);

        btnSaveReceptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText) findViewById(R.id.EditTextNomeReceptor);
                EditText idade = (EditText) findViewById(R.id.EditTextIdadeReceptor);
                EditText tsangue = (EditText) findViewById(R.id.EditTextTipoSangueReceptor);
                String nomeString = nome.getText().toString();
                String idadeString = idade.getText().toString();
                String tsangueString = tsangue.getText().toString();
                String resultado;

                resultado = crud.insereReceptor(nomeString, idadeString, tsangueString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}
