package com.example.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public ContatoDAO(Context context){

        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();

    }

    public long inserir(Contato contato){
        ContentValues values = new ContentValues();
         values.put("nome",contato.getNome());
         values.put("email",contato.getEmail());
         values.put("telefone",contato.getTelefone());
         values.put("assunto",contato.getAssunto());
         values.put("mensagem",contato.getMensagem());



         return banco.insert("tbContato",null,values);

    }

    public List<Contato>listar(){

        List<Contato> contatos = new ArrayList<>();

        Cursor cursor = banco.query("tbContato", new String[] {"id","nome","email","telefone","assunto", "mensagem"},
            null,null,null,null,null);
    while(cursor.moveToNext()){
        Contato contato = new Contato();
        contato.setIdContato(cursor.getInt(0));
        contato.setNome(cursor.getString(1));
        contato.setEmail(cursor.getString(2));
        contato.setTelefone(cursor.getString(3));
        contato.setAssunto(cursor.getString(4));
        contato.setMensagem(cursor.getString(5));

        contatos.add(contato);
    }
    return contatos;
    }

    public void excluir(Contato contato) {
        banco.delete("tbContato", "id = ", new String[]{contato.getIdContato() + " "});
    }

}
