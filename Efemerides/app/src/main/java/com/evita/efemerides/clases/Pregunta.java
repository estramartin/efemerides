package com.evita.efemerides.clases;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {


    private String pregunta;
    private Integer id;
    private List<Respuesta> listaRespuestas = new ArrayList<Respuesta>();

    public Pregunta(Integer id, String pregunta){
        this.pregunta = pregunta;
        this.id = id;

    }

    public void setRespuesta(Respuesta respuesta){
       if(listaRespuestas.size()<5) {
           listaRespuestas.add(respuesta);
       }
    }

    public Respuesta getRespuesta(Integer index){
        return listaRespuestas.get(index);
    }

    public List<Respuesta> getListaRespuestas() {
        return listaRespuestas;
    }

    public String getPregunta(){
        return pregunta;
    }

    public Integer getId(){
        return id;
    }

    public String RespuestaCorrecta(){
        String respuestaCorrecta ="";
        for( Respuesta correcta  : listaRespuestas){
            if(correcta.getCorrecta()){
                respuestaCorrecta = correcta.getRespuesta();
            }
        }
        return respuestaCorrecta;
    }
}
