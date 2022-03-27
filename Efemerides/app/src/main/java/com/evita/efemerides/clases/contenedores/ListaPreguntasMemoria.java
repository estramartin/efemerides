package com.evita.efemerides.clases.contenedores;

import com.evita.efemerides.clases.Pregunta;
import com.evita.efemerides.clases.Respuesta;

import java.util.ArrayList;
import java.util.List;

public class ListaPreguntasMemoria {

    private List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
    private Respuesta respuesta;
    private Pregunta pregunta;

    public ListaPreguntasMemoria(){

        pregunta = new Pregunta(1, "Cuando fue la guerra de malvinas?");
        respuesta = new Respuesta( 1,"2 de Abril", true);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(2,"4 de Mayo", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(3,"9 de Julio", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(4,"20 de Junio", false);
        pregunta.setRespuesta(respuesta);
        listaPreguntas.add(pregunta);

        pregunta = new Pregunta(2, "Que son las malvinas?");
        respuesta = new Respuesta(1,"Pais", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(2,"Antartida", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(3,"Brasil", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(4,"Islas", true);
        pregunta.setRespuesta(respuesta);
        listaPreguntas.add(pregunta);

        pregunta = new Pregunta(3, "Las mejores promos estan en...?");
        respuesta = new Respuesta(1,"Carrefour", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(2,"El Tunel", true);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(3,"Dia", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(4,"Chino", false);
        pregunta.setRespuesta(respuesta);
        listaPreguntas.add(pregunta);

        pregunta = new Pregunta(4, "Putin gobierna...?");
        respuesta = new Respuesta(1,"Alemania", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(2,"Turkia", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(3,"Rusia", true);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(4,"Dinamarca", false);
        pregunta.setRespuesta(respuesta);
        listaPreguntas.add(pregunta);

        pregunta = new Pregunta(5, "El que puso dolares recibira...?");
        respuesta = new Respuesta(1,"Federales", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(2,"Dolares", true);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(3,"Pesos", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(4,"Australes", false);
        pregunta.setRespuesta(respuesta);
        listaPreguntas.add(pregunta);

        pregunta = new Pregunta(6, "Siganme, que no los voy a...?");
        respuesta = new Respuesta(1,"Defraudar", true);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(2,"Cagar", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(3,"Afanar", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(4,"Asaltar", false);
        pregunta.setRespuesta(respuesta);
        listaPreguntas.add(pregunta);

        pregunta = new Pregunta(7, "La casa esta en ...?");
        respuesta = new Respuesta(1,"Desorden", true);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(2,"Orden", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(3,"Hawai", false);
        pregunta.setRespuesta(respuesta);
        respuesta = new Respuesta(4,"Barrio Atraa", false);
        pregunta.setRespuesta(respuesta);
        listaPreguntas.add(pregunta);

    }


    public void setListaPreguntas(Pregunta pregunta){
        listaPreguntas.add(pregunta);

    }

    public List<Pregunta> getListaPreguntas() {
        return listaPreguntas;
    }

    public Pregunta getPregunta(Integer index){
        return listaPreguntas.get(index);

    }

    public Respuesta getRespuesta(Integer indexPregunta, Integer indexRespuesta){

        return listaPreguntas.get(indexPregunta).getRespuesta(indexRespuesta);


    }
}
