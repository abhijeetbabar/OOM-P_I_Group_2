/**
 * Week 2 Group Tutorial Assignment
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Group 2
 */

import java.time.Month;
// import java.time.Year;
import java.security.InvalidParameterException;

/**
 * This class contains methods to convert a Julian Number to a Gregorian date
 * and a Gregorian date to a Julian number.
 * It returns a long integer for the Julian Number and
 * a string for the Gregorian date.
 */
public class JulianNumber {
    private long julianDate;

    /**
     * @param year An integer input by the user for the year
     * @param month An integer 1-12 input by the user for the month
     * @param day An integer 1-31 input by the user for the day
     */
    public JulianNumber(int year, int month, int day){
        month = Math.abs(month);
        day = Math.abs(day);
        // Use the conversion formula provided by the assignment to convert to a Julian Number.
        julianDate = (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month - 2 - 12 * 
                ((month - 14)/12)))/12 - (3 * ((year + 4900 + (month- 14)/12)/100))/4 + day - 32075;
    }

     /**
     * This method converts a Julian Number input by the user as an integer and converts it to
     * a Gregorian date.
     * @return String This returns the date as a String.
     */
    public String toDate() {
        long f = julianDate + 1401 + (((4 * julianDate + 274277) / 146097) * 3) / 4 -38;
        long e = 4 * f + 3;
        long g = e % 1461 / 4;
        long h = 5 * g + 2;
        long day = (h % 153) / 5 + 1;
        long month = (h / 153 + 2) % 12 + 1;
        long year = (e / 1461) - 4716 + (12 + 2 - month) / 12;
        
        // Check to see if the year is negative. If so, make it positive.
        // Append B.C. or A.D. to the date string.
        String era = "";
        if (year < 0) {
          era = " B.C.";
          year = Math.abs(year);
        }else {
          era = " A.D.";
        }
        
        // Clean up the output.
        // Convert the number of the month to its name using Java.time.
        // Make the year four digits with leading zeros if necessary.
        int monthInt = (int) month;
        Month monthName = Month.of(monthInt); 
        String padedYear = String.format("%04d", year);
        return  monthName + " " + ((day < 10) ? "0" : "") + day   + ", " + padedYear + era;
    }

    /**
    * This is the getter method for the Julian Date parameter.
    * @return long Returns the Julian Number.
    */
    public long getJulianDate() {
        return julianDate;
    }

    /**
     * This is the setter method for the Julian Date parameter.
     * It throws an exception if the Julian Number is less than 0.
     * @param julianDate long Gets the Julian Number from the JulianNumber class.
     */
    public void setJulianDate(long julianDate) {
        if(julianDate >= 0)
            this.julianDate = julianDate;
        else
            throw new InvalidParameterException("Julian Date has to be a number greater than or "
                    + "equal to 0");
    }
}