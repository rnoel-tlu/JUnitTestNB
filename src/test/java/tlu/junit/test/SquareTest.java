/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tlu.junit.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rnoel
 */
public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of area method, of class Square.
     */
    @Test
    public void testArea() {
        Square s = new Square(2);
        double ex = 4.0;
        double ac = s.area();
        assertEquals(ex, ac);
    }
    
}
