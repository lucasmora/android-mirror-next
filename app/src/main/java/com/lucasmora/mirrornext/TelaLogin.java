package com.lucasmora.mirrornext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {
    TextView esqueceu_senha_btn;
    Button login;
    ImageButton sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        esqueceu_senha_btn = (TextView) findViewById(R.id.esqueceu_senha);
        login = (Button) findViewById(R.id.entrar_btn);
        sair = (ImageButton) findViewById(R.id.sair_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principal = new Intent(getApplicationContext(), TelaPrincipal.class);
                startActivity(principal);
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sair();
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
    
    public void token(View v) {
        Toast.makeText(this, R.string.token, Toast.LENGTH_SHORT).show();
    }
    
    public void contato(View v) {
        Toast.makeText(this, R.string.contato, Toast.LENGTH_SHORT).show();
    }

    public void sair() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.icone_suporte)
                .setTitle("Fechando aplicativo")
                .setMessage("Tem certeza que deseja fechar o app?")
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Não", null)
                .show();
    }

    @Override
    public void onBackPressed() {
        sair();
    }
}