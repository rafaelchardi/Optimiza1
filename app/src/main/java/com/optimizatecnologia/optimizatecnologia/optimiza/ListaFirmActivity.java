package com.optimizatecnologia.optimizatecnologia.optimiza;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;


public class ListaFirmActivity extends ActionBarActivity   implements AdapterView.OnItemClickListener {

    ListaFirmFragment listafirmfragment;
    DetalleFirmFragment detallefirmfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_firm);

        FragmentManager fragmentManager = getFragmentManager();

        listafirmfragment = (ListaFirmFragment) fragmentManager
                .findFragmentById(R.id.listafirmfragment1);

        detallefirmfragment = (DetalleFirmFragment) fragmentManager
                .findFragmentById(R.id.detallefirmfragment1);



    }

    @Override
    protected void onResume() {
        super.onResume();
        //Definir el listener para el onclick sobre la lista
        listafirmfragment.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Firm item = (Firm) parent.getItemAtPosition(position);

        if (detallefirmfragment != null){
            //Estamos en un tablet
            detallefirmfragment.actualizarDetalle(item);
        } else {
            //Estasmos en un smartphone
            Intent intent = new Intent(this, DetalleFirmActivity.class);
            intent.putExtra(DetalleFirmActivity.KEY_FIRM_ITEM, item);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista_firm, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
