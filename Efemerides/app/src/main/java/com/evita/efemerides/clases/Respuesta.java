package com.evita.efemerides.clases;

public class Respuesta {
    private Integer id= 0;
    private String respuesta= "";
    private Boolean correcta= false;

    public Respuesta(Integer id ,String respuesta, Boolean correcta){
        this.id = id;
        this.respuesta = respuesta;
        this.correcta = correcta;

    }

    public String getRespuesta(){
        return respuesta;
    }

    public Boolean getCorrecta(){
        return correcta;
    }

    public Integer getId(){return id; }
}
