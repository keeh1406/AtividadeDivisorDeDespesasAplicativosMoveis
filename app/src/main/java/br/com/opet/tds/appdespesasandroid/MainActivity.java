package br.com.opet.tds.appdespesasandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends Activity {

    private EditText editNome;
    private EditText editTotal;
    private TextView textQtde;
    private TextView textDivisao;
    private SeekBar seekQtde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editLocal);
        editTotal = findViewById(R.id.editValorDespesa);
        textQtde = findViewById(R.id.textQtde);
        textDivisao = findViewById(R.id.textDivisao);
        seekQtde = findViewById(R.id.seekQtdePessoas);

        if(ListaDespesas.getList() == null)
            ListaDespesas.setList(new ArrayList<Despesa>());

        seekQtde.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textQtde.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(View v){
        String nome = editNome.getText().toString();
        double valor_total = Double.parseDouble(editTotal.getText().toString());
        double qtde_pessoas = Double.parseDouble(textQtde.getText().toString());
        double divisao = valor_total / qtde_pessoas;
        DecimalFormat df = new DecimalFormat("#.00");

        textDivisao.setText("Total da divisão: " + " " + df.format(divisao));

        ListaDespesas.getList().add(new Despesa(nome,valor_total,qtde_pessoas,divisao));
        Toast.makeText(this, "Adicionado na lista de despesas!", Toast.LENGTH_SHORT).show();
    }

    public void listar(View v){
        Intent novaIntent = new Intent(MainActivity.this,ListaActivity.class);
        startActivity(novaIntent);
    }
}
