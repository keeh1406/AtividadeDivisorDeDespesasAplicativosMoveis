package com.example.opet.atividadedivisaodedespesasaplicativosmoveis;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

// Divisão de despesa: O App deve ser capaz de dividir uma despesa geral (Restaurante, Bar, etc...)
// O aplicativo deve ser capaz de adicionar ou não os 10% do serviço caso o usuário assim desejar.

public class MainActivity extends Activity {
    EditText editValor;
    EditText editQuantidadePessoas;
    CheckBox checkBoxTaxa;
    Double valor_double;
    Double quantidade_double;
    Double resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        editQuantidadePessoas = findViewById(R.id.editQuantidadePessoas);
        checkBoxTaxa = findViewById(R.id.checkBoxTaxa);
    }

    public void click(View v) {
        String data = editValor.getText().toString();
        String data2 = editQuantidadePessoas.getText().toString();
        valor_double = Double.parseDouble(data);
        quantidade_double = Double.parseDouble(data2);

        if (checkBoxTaxa.isChecked()) {
            Button buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
            buttonCalcular.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    double gorjeta = valor_double * 10/100;
                    valor_double =+ gorjeta + valor_double;
                    double res = valor_double / quantidade_double;
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Resultado");
                    dialogo.setMessage("O valor para cada pessoa será de: " + res);
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }
            });
        } else

        {
            Button buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
            buttonCalcular.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    double num1 = Double.parseDouble(editValor.getText().toString());
                    double num2 = Double.parseDouble(editQuantidadePessoas.getText().toString());
                    double res = num1 / num2;
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Resultado");
                    dialogo.setMessage("O valor para cada pessoa será de: " + res);
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }
            });
        }
    }
}