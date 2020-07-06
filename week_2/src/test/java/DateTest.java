/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Group2
 */
public class DateTest {

   

    /**
     * Test of isLeapYear method, of class Date.
     */
    @Test
    public void testIsLeapYear() {
        Date date1 = new Date(5, 1, 1800);
        Date date2 = new Date(1, 2, 1992);
        Date date3 = new Date(2, 7, 2000);
        boolean expected01 = false;
        assertEquals(expected01, Date.isLeapYear(date1.getYear()));
        boolean expected02 = true;
        assertEquals(expected02, Date.isLeapYear(date2.getYear()));
        boolean expected03 = true;
        assertEquals(expected03, Date.isLeapYear(date3.getYear()));

    }

    /**
     * Test of getLastDayOfMonth method, of class Date.
     */
    @Test
    public void testGetLastDayOfMonth() {
        Date date1 = new Date(5, 2, 1800);
        Date date2 = new Date(1, 2, 1992);
        int expected01 = 28;
        assertEquals(expected01, Date.getLastDayOfMonth(date1.getMonth(), date1.getYear()));
        int expected02 = 29;
        assertEquals(expected02, Date.getLastDayOfMonth(date1.getMonth(), date2.getYear()));

    }

    /**
     * Test of isValidDate method, of class Date.
     */
    @Test(expected = IllegalArgumentException.class)

    public void testIsValidDate() {

        Date[] dates = {new Date(5, 1, 2020), new Date(32, 1, 2020), new Date(29, 2, 2020),
            new Date(32, 3, 2020), new Date(31, 4, 2020),
            new Date(32, 5, 2020), new Date(31, 6, 2020), new Date(32, 7, 2020),
            new Date(32, 8, 2020), new Date(31, 9, 2020), new Date(32, 10, 2020),
            new Date(31, 11, 2020), new Date(32, 12, 2020)};
        boolean[] expectations = {true, false, true, false, false, false, false, false,
            false, false, false, false, false};
        for (int i = 0; i < dates.length; i++) {
            assertEquals(expectations[i], Date.isValidDate(dates[i].getDay(), dates[i].getMonth(),
                    dates[i].getYear()));

        }
        Date date_not_leap = new Date(29, 2, 1800);
        boolean expected = false;
        assertEquals(expected, Date.isValidDate(date_not_leap.getDay(), date_not_leap.getMonth(),
                date_not_leap.getYear()));

    }

}
