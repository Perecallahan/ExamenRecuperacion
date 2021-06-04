/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielreguera
 */
public class FechasBA {
    private static Fechas instance;
    
    public FechasBA() {}
    
    @Before
    public void setUp() {
        System.out.println("Before");
        instance = new Fechas();
    }
    
    @After
    public void tearDown() {
        System.out.println("After \n");
        instance = null;        
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
