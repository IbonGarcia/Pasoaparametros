package com.example.dm2.pasoaparametros;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad2 extends AppCompatActivity {

    private int n1;
    private int n2;
    private EditText num1;
    private EditText num2;
    private EditText resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        this.setTitle(R.string.act2_titulo);
        num1=(EditText)findViewById(R.id.num1);
        //NUMERO ALEATORIO PARA NUM1, CASTEAMOS A INT PARA QUE NO SALGAN DECIMALES
        num1.setText((int) Math.floor(Math.random()*100+1)+"");
        num2=(EditText)findViewById(R.id.num2);
        //NUMERO ALEATORIO PARA NUM2, CASTEAMOS A INT PARA QUE NO SALGAN DECIMALES
        num2.setText((int) Math.floor(Math.random()*100+1)+"");
        resultado=(EditText)findViewById(R.id.result);
        n1=0;
        n2=0;
    }

    public void  comprobar (View view){

        Intent intento= new Intent(this,comprobador.class);
        intento.putExtra("n1",num1.getText().toString());
        intento.putExtra("n2",num2.getText().toString());
        intento.putExtra("result",resultado.getText().toString());
        startActivityForResult(intento,708);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if ((requestCode==708)&&(resultCode==RESULT_OK)){

         boolean bol=data.getExtras().getBoolean("result");
             if (bol){
                 n1++;
                findViewById(R.id.correctas)
             }
             else{
                 n2++;
             }
        }
    }
}
