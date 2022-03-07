package com.example.tablayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Recuperar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar);
    }

    public void recuperaremail(View view) {
        Intent goemail = new Intent(this, LoginFragment.class);
        startActivity(goemail);
    }
}
