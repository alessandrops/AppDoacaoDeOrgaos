package com.example.alessandro.appdoacaodeorgaos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alessandro on 30/11/15.
 */
public class CriaBanco extends SQLiteOpenHelper{
    //Variavel DB.
    public static final String DOACOES = "doacoes.db";

    //Variaveis para a tabela de doadores.
    public static final String DOADORES = " doadores";
    public static final String IDDOADOR = " idDoadores";
    public static final String NOMEDOADOR = " nome";
    public static final String IDADEDOADOR = " idade";
    public static final String TSANGUEDOADOR = " tipoSangue";

    //Variaveis para a tabela de receptores.
    public static final String RECEPTORES = "receptores";
    public static final String IDRECEPTOR = "idReceptor";
    public static final String NOMERECEPTOR = "nome";
    public static final String IDADERECEPTOR = "idade";
    public static final String TSANGUERECEPTOR = "sangue";
    //Versao do DB.
    public static final int VERSAO = 1;


    @Override
    public void onCreate(SQLiteDatabase db) {
        //Comando sql para criar a tabela de doadores.
        String sqlDoador = "CREATE TABLE " + DOADORES + " ( "
                + IDDOADOR + " integer primary key autoincrement, "
                + NOMEDOADOR + " text, "
                + IDADEDOADOR + " text, "
                + TSANGUEDOADOR + " text "
                +" )";
        db.execSQL(sqlDoador);
        // comando sql para criar a tabela de receptores.
        String sqlReceptor = "CREATE TABLE " + RECEPTORES + " ( "
                + IDRECEPTOR + " integer primary key autoincrement, "
                + NOMERECEPTOR + " text, "
                + IDADERECEPTOR + " text, "
                + TSANGUERECEPTOR + " text "
                +" )";
        db.execSQL(sqlReceptor);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + DOADORES);
        db.execSQL("DROP TABLE IF EXISTS" + RECEPTORES);
        onCreate(db);

    }

    public CriaBanco(Context context) {
        super(context, DOACOES, null, VERSAO);
    }
}
