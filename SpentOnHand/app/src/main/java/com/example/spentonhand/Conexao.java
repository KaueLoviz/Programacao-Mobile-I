package com.example.spentonhand;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "bdGastos.db";
    private static final int version = 7;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table tbGastos(" +
                    "id integer primary key autoincrement," +
                    "produto varchar (40)," +
                    "valor double," +
                    "site varchar(40),"+
                    "data varchar(20) )");

        db.execSQL("create table tbMeta(" +
                    "id integer primary key autoincrement," +
                    "valorMeta double)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "drop table if exists tbGastos";
        db.execSQL(sql);
        onCreate(db);
    }
}