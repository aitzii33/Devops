package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest 
{
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

    @Test
    public void testDivide(){
        Calculadora calc = new Calculadora();
        assertEquals("6 / 2 should equal 3", calc.divide(6, 2), 3, 0.01);
    }

    @Test
    public void testMedia(){
        Calculadora calc = new Calculadora();
        assertEquals("Media of 4 and 6 should be 5", calc.media(4, 6), 5, 0.01);
    }
}
