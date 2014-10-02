package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    
    private DecimalCollection dc;
    
    @Before
    public void before(){
        dc = new DecimalCollection();
    }
    
    @Test
    public void testDecimalCollection() {
        assertEquals(0, dc.size());
    }

    @Test
    public void testAdd() {
        dc.add(3);
        assertEquals(1, dc.size());
    }

    @Test
    public void testSize() {
        for(int i = 0; i < 10; i++){
            dc.add(i);
        }        
        assertEquals(10, dc.size());
    }

    @Test
    public void testSum() {
        for(int i = 0; i < 5; i++){
            dc.add(i);
        }        
        assertTrue(10 == dc.sum());
    }

    @Test
    public void testHigher() {
        dc.add(3.00001);
        dc.add(3.0000099);
        dc.add(3.0001);
        assertTrue(3.0001 == dc.higher());
    }

}
