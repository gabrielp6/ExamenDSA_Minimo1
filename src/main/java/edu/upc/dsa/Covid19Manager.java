package edu.upc.dsa;

import edu.upc.dsa.models.Vacuna;
import edu.upc.dsa.models.Vacunacion;

import java.util.Date;
import java.util.List;

public interface Covid19Manager {

    public void aplicarVacuna(String idPersona, String idVacuna, Date fecha);
    public List<Vacuna> listaVacunas();
    public List<Vacuna> vacunasPorAplicadas();
    public void añadirSeguimiento(String seguimiento, Date fecha, String idPersona, String idVacunacion);
    public List<Vacunacion> seguimientosDePersona(String idPersona);

    //Para el test:
    public int getSeguimientosSize();
    public int getPersonasSize();
}
