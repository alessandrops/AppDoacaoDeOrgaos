package com.example.alessandro.appdoacaodeorgaos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alessandro on 02/12/15.
 */
public class DoadorAdapter extends ArrayAdapter<Doador>{
    public  DoadorAdapter(Context context, int resorce, List<Doador> objects){
        super(context, resorce, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View linha = LayoutInflater.from(getContext()).inflate(R.layout.listdoadoreadapter, null);
        TextView txtNomeDoador = (TextView) linha.findViewById(R.id.TXTNomeDoador);
        TextView txtIdadeDoador = (TextView) linha.findViewById(R.id.TXTIdadeDoador);
        TextView txtTsangueDoador = (TextView) linha.findViewById(R.id.TXTTSangueDoador);

        Doador d = getItem(position);
        txtNomeDoador.setText(d.getNomeDoador());
        txtIdadeDoador.setText(d.getIdadeDoador());
        txtTsangueDoador.setText(d.getTsangueDoador());
        return linha;
    }
}
