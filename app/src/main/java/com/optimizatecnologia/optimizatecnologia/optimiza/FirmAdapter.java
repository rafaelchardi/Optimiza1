package com.optimizatecnologia.optimizatecnologia.optimiza;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Usuario on 26/05/2015.
 */
public class FirmAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Firm> collecion;

    public List<Firm> getCollecion(String user, String password) {
        return collecion;
    }

    public FirmAdapter(Context context, int layout, List<Firm> collecion) {
        this.context = context;
        this.layout = layout;
        this.collecion = collecion;
    }

    @Override
    public int getCount() {
        return collecion.size();
    }

    @Override
    public Object getItem(int position) {
        return collecion.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout, null);
        }

        final Firm item = (Firm)getItem(position);

        TextView txNombre = (TextView) convertView.findViewById(R.id.firmcode);
        TextView txDescripcion = (TextView) convertView.findViewById(R.id.txfirmnamecome);
        TextView txfirmTel1 = (TextView) convertView.findViewById(R.id.firmTel1);
       /* Button button = (Button) convertView.findViewById(R.id.button);

       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        TareasAdapter.this.context,
                        "El item pulsado es: " + item.getNombre(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });*/

        txNombre.setText(item.getFirmcode());
        txDescripcion.setText(item.getFirmnamecome());
        txfirmTel1.setText(item.getFirmTel1());
        return convertView;
    }
}


