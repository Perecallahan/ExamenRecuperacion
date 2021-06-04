/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

/**
 *
 * @author danielreguera
 */

//indica que para correr, usará valores de @Parameters
@RunWith(value=Parameterized.class)
public class FechasParametrizada {
    //atributos
    private String fechaPrueba;
    private int resultadoEsperado;
    
    //para intentar mostrar los datos de las diferentes pruebas
    String [] tiempo = {"2021-06-04", "2021-06-04", "2021-06-04"};
    private int indice;
    
    //constructor
    public FechasParametrizada(String fecha, int valor) {
        this.fechaPrueba = fecha;
        this.resultadoEsperado = valor;
    }

    @Parameters
    public static Iterable<Object> obtenerPrueba(){
        List<Object> obj = new ArrayList<>();
        //presente
         obj.add(new Object[] {"2021-06-04", 0 });
        //futuro 
         obj.add(new Object[] {"2031-06-04", 1 });
         //pasado
        obj.add(new Object[] {"2001-06-04", -1 }); 
        
        return obj;
    }
    
    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    
    //intento que vaya mostrando cada prueba diferente que hace... pero no lo consigo
    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        
        
        System.out.println(tiempo[indice]);
        String fechaFactura = "";
        Fechas instance = new Fechas();
        int expResult = resultadoEsperado;
        int result = instance.esFacturaCorrectaEnFecha(fechaPrueba);
        assertEquals(expResult, result);
        indice++;
    }
    
}
