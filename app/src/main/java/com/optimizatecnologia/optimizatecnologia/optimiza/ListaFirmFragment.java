package com.optimizatecnologia.optimizatecnologia.optimiza;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFirmFragment extends Fragment {


    public ListaFirmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_firm, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<Firm> list = Arrays.asList(
                new Firm("0001"),
                new Firm("0002"),
                new Firm("0003")
        );

        ListView listado = (ListView) getActivity().findViewById(R.id.listViewClientes);

        ListAdapter adaptadorCorreos = new ArrayAdapter<Firm>(
                getActivity(),android.R.layout.simple_list_item_1,list);

        listado.setAdapter(adaptadorCorreos);
    }

}
