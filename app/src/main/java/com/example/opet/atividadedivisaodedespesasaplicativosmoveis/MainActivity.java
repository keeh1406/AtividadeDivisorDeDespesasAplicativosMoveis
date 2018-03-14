package com.example.opet.atividadedivisaodedespesasaplicativosmoveis;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    private EditText editValor;
    private EditText editPessoa;
    private CheckBox checkServico;
    private TextView textResultado;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        editPessoa = findViewById(R.id.editPessoas);
        checkServico = findViewById(R.id.checkServico);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcular(View v){
        Double valor = Double.parseDouble(editValor.getText().toString());
        Double pessoas = Double.parseDouble(editPessoa.getText().toString());

        if(checkServico.isChecked())
            valor = valor * 1.1;

        Double resultado = valor  / pessoas;

        DecimalFormat df = new DecimalFormat("#.00");

        textResultado.setText("Valor Por Pessoa: " + df.format(resultado));
    }
}