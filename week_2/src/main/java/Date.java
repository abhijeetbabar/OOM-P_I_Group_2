/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Group2
 */
public class Date  {

    private int day;
    private int month;
    private int year;
    private int mJulianNumber;

    public int getmJulianNumber() {
        return mJulianNumber;
    }

  
    private Date date;
    public Date(){
    }

    public Date(int day, int month, int year) {
      if(!isValidDate(day, month, year)) 
            throw new IllegalArgumentException("Invalid Date");
      this.day = day;
      this.month = month;
      this.year = year;
      this.mJulianNumber = toJulianNumber(day,  month, year);
    }
    
     public Date( Date date){
         this.date = date;
     } 

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return month;
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
        if(!(month > 12)){
            
            
        if (month == 2) {
        return isLeapYear(year) ? (byte) 29 : (byte) 28;
        }else if (month == 4 || month == 6 ||month == 9 ||month == 11){
        return 30;
        }else {
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
        
        
        }else{
        return -1;
        }
    }


    private int toJulianNumber(int day, int month, int year) {
         return (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month - 2 - 12 * 
                ((month - 14)/12)))/12 - (3 * ((year + 4900 + (month- 14)/12)/100))/4 + day - 32075; 
    }
    
    private int[] fromJulianNumber(int mJulianNumber){
         int l = mJulianNumber + 68569;
        int n = (4 * l) / 146097;
        l = l - (146097 * n + 3) / 4;
        int i = (4000 * (l + 1)) / 1461001;
        l = l - (1461 * i) / 4 + 31;
        int j = (80 * l) / 2447;
        int day = l - (2447 * j) / 80;
        l = j / 11;
        int month = j + 2 - (12 * l);
        int year = 100 * (n - 49) + i + l;
        int[] a = new int[3];
        a[0] = day;
        a[1] = month;
        a[2] = year;
        return a;
    }
    
     public static Boolean isValidDate( int day, int month, int year ){
    	 //day range: 1-31
    	 if(day <= 0 || day >31)
    		 	return false;
    	 //Leap year or not
    	 boolean leap = isLeapYear(year);
         
    	//check Feb.	
    	 if(month == 2){
    		 if(leap && day > 29){
    			 return false;
    		 }else if(!leap && day > 28){
    			 return false;
    		 }
    		 return true;
    	 }
    	 //Initial days in different months
    	 int[] monList = {1,3,4,5,6,7,8,9,10,11,12};
    	 int[] dayList = {31,31,30,31,30,31,31,30,31,30,31};
    	 for(int i = 0; i < monList.length; i++){
    		 if(month == monList[i] && day <= dayList[i]){
    				 return true;
    		 }
    	 }
    	 return false;
     };

}
