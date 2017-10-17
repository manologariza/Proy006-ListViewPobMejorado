package com.example.dell.proy006_listviewpobmejorado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    ImageView ivEscudo;
    TextView tvNombre;
    TextView tvPoblacion;
    TextView tvLema;
    ImageView ivMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ivEscudo=(ImageView)findViewById(R.id.ivEscudo);
        tvNombre=(TextView)findViewById(R.id.tvNombre);
        tvPoblacion=(TextView)findViewById(R.id.tvPoblacion);
        tvLema=(TextView)findViewById(R.id.tvLema);
        ivMapa=(ImageView)findViewById(R.id.ivMapa);

        Datos obj=(Datos)getIntent().getExtras().getSerializable("objeto");
        ivEscudo.setImageResource(obj.getEscudo());
        tvNombre.setText(obj.getNombre());
        tvPoblacion.setText(obj.getPoblacion());
        tvLema.setText(obj.getLema());
        ivMapa.setImageResource(obj.getMapa());
    }
}
