package com.evita.efemerides;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DiaMemoria extends AppCompatActivity {
    String [] preguntas = new String []{"Cuando pasó tal cosa?", "Cuando pasó tal otra?", "Y esta otra?"};
    String [][] respuestas = new String[10][5];
    int contadorPreguntas =0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private TextView txtpregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_memoria);



        respuestas[0][0] = "1950";
        respuestas[0][1] = "1951";
        respuestas[0][2] = "1952";
        respuestas[0][3] = "1953";
        respuestas[1][0] = "1954";
        respuestas[1][1] = "1955";
        respuestas[1][2] = "1956";
        respuestas[1][3] = "1957";
        respuestas[2][0] = "1958";
        respuestas[2][1] = "1959";
        respuestas[2][2] = "1960";
        respuestas[2][3] = "1961";
        respuestas[3][0] = "1962";
        respuestas[3][1] = "1963";
        respuestas[3][2] = "1964";
        respuestas[3][3] = "1965";

        txtpregunta = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button3);
        btn3 = (Button) findViewById(R.id.button4);
        btn4 = (Button) findViewById(R.id.button5);

        txtpregunta.setText(preguntas[0]);
        btn1.setText(respuestas[0][0]);
        btn2.setText(respuestas[0][1]);
        btn3.setText(respuestas[0][2]);
        btn4.setText(respuestas[0][3]);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 1);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 3);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargarPreguntas(view, 4);

            }
        });


    }






    public void cargarPreguntas(View view, int numero){


        switch (contadorPreguntas){
           case 0:{
               if(numero == 1){
                   btn1.setBackgroundColor(1);

               }
               if(numero == 2){
                   btn1.setBackgroundColor(2);
               }
               if(numero == 3){
                   btn1.setBackgroundColor(3);
               }
               if(numero == 4){
                   btn1.setBackgroundColor(4);
               }
               btn1.setText(respuestas[1][0]);
               btn2.setText(respuestas[1][1]);
               btn3.setText(respuestas[1][2]);
               btn4.setText(respuestas[1][3]);
               txtpregunta.setText(preguntas[1]);
               contadorPreguntas++;
               break;
               }
            case 1:{
                btn1.setText(respuestas[2][0]);
                btn2.setText(respuestas[2][1]);
                btn3.setText(respuestas[2][2]);
                btn4.setText(respuestas[2][3]);
                txtpregunta.setText(preguntas[2]);
                contadorPreguntas++;
                break;
            }
            case 2:{
                btn1.setText(respuestas[3][0]);
                btn2.setText(respuestas[3][1]);
                btn3.setText(respuestas[3][2]);
                btn4.setText(respuestas[3][3]);
                txtpregunta.setText(preguntas[3]);
                contadorPreguntas++;
                break;
            }
            case 3:{
                btn1.setText(respuestas[4][0]);
                btn2.setText(respuestas[4][1]);
                btn3.setText(respuestas[4][2]);
                btn4.setText(respuestas[4][3]);
                txtpregunta.setText(preguntas[4]);
                contadorPreguntas++;
                break;
            }
        }
        }

}
