package com.example.spentonhand;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GastoMensal extends AppCompatActivity {

    private TextView tvmensal;
    private GastoDAO gastoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto_mensal);
        tvmensal = findViewById(R.id.tvmensal);
        gastoDAO = new GastoDAO(this);

        //valor gasto mensal, pelo total
        tvmensal.setText(String.format("R$%.2f", gastoDAO.somaMensal()));
    }

    public void btnvoltarmenugastomensal(View view) {

        Intent govoltarmenumensal = new Intent(this, MainActivity.class);
        startActivity(govoltarmenumensal);
    }
}