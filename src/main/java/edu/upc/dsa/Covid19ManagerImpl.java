package edu.upc.dsa;

import edu.upc.dsa.models.Persona;
import edu.upc.dsa.models.Vacuna;
import edu.upc.dsa.models.Vacunacion;
import org.apache.log4j.Logger;

import java.util.*;

public class Covid19ManagerImpl implements Covid19Manager {


    HashMap<String, Persona> personas;
    List<Persona> listaVacunaciones; //Cada persona vacunada se añade a la lista de vacunaciones
    List<Vacunacion> listaSeguimientosDePersona; //cada seguimiento se añade al estado de vacunacion de las personas
    List<Vacuna> listaTiposVacunas; //Tipos de vacunas que hay


    private static Covid19ManagerImpl CM;
    static final Logger logger = Logger.getLogger(Covid19ManagerImpl.class.getName());


    private Covid19ManagerImpl(){

        this.personas = new HashMap<String, Persona>();
        this.listaVacunaciones = new LinkedList<Persona>();
        this.listaSeguimientosDePersona = new LinkedList<Vacunacion>();
        this.listaTiposVacunas = new LinkedList<Vacuna>();

    }

    public static Covid19ManagerImpl getInstance()
    {
        if (CM==null)
            CM = new Covid19ManagerImpl();

        return CM;
    }

    public static void delete(){
        CM = null;
        logger.info("Instancia CM borrada");

    }


    @Override
    public void aplicarVacuna(String idPersona, String idVacuna, Date fecha) {

        Persona persona = this.personas.get(idPersona);
        persona.setIdVacuna(idVacuna);
        persona.setFecha(fecha);

        Vacunacion nuevaVacunacion = new Vacunacion(idPersona, idVacuna, fecha);
        this.personas.put(persona.getIdPersona(), persona);

        for (Vacuna vacuna : this.listaVacunas()) {

            if(vacuna.getIdVacuna().equals(idVacuna)) {
                int sumador = vacuna.getAplicadas() + 1;
                vacuna.setAplicadas(sumador);
            }
        }

        logger.info("Le hemos aplicado la vacuna a la persona con ID: " + idPersona);
    }

    @Override
    public List<Vacuna> listaVacunas() {
        return null;
    }


    @Override
    public List<Vacuna> vacunasPorAplicadas() {
        Collections.sort(this.listaTiposVacunas, new Comparator <Vacuna>() {
            @Override
            public int compare(Vacuna v1, Vacuna v2) {
                return Double.compare(v1.getAplicadas(), v2.getAplicadas());
            }
        });


        logger.info("Hemos ordenado las vacunas descendentemente por aplicadas");
        return this.listaTiposVacunas;
    }

    @Override
    public void añadirSeguimiento(String seguimiento, Date fecha, String idPersona, String idVacuna) {

        Vacunacion nuevoSeguimiento = new Vacunacion(fecha, seguimiento, idPersona, idVacuna);
        this.listaSeguimientosDePersona.add(nuevoSeguimiento);


        logger.info("Le hemos añadido un seguimiento al usuario con ID: " + idPersona);

    }

    @Override
    public List<Vacunacion> seguimientosDePersona(String idPersona) {

        for(Vacunacion vac: this.listaSeguimientosDePersona)
        {
            if(vac.getIdPersona() == idPersona)
            {
                this.listaSeguimientosDePersona.add(vac);
            }
        }


        logger.info("Tenemos los seguimiento de la persona con ID: " + idPersona);
        return this.listaSeguimientosDePersona;

    }

    //Los siguientes dos harán falta para el test!!
    @Override
    public int getPersonasSize(){
        return personas.size();
    }

    @Override
    public int getSeguimientosSize(){
        return listaSeguimientosDePersona.size();
    }
}
