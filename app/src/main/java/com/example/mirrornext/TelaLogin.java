package com.example.mirrornext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {
    TextView esqueceu_senha_btn;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        esqueceu_senha_btn = (TextView) findViewById(R.id.esqueceu_senha);
        login = (Button) findViewById(R.id.entrar_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principal = new Intent(getApplicationContext(), TelaPrincipal.class);
                startActivity(principal);
            }
        });
    }

    public void esqSenha(View v){
        Intent i = new Intent(this, EsqueciMinhaSenha.class);
        startActivity(i);
    }

    public void atalhos(View v) {
        Intent i = new Intent(this, Atalhos.class);
        startActivity(i);
    }
}