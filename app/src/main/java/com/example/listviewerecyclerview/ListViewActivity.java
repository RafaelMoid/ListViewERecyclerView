package com.example.listviewerecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "New brunwswick", "halifax", "labrador & newfoundland", "Quebec",
            "New brunwswick", "halifax", "labrador & newfoundland", "Quebec",
            "New brunwswick", "halifax", "labrador & newfoundland", "Quebec",
            "New brunwswick", "halifax", "labrador & newfoundland", "Quebec",
            "New brunwswick", "halifax", "labrador & newfoundland", "Quebec"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adicionar adaptador a lista
        listLocais.setAdapter( adaptador );

        //Adicionar click listener
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSeleciondo = listLocais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valorSeleciondo, Toast.LENGTH_LONG).show();
            }
        });

    }
}
