package com.example.spentonhand;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class GastoDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public GastoDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Gasto gasto){
        ContentValues values = new ContentValues();
        values.put("produto",gasto.getProduto());
        values.put("valor",gasto.getValor());
        values.put("site",gasto.getSite());
        values.put("data",gasto.getData());
        return banco.insert("tbGastos",null,values);
    }

    public List<Gasto> listar(){
        List<Gasto> gastos = new ArrayList<>();
        Cursor cursor = banco.query("tbGastos", new String[] {"id","produto","valor","site","data"},
                null,null,null,null,null);
        while(cursor.moveToNext()){
            Gasto gasto = new Gasto();
            gasto.setIdGasto(cursor.getInt(0));
            gasto.setProduto(cursor.getString(1));
            gasto.setValor(cursor.getDouble(2));
            gasto.setSite(cursor.getString(3));
            gasto.setData(cursor.getString(4));

            gastos.add(gasto);
        }
        return gastos;
    }

    public void excluir(Gasto gasto) {
        banco.delete("tbGastos", "id=?", new String[]{gasto.getIdGasto() + " "});
    }

    public long atualizar(Gasto gasto){
        ContentValues values = new ContentValues();
        values.put("id",gasto.getIdGasto());
        values.put("produto",gasto.getProduto());
        values.put("valor",gasto.getValor());
        values.put("site",gasto.getSite());
        values.put("data",gasto.getData());
        return banco.update("tbGastos", values, "id="+gasto.getIdGasto(), null);
    }

    public double somaMensal(){
        double tot = 0;
        Cursor c = banco.query("tbGastos", new String[]{"valor"},
                null,null,null,null,null);
        while(c.moveToNext()){
            tot += c.getDouble(0);
        }
        return tot;
    }
}