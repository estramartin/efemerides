package com.evita.efemerides;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.evita.efemerides.clases.ListaPreguntas;
import com.evita.efemerides.clases.Pregunta;
import com.evita.efemerides.clases.Respuesta;

import java.util.ArrayList;
import java.util.List;

public class VeteranosMalvinas extends AppCompatActivity {

    private ListaPreguntas listaPreguntas = new ListaPreguntas();

    int contadorPreguntas =0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btnVolver;
    private TextView txtpregunta;
    private ImageView imgView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veteranos_malvinas);

        txtpregunta = (TextView) findViewById(R.id.textView2);
        btn1 = (Button) findViewById(R.id.button8);
        btn2 = (Button) findViewById(R.id.button9);
        btn3 = (Button) findViewById(R.id.button10);
        btn4 = (Button) findViewById(R.id.button11);
        imgView1 = (ImageView) findViewById(R.id.imgRpta);
        btnVolver = (Button) findViewById(R.id.btnVolver2);

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btnVolver.setVisibility(View.INVISIBLE);

        txtpregunta.setText(listaPreguntas.getPregunta(0).getPregunta());
        btn1.setText(listaPreguntas.getRespuesta(0,0).getRespuesta());
        btn2.setText(listaPreguntas.getRespuesta(0,1).getRespuesta());
        btn3.setText(listaPreguntas.getRespuesta(0,2).getRespuesta());
        btn4.setText(listaPreguntas.getRespuesta(0,3).getRespuesta());


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 0);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 1);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 2);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 3);

            }
        });
    }

    public void Volver(View view){
        Intent menu = new Intent(this, MenuJuegos.class);
        startActivity(menu);
    }


    public int CorrectaIncorrecta(Boolean verdadero){
        int idCorrecta = getResources().getIdentifier("rptacorrecta","drawable", getPackageName());
        int idIncorrecta = getResources().getIdentifier("rtaincorrecta","drawable", getPackageName());
        if(verdadero){
            return idCorrecta;
        }
        else{
            return idIncorrecta;
        }
    }

    public void cargarPreguntas(View view, int numero ){

        if(contadorPreguntas == listaPreguntas.getListaPreguntas().size()) {
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btnVolver.setVisibility(View.VISIBLE);
            btnVolver.setEnabled(true);
            txtpregunta.setText("¡¡LAS MALVINAS FUERON, SON \n Y SEGUIRAN SIENDO SIEMPRE ARGENTINAS");
            contadorPreguntas = 0;
        }

        else {
            for (Pregunta pregunta : listaPreguntas.getListaPreguntas()) {

                if (pregunta.getId().equals(contadorPreguntas+1)) {

                    int correctaIncorrecta = CorrectaIncorrecta(pregunta.getRespuesta(numero).getCorrecta());
                    imgView1.setImageResource(correctaIncorrecta);
                    if (pregunta.getRespuesta(numero).getCorrecta().equals(true)) {
                        Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "La respuesta correcta era: " + listaPreguntas.getPregunta(contadorPreguntas).RespuestaCorrecta(), Toast.LENGTH_LONG).show();
                    }
                }
            }
            contadorPreguntas++;
            btn1.setText(listaPreguntas.getPregunta(contadorPreguntas).getRespuesta(0).getRespuesta());
            btn2.setText(listaPreguntas.getPregunta(contadorPreguntas).getRespuesta(1).getRespuesta());
            btn3.setText(listaPreguntas.getPregunta(contadorPreguntas).getRespuesta(2).getRespuesta());
            btn4.setText(listaPreguntas.getPregunta(contadorPreguntas).getRespuesta(3).getRespuesta());
            txtpregunta.setText(listaPreguntas.getPregunta(contadorPreguntas).getPregunta());
        }



    }
}