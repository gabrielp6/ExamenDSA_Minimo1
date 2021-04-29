package edu.upc.dsa.models;

import java.util.Date;

//Vacunacion hace referencia al seguimiento de la vacunacion
public class Vacunacion {
    String idPersona;
    Date fecha;
    String idVacuna;
    String seguimiento;

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

    public String getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(String seguimiento) {
        this.seguimiento = seguimiento;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String nombrePersona) {
        this.idPersona = nombrePersona;
    }

    public Vacunacion(){}

    public Vacunacion(Date fecha, String seguimiento, String idPersona, String idVacuna){
        this.fecha=fecha;
        this.seguimiento=seguimiento;
        this.idPersona = idPersona;
        this.idVacuna = idVacuna;

    }

    public Vacunacion(String idPersona, String idVacuna, Date fecha){
        this.fecha=fecha;
        this.idPersona = idPersona;
        this.idVacuna = idVacuna;

    }
}
