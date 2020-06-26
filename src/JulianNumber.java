import java.time.Month;
import java.time.Year;
import java.security.InvalidParameterException;

public class JulianNumber {
    private long julianDate;

    public JulianNumber(int year, int month, int day){
        month = Math.abs(month);
        day = Math.abs(day);
        
        julianDate = (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month - 2 - 12 * ((month - 14)/12)))/12 - (3 * ((year + 4900 + (month- 14)/12)/100))/4 + day - 32075;
    }

    public String toDate() {
        long f = julianDate + 1401 + (((4 * julianDate + 274277) / 146097) * 3) / 4 -38;
        long e = 4 * f + 3;
        long g = e % 1461 / 4;
        long h = 5 * g + 2;
        long day = (h % 153) / 5 + 1;
        long month = (h / 153 + 2) % 12 + 1;
        long year = (e / 1461) - 4716 + (12 + 2 - month) / 12;
        
        String era = "";
        if (year < 0) {
          era = " B.C.";
          year = Math.abs(year);
        }else {
          era = " A.D.";
        }

        // return  ((month < 10) ? "0" : "") + month + "." + ((day < 10) ? "0" : "") + day   + "." + year + era;
        int monthInt = (int) month;
        Month monthName = Month.of(monthInt); 
        String padedYear = String.format("%04d", year);
        return  monthName + " " + ((day < 10) ? "0" : "") + day   + ", " + padedYear + era;
    }

    public long getJulianDate() {
        return julianDate;
    }

    public void setJulianDate(long julianDate) {
        if(julianDate >= 0)
            this.julianDate = julianDate;
        else
            throw new InvalidParameterException("Julian Date has to be a number greater that or equal to 0");
    }
}