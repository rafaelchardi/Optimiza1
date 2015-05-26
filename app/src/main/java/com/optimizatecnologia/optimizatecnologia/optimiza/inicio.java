package com.optimizatecnologia.optimizatecnologia.optimiza;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class inicio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button clientes = (Button) findViewById(R.id.clientes);
        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcionPulsada(R.id.action_clientes);
            }
        });

        Button locales = (Button) findViewById(R.id.locales);
        locales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcionPulsada( R.id.action_locales);
            }
        });

        Button avisos = (Button) findViewById(R.id.avisos);
        avisos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcionPulsada( R.id.action_avisos);
            }
        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (opcionPulsada(id)) return true;

        return super.onOptionsItemSelected(item);
    }

    private boolean opcionPulsada(int opcionMenu) {
        //noinspection SimplifiableIfStatement
        if (opcionMenu == R.id.action_avisos) {
            Intent intent = new Intent(this, ListaAvisosActivity.class);
            //startActivity(intent); //Abrir actividad sin esperar respuesta
            startActivityForResult(intent, 1);
            return true;
        }
        if (opcionMenu == R.id.action_clientes) {
            Intent intent = new Intent(this, ListaFirmActivity.class);
            //startActivity(intent); //Abrir actividad sin esperar respuesta
            startActivityForResult(intent, 2);
            return true;
        }
        if (opcionMenu == R.id.action_locales) {
            Intent intent = new Intent(this, ListaLocaActivity.class);
            //startActivity(intent); //Abrir actividad sin esperar respuesta
            startActivityForResult(intent, 2);
            return true;
        }

        return false;
    }
}
