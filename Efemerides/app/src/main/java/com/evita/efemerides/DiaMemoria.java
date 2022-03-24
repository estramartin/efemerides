package com.evita.efemerides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DiaMemoria extends AppCompatActivity {
    String [] preguntas = new String []{
            "El Día Nacional de la Memoria por la Verdad y la Justicia es el día en el que se conmemora en Argentina a...",
            "¿Qué nombre le dieron los militares a la dictadura instaurada el 24 de marzo de 1976?",
            "¿Quiénes eran los tres integrantes de la Junta militar que tomó el gobierno tras el golpe?",
            "¿Cuánto duró el llamado \"Proceso de Reorganización Nacional\"?",
            "¿El gobierno de quién fue derrocado?",
            "¿Qué sucedió con la presidente constitucional depuesta, María Estela Martínez de Perón?",
            "¿Cuántos presidentes de facto hubo durante el Proceso (1976 - 1983)?",
    };
    String [][] respuestas = new String[11][6];
    int contadorPreguntas =0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btnVolver;
    private TextView txtpregunta;
    private ImageView imgView1;
    private ImageView imgView2;
    private ImageView imgView3;
    private ImageView imgView4;
    private ImageView imgView5;
    private ImageView imgView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_memoria);



        respuestas[0][0] = "la Independencia";
        respuestas[0][1] = "la Bandera";
        respuestas[0][2] = "las víctimas de la última dictadura militar";
        respuestas[0][3] = "los veteranos de Malvinas";
        respuestas[1][0] = "Proceso Patriótico Nacional de Reorganización";
        respuestas[1][1] = "Proceso Patriótico de Reorganización Nacional";
        respuestas[1][2] = "Proceso Nacional de Reorganización";
        respuestas[1][3] = "Proceso de Reorganización Nacional";
        respuestas[2][0] = "Jorge Videla, Emilio Massera y Omar Gaffigna";
        respuestas[2][1] = "Jorge Videla, Emilio Massera y Orlando Agosti";
        respuestas[2][2] = "Jorge Videla, Armando Lambruschini y Basilio Lami Dozo";
        respuestas[2][3] = "Jorge Videla, Armando Lambruschini y Orlando Agosti";
        respuestas[3][0] = "Más de 7 años";
        respuestas[3][1] = "15 años";
        respuestas[3][2] = "Menos de 3 años";
        respuestas[3][3] = "2 años";
        respuestas[4][0] = "María Estela (Isabel) Martínez de Perón";
        respuestas[4][1] = "Héctor José Cámpora";
        respuestas[4][2] = "Juan Domingo Perón";
        respuestas[4][3] = "Ricardo Balbín";
        respuestas[5][0] = "Estuvo detenida un año y luego fue expulsada a España";
        respuestas[5][1] = "Fue inmediamente expulsada a España";
        respuestas[5][2] = "Estuvo cinco años presa y luego fue expulsada España";
        respuestas[5][3] = "Estuvo detendia tres años y luego fue expulsada a España";
        respuestas[6][0] = "Tres";
        respuestas[6][1] = "Cuatro";
        respuestas[6][2] = "Dos";
        respuestas[6][3] = "Cinco";

        txtpregunta = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button3);
        btn3 = (Button) findViewById(R.id.button4);
        btn4 = (Button) findViewById(R.id.button5);

        btnVolver = (Button) findViewById(R.id.btnVolver);

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);

        txtpregunta.setText(preguntas[0]);
        btn1.setText(respuestas[0][0]);
        btn2.setText(respuestas[0][1]);
        btn3.setText(respuestas[0][2]);
        btn4.setText(respuestas[0][3]);

        imgView1 = (ImageView) findViewById(R.id.imgRpta1);
        imgView2 = (ImageView) findViewById(R.id.imgRpta2);
        imgView3 = (ImageView) findViewById(R.id.imgRpta3);
        imgView4 = (ImageView) findViewById(R.id.imgRpta4);
        imgView5 = (ImageView) findViewById(R.id.imgRpta5);
        imgView6 = (ImageView) findViewById(R.id.imgRpta6);

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

    public void Volver(View view){
        Intent Principal = new Intent(this, com.evita.efemerides.MainActivity.class);
        startActivity(Principal);
    }



    public void cargarPreguntas(View view, int numero){
        int idCorrecta = getResources().getIdentifier("rptacorrecta","drawable", getPackageName());
        int idIncorrecta = getResources().getIdentifier("rtaincorrecta","drawable", getPackageName());

        switch (contadorPreguntas){
           case 0:{
               if(numero == 1){ imgView1.setBackgroundColor(1);
                   Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                   imgView1.setImageResource (idIncorrecta);
               }
               if(numero == 2){ imgView1.setBackgroundColor(2);
                   Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                   imgView1.setImageResource (idIncorrecta);
               }
               if(numero == 3){
                   Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                   imgView1.setImageResource (idCorrecta);   }
               if(numero == 4){ imgView1.setBackgroundColor(2);
                   Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                   imgView1.setImageResource (idIncorrecta);
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
                if(numero == 1){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 2){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 3){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                    }
                if(numero == 4){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idCorrecta);
                }
                btn1.setText(respuestas[2][0]);
                btn2.setText(respuestas[2][1]);
                btn3.setText(respuestas[2][2]);
                btn4.setText(respuestas[2][3]);
                txtpregunta.setText(preguntas[2]);
                contadorPreguntas++;
                break;
            }
            case 2:{
                if(numero == 1){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 2){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 3){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 4){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idCorrecta);
                }
                btn1.setText(respuestas[3][0]);
                btn2.setText(respuestas[3][1]);
                btn3.setText(respuestas[3][2]);
                btn4.setText(respuestas[3][3]);
                txtpregunta.setText(preguntas[3]);
                contadorPreguntas++;
                break;
            }
            case 3:{
                if(numero == 1){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idCorrecta);
                }
                if(numero == 2){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 3){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 4){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                btn1.setText(respuestas[4][0]);
                btn2.setText(respuestas[4][1]);
                btn3.setText(respuestas[4][2]);
                btn4.setText(respuestas[4][3]);
                txtpregunta.setText(preguntas[4]);
                contadorPreguntas++;
                break;
            }
            case 4:{
                if(numero == 1){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idCorrecta);
                }
                if(numero == 2){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 3){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                if(numero == 4){
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                }
                btn1.setText(respuestas[5][0]);
                btn2.setText(respuestas[5][1]);
                btn3.setText(respuestas[5][2]);
                btn4.setText(respuestas[5][3]);
                txtpregunta.setText(preguntas[5]);
                contadorPreguntas++;
                break;
            }
            case 5:{
                if(numero == 1){ imgView6.setBackgroundColor(1);}
                if(numero == 2){ imgView6.setBackgroundColor(2);}
                if(numero == 3){ imgView6.setBackgroundColor(2);}
                if(numero == 4){ imgView6.setBackgroundColor(2);}
                btn1.setText(respuestas[6][0]);
                btn2.setText(respuestas[6][1]);
                btn3.setText(respuestas[6][2]);
                btn4.setText(respuestas[6][3]);
                txtpregunta.setText(preguntas[6]);
                contadorPreguntas++;
                break;
            }
            case 6: {
                if (numero == 1) {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idIncorrecta);
                }
                if (numero == 2) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 3) {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idIncorrecta);
                }
                if (numero == 4) {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idIncorrecta);
                }
                btn1.setText(respuestas[7][0]);
                btn2.setText(respuestas[7][1]);
                btn3.setText(respuestas[7][2]);
                btn4.setText(respuestas[7][3]);
                contadorPreguntas++;
                break;
            }




        }

        if(contadorPreguntas == 7) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btnVolver.setEnabled(true);
            txtpregunta.setText("Respondiste las " + contadorPreguntas + " preguntas");
            contadorPreguntas = 0;
        }
        }

}
