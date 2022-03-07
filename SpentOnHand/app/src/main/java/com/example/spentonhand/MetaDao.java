package com.example.spentonhand;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class MetaDao {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public MetaDao(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Meta meta){
        ContentValues values = new ContentValues();
        values.put("valorMeta", meta.getMeta());
        return banco.insert("tbMeta", null, values);
    }

    public double selectMeta(){
        // se inicia no zero a meta à gastar
        double tot = 0;
        Cursor c = banco.query("tbMeta", new String[]{"valorMeta"},
                null,null,null,null,null);
        while(c.moveToNext()){
            tot += c.getDouble(0);
        }
        return tot;
    }

    public int metaCount(){
        Cursor c = banco.rawQuery("select valorMeta from tbMeta", null);
        return c.getCount();
    }
}