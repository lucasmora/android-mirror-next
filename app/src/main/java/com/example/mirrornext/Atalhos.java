package com.example.mirrornext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Atalhos extends AppCompatActivity {
    private ImageButton voltar;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adaptador;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atalhos);

        voltar = (ImageButton) findViewById(R.id.voltar_btn);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerAtalhos);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        int[] imagens = {R.drawable.icone_cx_eletronico, R.drawable.icone_dolar, R.drawable.icone_suporte};
        String[] dados = {"Buscar caixas eletrônicos", "Cotação do dólar", "Contato"};
        adaptador = new Adaptador(imagens, dados);
        recyclerView.setAdapter(adaptador);
    }

    public void voltar(View v) {
        Intent i = new Intent(this, TelaLogin.class);
        startActivity(i);
        finish();
    }
}