package com.lucasmora.mirrornext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EsqueciMinhaSenha extends AppCompatActivity {
    ImageButton voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);

        voltar = (ImageButton) findViewById(R.id.voltar_btn);
    }

    public void voltar(View v) {
        Intent i = new Intent(this, TelaLogin.class);
        startActivity(i);
        finish();
    }
}