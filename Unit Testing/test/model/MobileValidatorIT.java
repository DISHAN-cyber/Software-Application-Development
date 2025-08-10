/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class MobileValidatorIT {
    
    public MobileValidatorIT() {
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
     * Test of isMobileValidator method, of class MobileValidator.
     */
    @Test
    public void testIsMobileValidator() {
        System.out.println("isMobileValidator");
        String input = "";
        boolean expResult = false;
        boolean result = MobileValidator.isMobileValidator(input);
        assertEquals(expResult, result);
        
    }
    
}
