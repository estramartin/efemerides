package com.evita.efemerides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Comienzo parte logica


    /*public void Jugar(View view){
        Intent ListaJuegos = new Intent(this, com.evita.efemerides.JuegosActivity.class);
        startActivity(ListaJuegos);

    }*/
    public void Jugar(View view){
        Intent Juego = new Intent(this, com.evita.efemerides.DiaMemoria.class);
        startActivity(Juego);
    }


}