package com.optimizatecnologia.optimizatecnologia.optimiza;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFirmFragment extends Fragment {

    private ListView listado;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_lista_firm, container);
        return view;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<Firm> list = Arrays.asList(
                new Firm("0001"),
                new Firm("0002"),
                new Firm("0003")
        );

        listado = (ListView) getActivity().findViewById(R.id.listViewClientes);

        ListAdapter adaptadorCorreos = new ArrayAdapter<Firm>(
                getActivity(),android.R.layout.simple_list_item_1,list);

        listado.setAdapter(adaptadorCorreos);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener){
        listado.setOnItemClickListener(listener);
    }

}
