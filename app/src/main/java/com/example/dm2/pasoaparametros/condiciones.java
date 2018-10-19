package com.example.dm2.pasoaparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class condiciones extends AppCompatActivity {


    TextView tv;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condiciones);
        this.setTitle(R.string.aceptar_condiciones);
        tv=(TextView)findViewById(R.id.textViewCondiciones);
        Bundle datos=this.getIntent().getBundleExtra("datos");
        String nombre=datos.getString("Nombre");
        nombre=nombre.toUpperCase();
        String ape=datos.getString("Apellido");
        ape=ape.toUpperCase();
        tv.setText("Hola "+nombre+ape+" ¿Aceptas las condiciones?");

    }

    public void condiciones(View view){
        String contenido="";
        if (view.getId()==R.id.botonaceptar){
            contenido ="ACEPTADO";
        }
        else{
            contenido="RECHAZADO";
        }

        Intent intento = new Intent();
        intento.putExtra("in1",contenido);
        setResult(RESULT_OK,intento);

        finish();
    }

}
