/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class NewMatematicasJUnitTest {
    
    public NewMatematicasJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public void sumaTest(int x, int y){
        int total = 8;
        int sum=Calculadora.suma(x,y);
        assertEquals(sum,total);
    }
    
    public void restaTest(int x, int y){
        int total = 0;
        int sub = Calculadora.sub(x,y);
        assertEquals(sub,total);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
