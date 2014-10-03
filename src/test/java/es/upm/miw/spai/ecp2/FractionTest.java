package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    
    private Fraction fraction;
    
    @Before
    public void before(){
        fraction = new Fraction(3,2);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(fraction.getDenominator(), 2);
        assertEquals(fraction.getNumerator(), 3);
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(fraction.getDenominator(), 1);
        assertEquals(fraction.getNumerator(), 1);
    }

    @Test
    public void testGetNumerator() {
        assertEquals(fraction.getNumerator(), 3);
    }

    @Test
    public void testGetDenominator() {
        assertEquals(fraction.getDenominator(), 2);
    }

    @Test
    public void testDecimal() {
        assertEquals((double)3/2,fraction.decimal(), 0.001);
    }
    
    @Test
    public void testEsPropia() {
    	assertFalse(fraction.EsPropia());
    }
    
    @Test
    public void testEsImpropia() {
    	assertTrue(fraction.EsImpropia());
    }
    
    public void testMultiplicar(){
        Fraction multiplo = new Fraction(2,2);        
        assertEquals(fraction.multiplicar(multiplo).getNumerator(), multiplo.getNumerator() * fraction.getNumerator(), 0.5);
        assertEquals(fraction.multiplicar(multiplo).getDenominator(), multiplo.getDenominator() * fraction.getDenominator(), 0.5);
    }

}
