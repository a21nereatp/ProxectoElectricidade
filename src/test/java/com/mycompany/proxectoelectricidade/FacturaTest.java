/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectoelectricidade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class FacturaTest {
    
    public FacturaTest() {
    }

      @Test
    public void testCalcularPrezokWh1() {
        System.out.println("9 céntimos/kwH");
        Factura instance = new Factura();
        instance.setConsumokWh(300);
        int expResult = 9;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
     public void testCalcularPrezokWh2() {
        System.out.println("8 céntimos/kwH");
        Factura instance = new Factura();
        instance.setConsumokWh(301);
        int expResult = 8;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
     public void testCalcularPrezokWh3() {
        System.out.println("8 céntimos/kwH");
        Factura instance = new Factura();
        instance.setConsumokWh(600);
        int expResult = 8;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
     public void testCalcularPrezokWh4() {
        System.out.println("6 céntimos/kwH");
        Factura instance = new Factura();
        instance.setConsumokWh(601);
        int expResult = 6;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
     
    @Test
     public void testCalcularPrezokWh5() {
        System.out.println("6 céntimos/kwH");
        Factura instance = new Factura();
        instance.setConsumokWh(1000);
        int expResult = 6;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
     
    @Test
     public void testCalcularPrezokWh6() {
        System.out.println("5 céntimos/kwH");
        Factura instance = new Factura();
        instance.setConsumokWh(1001);
        int expResult = 5;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
     public void testCalcularPrezokWh7() {
        System.out.println("5 céntimos/kwH");
        Factura instance = new Factura();
        instance.setConsumokWh(2000);
        int expResult = 5;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
     @Test
      public void testCalcularPrezokWh8() {
        System.out.println("ERROR");
        Factura instance = new Factura();
        instance.setConsumokWh(2500);
        int expResult = 0;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
}
