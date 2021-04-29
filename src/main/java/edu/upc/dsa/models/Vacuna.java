package edu.upc.dsa.models;


//Vacuna hace referencia a cada tipo de vacuna
public class Vacuna {

    String nombre;
    String idVacuna;
    int aplicadas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(String idVacuna) {
        this.idVacuna = idVacuna;
    }

    public int getAplicadas() {
        return aplicadas;
    }

    public void setAplicadas(int aplicadas) {
        this.aplicadas = aplicadas;
    }

    public Vacuna(){}

    public Vacuna(String nombre, String idVacuna){
        this.nombre = nombre;
        this.idVacuna = idVacuna;
        this.aplicadas=0;
    }
}
