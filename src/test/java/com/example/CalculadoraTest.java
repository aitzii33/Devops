package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
 @Test
    public void testAdd() {
        Calculadora calc = new Calculadora();
        assertEquals("2 + 3 should equal 5", calc.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Calculadora calc = new Calculadora();
        assertEquals("3 - 2 should equal 1", calc.subtract(3, 2), 1);
    }

    @Test
    public void testMultiply(){
        Calculadora calc = new Calculadora();
        assertEquals("3 * 2 should equal 6", calc.multiply(3, 2), 6);
    }
}
