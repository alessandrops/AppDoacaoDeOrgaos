package com.example.alessandro.appdoacaodeorgaos;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListDoadorActivity extends AppCompatActivity {

    public SQLiteDatabase dtBase;
    public CursorAdapter dtSource;

    public static final String campo[] = {"nome", "idade", "tipoSangue"};

    ListView lsview;
    CriaBanco helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_doador);
        lsview = (ListView) findViewById(R.id.LSView);
        helper = new CriaBanco(this);

        dtBase = helper.getWritableDatabase();

        Cursor doadores = dtBase.query(CriaBanco.DOADORES, campo, null, null, null, null, null);


        lsview.setAdapter(dtSource);

    }
}
