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
public class ListaLocaFragment extends Fragment {


    public ListaLocaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_loca, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List <Loca> list = Arrays.asList(
                new Loca("lo1","Fimr"),
                new Loca("lo2","Fimr"),
                new Loca("lo3","Fimr")
        );

        ListView listado = (ListView) getActivity().findViewById(R.id.listViewLoca);

        ListAdapter adaptadorCorreos = new ArrayAdapter<Loca>(
                getActivity(),android.R.layout.simple_list_item_1,list);

        listado.setAdapter(adaptadorCorreos);
    }


}
