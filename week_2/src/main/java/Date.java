/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.Month;
/**
 *
 * @author Group2
 */
public class Date {

//    January 1st, 1970
    private int day;
    private int month;
    private int year;
    private int mJulianNumber;
    
    public String getDateFromJulianNumber(int jNumber){
        return fromJulianNumber(jNumber);
    }

    public int getmJulianNumber() {
        return toJulianNumber(day, month, year);
    }
    
    

    private Date date;

    public Date() {
    }

    public Date(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid Date");
        }
        this.day = day;
        this.month = month;
        this.year = year;
        this.mJulianNumber = toJulianNumber(day, month, year);
    }

    public Date(Date date) {
        this.date = date;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int pDay) {
        if (pDay >= 1 && pDay <= getLastDayOfMonth(this.month, this.year)) {
            this.day = pDay;
        } else {
            System.out.println("Date can not be greater than "
                    + getLastDayOfMonth(this.month, this.year) + 
                    " in month "+this.month+" of "+this.year+" year.");
            System.out.println("Please select option 1 for continue. \n");
        }
    }

    public void setMonth(int pMonth) {
        if (pMonth < 13) {
            this.month = pMonth;
        } else {
            System.out.println("Month can not be greater than 12.");
        }
    }

    public void setYear(int pYear) {
        if (pYear > 0) {
            this.year = pYear;
        } else {
            System.out.println("Year is invalid. ");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 100 != 0) && (year % 4 == 0) || year % 100 == 0 && (year % 400 == 0);

//        2ND WAY
//        if (year % 4 == 0) // Every fourth year is a leap year
//            {
//                if (year % 100 == 0) // Except every 100 is not a leap year ( 100, 200, 300, 400 )
//                {
//                    if (year % 1000 != 0) // Except that every 1000 is a leap year ( 1000, 2000, 3000 )
//                    {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
    }

// returns the last Day of the month if month > 12 it returns -1
    public static int getLastDayOfMonth(int month, int year) {
        if (0 < month && month < 13) {
            if (month == 2) {
                return isLeapYear(year) ? (byte) 29 : (byte) 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else {
                return 31;
            }

//        OR WE CAN HAVE FOLLOWING IMPLEMENTATIONS
//A
//            if (month == 12) {
//                month = 1;
//                year++;
//            } else {
//                month++;
//            }
//            Date dateOfInterest = new Date(month, month, month);
//            dateOfInterest.toJulianNumber(1, month, year);
//            dateOfInterest.mJulianNumber -= 1;
//            return dateOfInterest.getDay();
//B
//        int lastDayOfMonth;
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                lastDayOfMonth = 31;
//                break;
//            case 2:
//                if (isLeapYear(year)) {
//                    lastDayOfMonth = 29;
//                } else {
//                    lastDayOfMonth = 28;
//                }   break;
//            default:
//                lastDayOfMonth = 30;
//                break;
//        }
//        return lastDayOfMonth;
        } else {
            return -1;
        }
    }

    private int toJulianNumber(int day, int month, int year) {
        return (1461 * (year + 4800 + (month - 14) / 12)) / 4 + (367 * (month - 2 - 12
                * ((month - 14) / 12))) / 12 - (3 * ((year + 4900 + (month - 14) / 12) / 100)) / 4 + day - 32075;
    }

    private String fromJulianNumber(int mJulianNumber) {
        long f = mJulianNumber + 1401 + (((4 * mJulianNumber + 274277) / 146097) * 3) / 4 -38;
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

    public static Boolean isValidDate(int day, int month, int year) {
        //day range: 1-31
        if (day <= 0 || day > 31) {
            return false;
        }
        //Leap year or not
        boolean leap = isLeapYear(year);

        //check Feb.	
        if (month == 2) {
            if (leap && day > 29) {
                return false;
            } else if (!leap && day > 28) {
                return false;
            }
            return true;
        }
        //Initial days in different months
        int[] monList = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] dayList = {31, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < monList.length; i++) {
            if (month == monList[i] && day <= dayList[i]) {
                return true;
            }
        }
        return false;
    }
;

}
