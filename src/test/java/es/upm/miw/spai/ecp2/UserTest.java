package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User user;
    private int number = 555789;
    private String name = "Jose", familyName = "Pech";
    
    @Before
    public void before(){
        this.user = new User(number, name, familyName);
    }

    @Test
    public void testUser() {
        assertEquals(number, user.getNumber());
        assertEquals(name, user.getName());
        assertEquals(familyName, user.getFamilyName());
    }

    @Test
    public void testGetNumber() {
        assertEquals(number, user.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals(name, user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals(familyName, user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals(name + " " + familyName, user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals(name.substring(0, 1) + ".", user.initials());
    }
    
    @Test
    public void testNombreMayusculas() {
        assertEquals("JOSE PECH", user.nombreMayusculas());
    }

}
