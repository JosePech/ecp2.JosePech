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

}
