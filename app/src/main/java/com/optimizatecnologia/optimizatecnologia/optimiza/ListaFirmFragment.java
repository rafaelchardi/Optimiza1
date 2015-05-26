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
import java.util.LinkedList;
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

        List<Firm> list = new LinkedList<>();
        list.add(new Firm("0001", "24344043S","Rafael Chardi Torretn","605125444"));
        list.add(new Firm("0003", "3334043S","33Rafael Chardi Torretn","333125444"));
        list.add(new Firm("0002", "222243S", "222Rafael Chardi Torretn", "22205125444"));
        list.add(new Firm("0004"));
        list.add(new Firm("0006"));
        list.add(new Firm("0001", "24344043S","Rafael Chardi Torretn","605125444"));
        list.add(new Firm("0003", "3334043S","33Rafael Chardi Torretn","333125444"));
        list.add(new Firm("0002", "222243S","222Rafael Chardi Torretn","22205125444"));
        list.add(new Firm("0001", "24344043S","Rafael Chardi Torretn","605125444"));
        list.add(new Firm("0003", "3334043S","33Rafael Chardi Torretn","333125444"));
        list.add(new Firm("0002", "222243S","222Rafael Chardi Torretn","22205125444"));

        listado = (ListView) getActivity().findViewById(R.id.listViewClientes);


        //ListAdapter adaptador = new ArrayAdapter<Firm>(
//                getActivity(),android.R.layout.simple_list_item_1,list);

        FirmAdapter adaptador = new FirmAdapter(getActivity(),R.layout.firm_item,list);

        listado.setAdapter(adaptador);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener){
        listado.setOnItemClickListener(listener);
    }

}
