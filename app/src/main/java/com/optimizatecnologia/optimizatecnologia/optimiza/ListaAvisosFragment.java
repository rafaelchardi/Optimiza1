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
public class ListaAvisosFragment extends Fragment {


    public ListaAvisosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_avisos, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<Ords> list = Arrays.asList(
                new Ords(1),
                new Ords(2),
                new Ords(3)
        );

        ListView listado = (ListView) getActivity().findViewById(R.id.listViewAvisos);

        ListAdapter adaptadorCorreos = new ArrayAdapter<Ords>(
                getActivity(),android.R.layout.simple_list_item_1,list);

        listado.setAdapter(adaptadorCorreos);
    }
}
