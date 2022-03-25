package com.evita.efemerides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalir = (Button) findViewById(R.id.button2);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });


     /*   DbHelper dbHelper = new DbHelper(MainActivity.this);
        SQLiteDatabase db  = dbHelper.getWritableDatabase();
        if(db != null){
            Toast.makeText(this, "Base de datos creada", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Internal Server Error", Toast.LENGTH_LONG).show();
        }

      */

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

    /*public void Salir(View view){
        finishAffinity();
    }*/
}