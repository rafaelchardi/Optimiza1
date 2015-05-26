package com.curso.androidm.viewadapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView tareasLV = (ListView)findViewById(R.id.tareasListView);

        /*String[] datos = new String[] {"Correr", "Nadar", "Andar en Bici"};
        ListAdapter adaptador = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                datos);*/


        List<Tarea> datos = new LinkedList<>();

        datos.add(new Tarea("Correr", "Correr sin parar durante 10Km"));
        datos.add(new Tarea("Nadar", "Nadar en la piscina 50 vueltas"));
        datos.add(new Tarea("Andar en Bicicleta", "Robar la primera bici que pilles y correr sin que te cojan"));

        TareasAdapter adaptador = new TareasAdapter(this,R.layout.tareas_list_item,datos);

        tareasLV.setAdapter(adaptador);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
