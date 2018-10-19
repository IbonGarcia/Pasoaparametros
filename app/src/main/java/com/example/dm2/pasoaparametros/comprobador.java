package com.example.dm2.pasoaparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class comprobador extends AppCompatActivity {

    private TextView etiqueta;
    private boolean resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprobador);
        this.setTitle(R.string.comp_titulo);
        int n1=Integer.parseInt(getIntent().getExtras().getString("n1"));
        int n2=Integer.parseInt(getIntent().getExtras().getString("n2"));
        int res=Integer.parseInt(getIntent().getExtras().getString("result"));
        int correcto=n1+n2;
        etiqueta=(TextView) findViewById(R.id.etiqueta1);

        if (res  ==correcto){
            etiqueta.setText("El resultado de la operacion es CORRECTO");
            resultado=true;

        }
        else{
            etiqueta.setText("El resultado de la operacion es INCORRECTO");
            resultado=false;
        }
    }
    public void Volver(View view){

        Intent intento= new Intent();
        intento.putExtra("result",resultado);
        setResult( RESULT_OK , intento );
        finish();
    }
}
