package com.example.mirrornext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {
    ImageButton icone_visivel;
    TextView texto_saldo;
    String valor_saldo;
    boolean visivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        icone_visivel = (ImageButton) findViewById(R.id.btn_visib_saldo);
        texto_saldo = (TextView) findViewById(R.id.valor_saldo);

        visivel = true;
        valor_saldo = "R$ 6.541,21";
    }

    public void alternarVisibSaldo(View v) {
        if (visivel) {
            // Ocultando saldo
            String oculto = "";
            for (int d = 0; d < texto_saldo.getText().toString().length(); d++) {
                oculto = oculto + "-";
            }
            texto_saldo.setText(oculto);
            icone_visivel.setBackgroundResource(R.drawable.icone_olho_off);
            visivel = false;
        } else {
            // Mostrando saldo
            texto_saldo.setText(valor_saldo);
            icone_visivel.setBackgroundResource(R.drawable.icone_olho_on);
            visivel = true;
        }
    }
}