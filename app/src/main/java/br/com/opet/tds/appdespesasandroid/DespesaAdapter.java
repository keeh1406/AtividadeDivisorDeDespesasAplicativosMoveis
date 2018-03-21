package br.com.opet.tds.appdespesasandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Diego on 21/03/2018.
 */

public class DespesaAdapter extends ArrayAdapter {

    private List<Despesa> despesas;
    private int resourceID;

    public DespesaAdapter(Context context, int resource, List<Despesa> objects) {
        super(context, resource, objects);
        this.despesas = objects;
        this.resourceID = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View mView = convertView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(resourceID,null);
        }

        Despesa despesa = despesas.get(position);

        TextView textLocal = mView.findViewById(R.id.textNomeList);
        TextView textQtde = mView.findViewById(R.id.textQtdePessoasList);
        TextView textTotal = mView.findViewById(R.id.textTotalDespesaList);
        TextView textDivisao = mView.findViewById(R.id.textDivisaoList);

        textLocal.setText(despesa.getNome());
        textQtde.setText(String.valueOf(despesa.getQtde_pessoas()));
        textTotal.setText(String.valueOf(despesa.getValor_total()));
        textDivisao.setText(String.valueOf(despesa.getDivisao_despesa()));

        return mView;
    }
}
