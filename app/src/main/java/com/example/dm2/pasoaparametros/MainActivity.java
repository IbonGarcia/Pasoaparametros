package com.example.dm2.pasoaparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick1(View view){
        Intent intento1= new Intent(this,Actividad1.class);
        startActivity(intento1);
    }
    public void onClick2(View view){
        Intent intento2= new Intent(this,Actividad2.class);
        startActivity(intento2);
    }
    public void salir(View view){
        finish();
    }
}
