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
 * @author Thomas
 */
public class CalculandoEstatisticaSimplesTest {
    
    public CalculandoEstatisticaSimplesTest() {
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

    /**
     * Test of minimo method, of class CalculandoEstatisticaSimples.
     */
    @Test
    public void testMinimo() {
        System.out.println("minimo");
        int min = 0;
        CalculandoEstatisticaSimples instance = new CalculandoEstatisticaSimples();
        instance.minimo(3);
        instance.minimo(2);
        instance.minimo(5);
        int expResult = 2;
        int result = instance.minimo(min);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maximo method, of class CalculandoEstatisticaSimples.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        int max = 0;
        CalculandoEstatisticaSimples instance = new CalculandoEstatisticaSimples();
        instance.maximo(3);
        instance.maximo(2);
        instance.maximo(5);
        int expResult = 5;
        int result = instance.maximo(max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class CalculandoEstatisticaSimples.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        int tam = 0;
        CalculandoEstatisticaSimples instance = new CalculandoEstatisticaSimples();
        instance.tamanho(3);
        int expResult = 3;
        int result = instance.tamanho(tam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of media method, of class CalculandoEstatisticaSimples.
     */
    @Test
    public void testMedia() {
        System.out.println("media");
        float media = 0.0F;
        CalculandoEstatisticaSimples instance = new CalculandoEstatisticaSimples();
        int soma = 0;
        instance.media(soma/2);
        float expResult = 0.0F;
        float result = instance.media(media);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
