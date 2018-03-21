package br.com.opet.tds.appdespesasandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaActivity extends Activity {

    private ListView listaDespesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listaDespesa = findViewById(R.id.listViewDespesas);

        ArrayAdapter<Despesa> adapter = new DespesaAdapter(this,R.layout.list_item,ListaDespesas.getList());
        listaDespesa.setAdapter(adapter);
    }
}
