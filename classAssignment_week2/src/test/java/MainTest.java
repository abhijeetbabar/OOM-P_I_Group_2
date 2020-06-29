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
 * @author abhijeet
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testMain() {
        JulianNumber date = new JulianNumber(2018, 5, 16);
        System.out.println("checking JulianNumber test with 2018, 5, 16 as inputs");
        System.out.println(date.toDate());
        System.out.println();
        System.out.println();
        // Abhi's code
        // System.out.println("checking JulianNumber test with 2638011(2018.05.16) as inputs");

        System.out.println("checking JulianNumber test with 2458255 (2018.05.16) as inputs");

        // Abhi's code
        // System.out.println(new JulianNumber(2018, 5, 16));
        JulianNumber date1 = new JulianNumber(50, 1, 5);
        JulianNumber date2 = new JulianNumber(1957, 2, 1);
        JulianNumber date3 = new JulianNumber(1492, 3, 15);
        JulianNumber date4 = new JulianNumber(2050, 12, 25);
        long expected01 = 1739327;
        assertEquals(expected01, date1.getJulianDate());
        long expected02 = 2435871;
        assertEquals(expected02, date2.getJulianDate());
        long expected03 = 2266076;
        assertEquals(expected03, date3.getJulianDate());
        long expected04 = 2470166;
        assertEquals(expected04, date4.getJulianDate());

        String expected10 = "JANUARY 05, 0050 A.D.";
        assertEquals(expected10, date1.toDate());
        String expected11 = "FEBRUARY 01, 1957 A.D.";
        assertEquals(expected11, date2.toDate());
        String expected12 = "MARCH 15, 1492 A.D.";
        assertEquals(expected12, date3.toDate());
        String expected13 = "DECEMBER 25, 2050 A.D.";
        assertEquals(expected13, date4.toDate());
        // SJS Added 2 lines
        JulianNumber julianObject = new JulianNumber(2018, 5, 16);
        System.out.println("Julian Number is: " + julianObject.getJulianDate() + "\n");
    }
}
