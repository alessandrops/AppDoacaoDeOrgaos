package com.example.alessandro.appdoacaodeorgaos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by alessandro on 01/12/15.
 */
public class BancoController {
    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoController(Context context){
        banco = new CriaBanco(context);
    }
    public String insereDoador(String nome, String idade, String tsangue){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.NOMEDOADOR, nome);
        valores.put(CriaBanco.IDADEDOADOR, idade);
        valores.put(CriaBanco.TSANGUEDOADOR, tsangue);

        resultado = db.insert(CriaBanco.DOADORES, null, valores);
        db.close();

        if (resultado ==-1){
            return "Erro ao inserir cadastro";
        }else{
            return "Cadastrado com sucesso!!!";
        }
    }
    public String insereReceptor(String nome, String idade, String tsangue){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.NOMERECEPTOR, nome);
        valores.put(CriaBanco.IDADERECEPTOR, idade);
        valores.put(CriaBanco.TSANGUERECEPTOR, tsangue);

        resultado = db.insert(CriaBanco.RECEPTORES, null, valores);
        db.close();

        if (resultado ==-1){
            return "Erro ao inserir cadastro";
        }else{
            return "Cadastrado com sucesso!!!";
        }
    }
    public Cursor mostrarDoadores(){
        Cursor cursor;
        String[] campos = {banco.IDDOADOR, banco.NOMEDOADOR, banco.IDADEDOADOR, banco.TSANGUEDOADOR};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.DOADORES, campos, null, null, null, null, null);

        if (cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
}
