package com.example.dm2.pasoaparametros;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private EditText edinombre;
    private EditText ediape;
    private TextView condiciones;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        this.setTitle(R.string.act1_titulo);
        edinombre=(EditText)findViewById(R.id.editText1);
        ediape=(EditText)findViewById(R.id.editText2);
        condiciones=(TextView)findViewById(R.id.condiciones);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if ((requestCode==365)&&(resultCode==RESULT_OK)){

            String str=data.getExtras().getString("in1");
            condiciones.setText("Aceptar condiiones: "+str);


        }

    }

    public void clickVerificar(View view){
        Bundle nombre = new Bundle();
        nombre.putString("Nombre",edinombre.getText().toString()+" ");
        nombre.putString("Apellido",ediape.getText().toString());
        Intent intento = new Intent(this,condiciones.class);
        intento.putExtra("datos",nombre);
        startActivityForResult(intento,365);

    }

    public void atras(View view){

        finish();
    }
}
