package edu.upc.dsa;

import edu.upc.dsa.models.Persona;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class Covid19ManagerTest {
    @Before
    public void SetUp(){


        Covid19ManagerImpl.getInstance().aplicarVacuna("1", "1", new Date(2021,3,1));
        Covid19ManagerImpl.getInstance().aplicarVacuna("2", "2", new Date(2021,4,4));
        Covid19ManagerImpl.getInstance().aplicarVacuna("3", "3", new Date(2021,5,19));
        Covid19ManagerImpl.getInstance().aplicarVacuna("4", "2", new Date(2021,6,21));
        Covid19ManagerImpl.getInstance().aplicarVacuna("5", "1", new Date(2021,8,12));


        Covid19ManagerImpl.getInstance().añadirSeguimiento("Mal estado",new Date(2021,3, 20),"1","1");
        Covid19ManagerImpl.getInstance().añadirSeguimiento("Buen estado",new Date(2021,5, 20),"2","2");
        Covid19ManagerImpl.getInstance().añadirSeguimiento("Regular estado",new Date(2021,6, 20),"3","3");


    }

    @Test
    public void aplicarVacuna(){
        Covid19ManagerImpl.getInstance().aplicarVacuna("6","3",new Date(2021,03,1));
        assertEquals(6, Covid19ManagerImpl.getInstance().getPersonasSize());


    }


    @Test
    public void añadirSeguimiento(){
        Covid19ManagerImpl.getInstance().añadirSeguimiento("Se encuentra perfectamente",new Date(2021,7,21), "3", "3");
        assertEquals(4, Covid19ManagerImpl.getInstance().listaSeguimientosDePersona.size());

    }


    @After
    public void tearDown() {

        Covid19ManagerImpl.getInstance().delete();
    }


}
