package com.optimizatecnologia.optimizatecnologia.optimiza;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetalleFirmFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetalleFirmFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetalleFirmFragment extends Fragment {

    public DetalleFirmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lista_avisos, container, false);
        return inflater.inflate(R.layout.fragment_detalle_firm, container, false);


    }

    public void actualizarDetalle(Firm item) {

        EditText editTextFirmCode = (EditText) getActivity().findViewById(R.id.editTextFirmCode);
        EditText editTextFirmName = (EditText) getActivity().findViewById(R.id.editTextFirmName);



        editTextFirmCode.setText(item.getFirmcode());
        editTextFirmName.setText(item.getFirmnamecome());

    }


}
