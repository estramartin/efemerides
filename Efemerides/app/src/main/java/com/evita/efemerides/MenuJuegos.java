package com.evita.efemerides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuJuegos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juegos);
    }

    public void Memoria(View view){
        Intent DiaMemoria = new Intent(this, com.evita.efemerides.DiaMemoria.class);
        startActivity(DiaMemoria);
    }


    public void Malvinas(View view){
        Intent veteranos = new Intent(this, VeteranosMalvinas.class);
        startActivity(veteranos);
    }
}