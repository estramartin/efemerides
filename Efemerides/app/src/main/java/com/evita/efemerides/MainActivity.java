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

    public void Jugar(View view){
        Intent DiaMemoria = new Intent(this, com.evita.efemerides.DiaMemoria.class);
        startActivity(DiaMemoria);


    }


}