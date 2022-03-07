package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Listar extends AppCompatActivity {

    private ListView listview;
    private ContatoDAO dao;
    private List<Contato>contatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        listview = findViewById(R.id.lvContato);
        dao = new ContatoDAO(this);
        contatos = dao.listar();

        ArrayAdapter<Contato> adapter = new ArrayAdapter<Contato>(this, android.R.layout.simple_list_item_1,contatos);

        listview.setAdapter(adapter);

        registerForContextMenu(listview);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater i = getMenuInflater();

        i.inflate(R.menu.menu_contexto,menu);
    }

    public void excluir(MenuItem item){

        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        Contato a = contatos.get(menuInfo.position);

        contatos.remove(a);
        dao.deletar(a);

        //para atualizar a lista

        listview.invalidateViews();

    }
}
