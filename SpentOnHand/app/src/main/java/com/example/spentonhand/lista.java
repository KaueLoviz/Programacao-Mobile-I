package com.example.spentonhand;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;

public class lista extends AppCompatActivity {

    private ListView listview;
    private GastoDAO dao;
    private List<Gasto> gastos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        listview = findViewById(R.id.lvDefinir);
        dao = new GastoDAO(this);
        gastos = dao.listar();
        ArrayAdapter<Gasto> adapter = new ArrayAdapter<Gasto>(this, android.R.layout.simple_list_item_1,gastos);
        listview.setAdapter(adapter);

        registerForContextMenu(listview);

        listview.invalidateViews();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu,menu);
    }

    public void excluir(MenuItem item){
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        Gasto g = gastos.get(menuInfo.position);
        gastos.remove(g);
        dao.excluir(g);

        listview.invalidateViews();
    }

    public void alterar(MenuItem item){
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        Gasto g = gastos.get(menuInfo.position);

        Intent gomenuIIII = new Intent(this, AdicionarGastos.class);
        gomenuIIII.putExtra("gasto", g);
        startActivity(gomenuIIII);
    }

    public void btnvoltarmenu(View view) {
        Intent golistamenu = new Intent(this, MainActivity.class);
        startActivity(golistamenu);
    }
}