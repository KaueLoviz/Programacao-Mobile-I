package com.example.spentonhand;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdicionarGastos extends AppCompatActivity {

    private EditText produto;
    private EditText valor;
    private EditText site;
    private EditText data;
    private GastoDAO gastoDAO;
    // parte do gasto referente ao valor o produto
    private Gasto gasto = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_gastos);
        produto = findViewById(R.id.produto);
        valor = findViewById(R.id.valor);
        site = findViewById(R.id.site);
        data = findViewById(R.id.data);
        gastoDAO = new GastoDAO(this);

        Intent it = getIntent();
        if(it.hasExtra("gasto")){
            gasto = (Gasto) it.getSerializableExtra("gasto");
            produto.setText(gasto.getProduto());
            valor.setText(String.format("%.2f", gasto.getValor()));
            site.setText(gasto.getSite());
            data.setText(gasto.getData());
        }
    }

    public void btnsalvaradicionar(View view) {




        if(produto.getText().length() == 0 ){
            produto.setError("Insira um produto!");
        } else if(valor.getText().length() == 0) {
            valor.setError("Insira um valor!");
        } else if(site.getText().length() == 0 ){
            site.setError("Insira um site ou loja!");
        } else if(data.getText().length() == 0){
            data.setError("Insira uma data!");
        } else if(gasto == null){


            Gasto gasto = new Gasto();
            gasto.setProduto(produto.getText().toString());
            gasto.setValor(Double.parseDouble(valor.getText().toString()));
            gasto.setSite(site.getText().toString());
            gasto.setData(data.getText().toString());

            long id = gastoDAO.inserir(gasto);

            String result = String.format("ID: %s", id);
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
            Intent gomenuII = new Intent(this, MainActivity.class);
            startActivity(gomenuII);
        }else{
            gasto.setProduto(produto.getText().toString());
            gasto.setValor(Double.parseDouble(valor.getText().toString()));
            gasto.setSite(site.getText().toString());
            gasto.setData(data.getText().toString());

            try {
                gastoDAO.atualizar(gasto);
            }catch (Exception e){
                Toast.makeText(this,""+e,Toast.LENGTH_LONG).show();

            }

            Intent it = new Intent(getApplicationContext(), lista.class);
            startActivity(it);
        }

    }
}