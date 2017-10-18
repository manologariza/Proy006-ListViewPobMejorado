package com.example.dell.proy006_listviewpobmejorado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList <Datos> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos=(ListView)findViewById(R.id.lstDatos);
        lista=new ArrayList<>();


        lista.add(new Datos(1, "Madrid", "3165541", "Madrid, el motor de España", R.drawable.madrid, R.drawable.madridmapa));
        lista.add(new Datos(2, "Mostoles", "3165541", "Madrid, el motor de España", R.drawable.mostoles, R.drawable.mostolesmapa));
        lista.add(new Datos(3, "Alcalá de Henares", "3165541", "Madrid, el motor de España", R.drawable.alcala, R.drawable.alcalamapa));
        lista.add(new Datos(4, "Fuenlabrada", "3165541", "Madrid, el motor de España", R.drawable.fuenlabrada, R.drawable.fuenlabradamapa));
        lista.add(new Datos(5, "Leganés", "3165541", "Madrid, el motor de España", R.drawable.leganes, R.drawable.leganesmapa));
        lista.add(new Datos(6, "Getafe", "3165541", "Madrid, el motor de España", R.drawable.getafe, R.drawable.getafemapa));
        lista.add(new Datos(7, "Alcorcón", "3165541", "Madrid, el motor de España", R.drawable.alcorcon, R.drawable.alcorconmapa));
        lista.add(new Datos(8, "Torrejón de Ardoz", "3165541", "Madrid, el motor de España", R.drawable.torrejon, R.drawable.torrejonmapa));
        lista.add(new Datos(9, "Parla", "3165541", "Madrid, el motor de España", R.drawable.parla, R.drawable.parlamapa));
        lista.add(new Datos(10, "Coslada", "3165541", "Madrid, el motor de España", R.drawable.coslada, R.drawable.cosladamapa));
        lista.add(new Datos(11, "Alcobendas", "3165541", "Madrid, el motor de España", R.drawable.alcobendas, R.drawable.alcobendasmapa));
        lista.add(new Datos(12, "San Sebastián de los Reyes", "3165541", "Madrid, el motor de España", R.drawable.sansebastiandelosreyes, R.drawable.sansebastiandelosreyesmapa));
        lista.add(new Datos(13, "Pozuelo de Alarcón", "3165541", "Madrid, el motor de España", R.drawable.pozuelo, R.drawable.pozuelomapa));
        lista.add(new Datos(14, "Las Rozas", "3165541", "Madrid, el motor de España", R.drawable.lasrozas, R.drawable.lasrozasmapa));
        lista.add(new Datos(15, "Rivas-Vaciamadrid", "3165541", "Madrid, el motor de España", R.drawable.rivas, R.drawable.rivasmapa));
        lista.add(new Datos(16, "Valdemoro", "3165541", "Madrid, el motor de España", R.drawable.valdemoro, R.drawable.valdemoromapa));
        lista.add(new Datos(17, "Majadahonda", "3165541", "Madrid, el motor de España", R.drawable.majadahonda, R.drawable.majadahondamapa));
        lista.add(new Datos(18, "Collado Villaba", "3165541", "Madrid, el motor de España", R.drawable.villalba, R.drawable.villalbamapa));
        lista.add(new Datos(19, "Aranjuez", "3165541", "Madrid, el motor de España", R.drawable.aranjuez, R.drawable.aranjuezmapa));
        lista.add(new Datos(20, "Arganda del Rey", "3165541", "Madrid, el motor de España", R.drawable.arganda, R.drawable.argandamapa));


        Adaptador miAdaptador=new Adaptador(getApplicationContext(), lista);

        listaDatos.setAdapter(miAdaptador);


        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Datos obj = (Datos) adapterView.getItemAtPosition(i);

                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", obj);
                startActivity(paso);
            }
        });


    }
}
