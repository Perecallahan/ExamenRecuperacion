/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielreguera
 */
public class FechasBAClass {
    
    private static Fechas instance;
    
    
    public FechasBAClass() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
        instance = new Fechas();
    }
    
    /**
     * el after no hace falta que haga nada
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass\n");
    }

    /**
     * Comprueba la fecha de hoy. Cuidado! Al ser un string "estatico", 
     * hay que modificarlo con la fecha del día que se corra la prueba
     */
    @Test
    public void presente() throws Exception {
        System.out.println("Presente (valida)");
        String fechaFactura = "2021-06-04";
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
    @Test
    public void futuro() throws Exception {
        System.out.println("Futuro (no valida)");
        String fechaFactura = "2031-06-04";
        int expResult = +1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
    @Test
    public void pasado() throws Exception {
        System.out.println("Pasado (valida)");
        String fechaFactura = "2001-06-04";
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
}
