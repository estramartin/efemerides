package com.evita.efemerides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VeteranosMalvinas extends AppCompatActivity {

    int contadorPreguntas =0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btnVolver;
    private TextView txtpregunta;
    private ImageView imgView1;

    String [][] respuestas = new String[24][18];
    String [] preguntas = new String []{
            "El Día Nacional de la Memoria por la Verdad y la Justicia es el día en el que se conmemora en Argentina a...",
            "¿Qué nombre le dieron los militares a la dictadura instaurada el 24 de marzo de 1976?",
            "¿Quiénes eran los tres integrantes de la Juntam Militar que tomó el gobierno tras el golpe?",
            "¿Cuánto duró el llamado \"Proceso de Reorganización Nacional\"?",
            "¿El gobierno de quién fue derrocado?",
            "¿Qué sucedió con la presidente constitucional depuesta, María Estela Martínez de Perón?",
            "¿Cuántos presidentes de facto hubo durante el Proceso (1976 - 1983)?",
            "¿Cuánto faltaba para las siguientes elecciones presidenciales cuando se produjo el golpe?",
            "¿Qué resistencia opusieron al golpe los partidos políticos con representación parlamentaria?",
            "¿Cuál de estas frases fue dicha por Videla?",
            "¿Qué país apoyó activamente a la dictadura argentina votando siempre en contra de que la ONU enviase una comisión a investigar la violación a los derechos humanos?",
            "¿Cuál fue la causa de la tensión entre el gobierno de los Estados Unidos durante la gestión de James Carter y la Junta Militar argentina?",
            "¿Qué escritor denunció en 1977 la metodología de secuestro, \"tortura sin límite en el tiempo ni en el método\" y asesinato, que estaba aplicando la dictadura?",
            "¿Cómo se llamaba el primer Ministro de Economía del Proceso?",
            "¿Cuándo empezaron a reunirse las Madres de Plaza de Mayo?",
            "¿Por qué eligieron un pañuelo blanco como distintivo?",
            "¿Quién fue el oficial de la marina que se infiltró en Madres de Plaza de Mayo para \"marcar\" a quienes luego serían secuestrados?",
            "¿Qué eslógan creó la dictadura como réplica a las denuncias que se hacían desde el exterior por la represión ilegal?",
            "¿Qué fue el Plan Cóndor?",
            "Una de estas afirmaciones es FALSA",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veteranos_malvinas);

        respuestas[0][0] = "la Independencia";
        respuestas[0][1] = "la Bandera";
        respuestas[0][2] = "las víctimas de la última dictadura militar";// correcta
        respuestas[0][3] = "los veteranos de Malvinas";
        respuestas[1][0] = "Proceso Patriótico Nacional de Reorganización";
        respuestas[1][1] = "Proceso Patriótico de Reorganización Nacional";
        respuestas[1][2] = "Proceso Nacional de Reorganización";
        respuestas[1][3] = "Proceso de Reorganización Nacional";// correcta
        respuestas[2][0] = "Jorge Videla, Emilio Massera y Omar Gaffigna";
        respuestas[2][1] = "Jorge Videla, Emilio Massera y Orlando Agosti";// correcta
        respuestas[2][2] = "Jorge Videla, Armando Lambruschini y Basilio Lami Dozo";
        respuestas[2][3] = "Jorge Videla, Armando Lambruschini y Orlando Agosti";
        respuestas[3][0] = "Más de 7 años";// correcta
        respuestas[3][1] = "15 años";
        respuestas[3][2] = "Menos de 3 años";
        respuestas[3][3] = "2 años";
        respuestas[4][0] = "María Estela (Isabel) Martínez de Perón";// correcta
        respuestas[4][1] = "Héctor José Cámpora";
        respuestas[4][2] = "Juan Domingo Perón";
        respuestas[4][3] = "Ricardo Balbín";
        respuestas[5][0] = "Estuvo detenida un año y luego fue expulsada a España";
        respuestas[5][1] = "Fue inmediamente expulsada a España";
        respuestas[5][2] = "Estuvo cinco años presa y luego fue expulsada a España";// correcta
        respuestas[5][3] = "Estuvo detendia tres años y luego fue expulsada a España";
        respuestas[6][0] = "Tres";
        respuestas[6][1] = "Cuatro";// correcta
        respuestas[6][2] = "Dos";
        respuestas[6][3] = "Cinco";
        respuestas[7][0] = "Dos años";
        respuestas[7][1] = "Siete meses";// correcta
        respuestas[7][2] = "Un año y medio";
        respuestas[7][3] = "Tres años";
        respuestas[8][0] = "Ninguna";// correcta
        respuestas[8][1] = "Se declararon en huelga de hambre";
        respuestas[8][2] = "Convocaron a movilización a Plaza de Mayo";
        respuestas[8][3] = "Convocaron a un corte de ruta";
        respuestas[9][0] = "No tenemos plazos sino objetivos";// correcta
        respuestas[9][1] = "Las urnas están guardadas y bien guardadas";
        respuestas[9][2] = "Ni vencedores ni vencidos";
        respuestas[9][3] = "La casa está en orden";
        respuestas[10][0] = "Estados Unidos";
        respuestas[10][1] = "Venezuela";
        respuestas[10][2] = "Cuba";// correcta
        respuestas[10][3] = "Inglaterra";
        respuestas[11][0] = "La política de derechos humanos de la administración de Carter";// correcta
        respuestas[11][1] = "El respaldo de la administración de Carter a reclamos territoriales de Chile";
        respuestas[11][2] = "La política arancelaria de la administración Carter";
        respuestas[11][3] = "La política de administración de Carter a reclamos territoriales de Uruguay";
        respuestas[12][0] = "Julio Cortázar";
        respuestas[12][1] = "Ernesto Sábato";
        respuestas[12][2] = "Rodolfo Walsh";// correcta
        respuestas[12][3] = "Jorge Luis Borges";
        respuestas[13][0] = "Guillermo Klein";
        respuestas[13][1] = "José Alfredo Martínez de Hoz";// correcta
        respuestas[13][2] = "Roberto Alemann";
        respuestas[13][3] = "Joaquín de las Heras";
        respuestas[14][0] = "Un mes después del golpe";
        respuestas[14][1] = "Un año después del golpe";// correcta
        respuestas[14][2] = "Al iniciarse el mundial 1978";
        respuestas[14][3] = "Dos años después del golpe";
        respuestas[15][0] = "Por la bandera blanca de la paz";
        respuestas[15][1] = "Por ningún motivo en particular";
        respuestas[15][2] = "Simbolizaba el pañal de sus hijos";// correcta
        respuestas[15][3] = "Simbolizaba la venda en los ojos de la Justicia";
        respuestas[16][0] = "Rubén Chamarro";
        respuestas[16][1] = "Alfredo Astiz";// correcta
        respuestas[16][2] = "Jorge Acosta";
        respuestas[16][3] = "Gustavo Rodríguez";
        respuestas[17][0] = "Los argentinos somos derechos y humanos";// correcta
        respuestas[17][1] = "La subversión es apátrida";
        respuestas[17][2] = "Argentina potencia";
        respuestas[17][3] = "Las urnas están guardadas y bien guardadas";
        respuestas[18][0] = "Un plan para reforzar el poblamiento de la patagonia";
        respuestas[18][1] = "El plan secreto de desembarco en Malvinas";
        respuestas[18][2] = "El plan para sobrevolar las Malvinas y atacar a los ingleses";
        respuestas[18][3] = "La coordinación represiva entre las dictaduras del Cono Sur";// correcta
        respuestas[19][0] = "La dictadura decidió recuperar Malvinas por la fuerza creyendo tener un guiño de Estados Unidos";
        respuestas[19][1] = "La derrota de Malvinas aceleró la retirada de la dictadura";
        respuestas[19][2] = "El Presidente de facto durante la guerra de Malvinas era el Leopoldo Fortunato Galtieri";
        respuestas[19][3] = "El Presidente de facto durante la guerra de Malvinas era el General Roberto Viola";// correcta


        txtpregunta = (TextView) findViewById(R.id.textView2);
        btn1 = (Button) findViewById(R.id.button8);
        btn2 = (Button) findViewById(R.id.button9);
        btn3 = (Button) findViewById(R.id.button10);
        btn4 = (Button) findViewById(R.id.button11);

        btnVolver = (Button) findViewById(R.id.btnVolver2);

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btnVolver.setVisibility(View.INVISIBLE);

        txtpregunta.setText(preguntas[0]);
        btn1.setText(respuestas[0][0]);
        btn2.setText(respuestas[0][1]);
        btn3.setText(respuestas[0][2]);
        btn4.setText(respuestas[0][3]);

        imgView1 = (ImageView) findViewById(R.id.imgRpta);


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
        Intent menu = new Intent(this, MenuJuegos.class);
        startActivity(menu);
    }

    public void cargarPreguntas(View view, int numero){
        int idCorrecta = getResources().getIdentifier("rptacorrecta","drawable", getPackageName());
        int idIncorrecta = getResources().getIdentifier("rtaincorrecta","drawable", getPackageName());

        switch (contadorPreguntas){
            case 0:{
                if(numero == 1){ imgView1.setBackgroundColor(1);
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[0][2], Toast.LENGTH_LONG).show();
                }
                if(numero == 2){ imgView1.setBackgroundColor(2);
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[0][2], Toast.LENGTH_LONG).show();
                }
                if(numero == 3){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idCorrecta);   }
                if(numero == 4){ imgView1.setBackgroundColor(2);
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[0][2], Toast.LENGTH_LONG).show();
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
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[1][3], Toast.LENGTH_LONG).show();
                }
                if(numero == 2){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[1][3], Toast.LENGTH_LONG).show();
                }
                if(numero == 3){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[1][3], Toast.LENGTH_LONG).show();
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
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[2][1], Toast.LENGTH_LONG).show();
                }
                if(numero == 2){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idCorrecta);
                }
                if(numero == 3){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[2][1], Toast.LENGTH_LONG).show();
                }
                if(numero == 4){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[2][1], Toast.LENGTH_LONG).show();
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
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[3][0], Toast.LENGTH_LONG).show();
                }
                if(numero == 3){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[3][0], Toast.LENGTH_LONG).show();
                }
                if(numero == 4){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[3][0], Toast.LENGTH_LONG).show();
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
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[4][0], Toast.LENGTH_LONG).show();
                }
                if(numero == 3){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[4][0], Toast.LENGTH_LONG).show();
                }
                if(numero == 4){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[4][0], Toast.LENGTH_LONG).show();
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
                if(numero == 1){
                    //Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idCorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[5][2], Toast.LENGTH_LONG).show();
                }
                if(numero == 2){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[5][2], Toast.LENGTH_LONG).show();
                }
                if(numero == 3){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource (idCorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[5][2], Toast.LENGTH_LONG).show();
                }
                if(numero == 4){
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource (idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[5][2], Toast.LENGTH_LONG).show();
                }
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
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[6][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[6][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[6][1], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[7][0]);
                btn2.setText(respuestas[7][1]);
                btn3.setText(respuestas[7][2]);
                btn4.setText(respuestas[7][3]);
                txtpregunta.setText(preguntas[7]);
                contadorPreguntas++;
                break;
            }
            case 7: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[7][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[7][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[7][1], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[8][0]);
                btn2.setText(respuestas[8][1]);
                btn3.setText(respuestas[8][2]);
                btn4.setText(respuestas[8][3]);
                txtpregunta.setText(preguntas[8]);
                contadorPreguntas++;
                break;
            }
            case 8: {
                if (numero == 1) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[8][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[8][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[8][0], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[9][0]);
                btn2.setText(respuestas[9][1]);
                btn3.setText(respuestas[9][2]);
                btn4.setText(respuestas[9][3]);
                txtpregunta.setText(preguntas[9]);
                contadorPreguntas++;
                break;
            }
            case 9: {
                if (numero == 1) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[9][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[9][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[9][0], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[10][0]);
                btn2.setText(respuestas[10][1]);
                btn3.setText(respuestas[10][2]);
                btn4.setText(respuestas[10][3]);
                txtpregunta.setText(preguntas[10]);
                contadorPreguntas++;
                break;
            }
            case 10: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[10][2], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[10][2], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[10][2], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[11][0]);
                btn2.setText(respuestas[11][1]);
                btn3.setText(respuestas[11][2]);
                btn4.setText(respuestas[11][3]);
                txtpregunta.setText(preguntas[11]);
                contadorPreguntas++;
                break;
            }
            case 11: {
                if (numero == 1) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[11][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[11][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[11][0], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[12][0]);
                btn2.setText(respuestas[12][1]);
                btn3.setText(respuestas[12][2]);
                btn4.setText(respuestas[12][3]);
                txtpregunta.setText(preguntas[12]);
                contadorPreguntas++;
                break;
            }
            case 12: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[12][2], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[12][2], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[12][2], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[13][0]);
                btn2.setText(respuestas[13][1]);
                btn3.setText(respuestas[13][2]);
                btn4.setText(respuestas[13][3]);
                txtpregunta.setText(preguntas[13]);
                contadorPreguntas++;
                break;
            }
            case 13: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[13][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[13][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[13][1], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[14][0]);
                btn2.setText(respuestas[14][1]);
                btn3.setText(respuestas[14][2]);
                btn4.setText(respuestas[14][3]);
                txtpregunta.setText(preguntas[14]);
                contadorPreguntas++;
                break;
            }
            case 14: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[14][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[14][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[14][1], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[15][0]);
                btn2.setText(respuestas[15][1]);
                btn3.setText(respuestas[15][2]);
                btn4.setText(respuestas[15][3]);
                txtpregunta.setText(preguntas[15]);
                contadorPreguntas++;
                break;
            }
            case 15: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[15][2], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[15][2], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[15][2], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[16][0]);
                btn2.setText(respuestas[16][1]);
                btn3.setText(respuestas[16][2]);
                btn4.setText(respuestas[16][3]);
                txtpregunta.setText(preguntas[16]);
                contadorPreguntas++;
                break;
            }
            case 16: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[16][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[16][1], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[16][1], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[17][0]);
                btn2.setText(respuestas[17][1]);
                btn3.setText(respuestas[17][2]);
                btn4.setText(respuestas[17][3]);
                txtpregunta.setText(preguntas[17]);
                contadorPreguntas++;
                break;
            }
            case 17: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[17][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[17][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[17][0], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[17][0], Toast.LENGTH_LONG).show();
                }
                btn1.setText(respuestas[18][0]);
                btn2.setText(respuestas[18][1]);
                btn3.setText(respuestas[18][2]);
                btn4.setText(respuestas[18][3]);
                txtpregunta.setText(preguntas[18]);
                contadorPreguntas++;
                break;
            }
            case 18: {
                if (numero == 1) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[18][3], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[18][3], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[18][3], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                btn1.setText(respuestas[19][0]);
                btn2.setText(respuestas[19][1]);
                btn3.setText(respuestas[19][2]);
                btn4.setText(respuestas[19][3]);
                txtpregunta.setText(preguntas[19]);
                contadorPreguntas++;
                break;
            }
            case 19: {
                if (numero == 1) {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[19][3], Toast.LENGTH_LONG).show();
                }
                if (numero == 2) {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[19][3], Toast.LENGTH_LONG).show();
                }
                if (numero == 3) {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
                    imgView1.setImageResource(idIncorrecta);
                    Toast.makeText(this, "La respuesta correcta era: " + respuestas[19][3], Toast.LENGTH_LONG).show();
                }
                if (numero == 4) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                    imgView1.setImageResource(idCorrecta);
                }
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                contadorPreguntas++;
                break;
            }

        }

        if(contadorPreguntas == 20) {
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            /*btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);*/
            btnVolver.setVisibility(View.VISIBLE);
            btnVolver.setEnabled(true);
            txtpregunta.setText("¡¡LAS MALVINAS FUERON, SON \n Y SEGUIRAN SIENDO SIEMPRE ARGENTINAS");
            contadorPreguntas = 0;
        }
    }

    /*public void cargarPreguntas(View view, int numero ){
        int idCorrecta = getResources().getIdentifier("rptacorrecta","drawable", getPackageName());
        int idIncorrecta = getResources().getIdentifier("rtaincorrecta","drawable", getPackageName());

        if(numero == 1){ imgView1.setBackgroundColor(1);
            //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
            imgView1.setImageResource (idIncorrecta);
            Toast.makeText(this, "La respuesta correcta era: " + respuestas[0][2], Toast.LENGTH_LONG).show();
        }
        if(numero == 2){ imgView1.setBackgroundColor(2);
            //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
            imgView1.setImageResource (idIncorrecta);
            Toast.makeText(this, "La respuesta correcta era: " + respuestas[0][2], Toast.LENGTH_LONG).show();
        }
        if(numero == 3){
            Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
            imgView1.setImageResource (idCorrecta);   }
        if(numero == 4){ imgView1.setBackgroundColor(2);
            //Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show();
            imgView1.setImageResource (idIncorrecta);
            Toast.makeText(this, "La respuesta correcta era: " + respuestas[0][2], Toast.LENGTH_LONG).show();
        }

        btn1.setText(respuestas[contadorPreguntas+1][0]);
        btn2.setText(respuestas[contadorPreguntas+1][1]);
        btn3.setText(respuestas[contadorPreguntas+1][2]);
        btn4.setText(respuestas[contadorPreguntas+1][3]);
        txtpregunta.setText(preguntas[contadorPreguntas+1]);
        contadorPreguntas++;


    }*/
}