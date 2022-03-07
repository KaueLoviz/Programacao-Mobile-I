package com.example.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "bdContato.db";
    private static final int version = 7;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table tbContato(" +
                "id integer primary key autoincrement," +
                "nome varchar(40)," +
                "email varchar (40)," +
                "telefone varchar(40)," +
                "assunto varchar(20)," +
                "mensagem varchar(80) )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String sql = "drop table if exists tbContato";
        db.execSQL(sql);
        onCreate(db);

    }
}
