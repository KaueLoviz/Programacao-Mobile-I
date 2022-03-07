package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutManager;

    String[] programNameList = {"C", "C++", "Java", "Android", "HTML5", "CSS3", "JavaScript", "jQuery", "BootsTrap",
            "MySQL", "CodeIgniter", "React", "NodeJS", "AngularJS", "PostgreSQL", "Python", "C#", "Wordpress", "GitHub"};

    String[] programDescriptionList = {"C Description", "C++ Description", "Java Description", "Android Description",
            "HTML5 Description", "CSS3 Description", "JavaScript Description", "jQuery Description", "BootsTrap Description",
             "MySQL Description", "CodeIgniter Description", "React Description",
            "NodeJS Description", "AngularJS Description", "PostgreSQL Description", "Python Description",
            "C# Description", "Wordpress Description", "GitHub Description"};

    int[] programImagens = {R.drawable.c, R.drawable.clusplus, R.drawable.java, R.drawable.android, R.drawable.html,
    R.drawable.css, R.drawable.javascript, R.drawable.jquery, R.drawable.bootstrap, R.drawable.mysql,
    R.drawable.codeigniter, R.drawable.react, R.drawable.nodejs, R.drawable.angularjs, R.drawable.postgresql,
    R.drawable.python, R.drawable.csharpe, R.drawable.wordpress, R.drawable.github};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvProgram);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList, programImagens);
        recyclerView.setAdapter(programAdapter);
    }
}
