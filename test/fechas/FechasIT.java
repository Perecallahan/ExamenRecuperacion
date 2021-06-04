/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielreguera
 */
public class FechasIT {
    
    public FechasIT() {
    }

    /**
     * Comprueba la fecha de hoy. Cuidado! Al ser un string "estatico", 
     * hay que modificarlo con la fecha del día que se corra la prueba
     * [en todas las preubas!!!]
     */
    @Test
    public void presente() throws Exception {
        System.out.println("Presente (valida)");
        String fechaFactura = "2021-06-04";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
    @Test
    public void futuro() throws Exception {
        System.out.println("Futuro (no valida)");
        String fechaFactura = "2031-06-04";
        Fechas instance = new Fechas();
        int expResult = +1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
    @Test
    public void pasado() throws Exception {
        System.out.println("Pasado (valida)");
        String fechaFactura = "2001-06-04";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
    }
    
}
