package br.com.opet.tds.appdespesasandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 21/03/2018.
 */

public class ListaDespesas {
    private static List<Despesa> despesas;

    public static List<Despesa> getList(){
        return despesas;
    }

    public static void setList(List<Despesa> list){
        despesas = list;
    }
}
