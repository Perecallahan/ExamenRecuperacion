/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author danielreguera
 * 
 * ejecuta las pruebas en el orden que le establecemos dentro
 *      basica
 *      ba
 *      baclass
 *      param
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    fechas.FechasIT.class, 
    
    fechas.FechasBA.class,
    
    fechas.FechasBAClass.class, 
    
    fechas.FechasParametrizada.class
})

public class NewTestSuite {
    
}
