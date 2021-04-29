package edu.upc.dsa.models;

import java.util.Date;


//Persona hace referencia a la vacunacion inicial
public class Persona {


    public String idPersona;
    public String idVacuna;
    public Date fecha;


    public Persona(String idPersona, String idVacuna, Date fecha) {
        this.idPersona = idPersona;
        this.idVacuna=idVacuna;
        this.fecha=fecha;

    }

    public Persona(){}

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(String idVacuna) {
        this.idVacuna = idVacuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
