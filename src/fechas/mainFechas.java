/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;

/**
 *
 * @author javie
 */
public class mainFechas {

    /**
     *
     * @param args argumentos por lineas de comandos.
     * @throws ParseException -hpña
     */
    public static void main(String[] args) throws ParseException  {
        // TODO code application logic here
        System.out.println("Inicio");
        Fechas miFecha = new Fechas();
        
        miFecha.esFacturaCorrectaEnFecha("2001-01-02");
        
        
       
        
        System.out.println("Fin");
        
    }
}
