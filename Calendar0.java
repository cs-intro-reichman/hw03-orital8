/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		
		if  
	(	 ((year % 400) == 0) || (((year % 4) == 0 ) && ((year % 100) != 0) )   ){
			commonOrLeap = "leap";
		}
		
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}



	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		boolean leapYear = false ;
		if (isLeapYear(year) )
		leapYear  = true;
		
		for(int i = 1; i <= 12 ; i++){
			if (i == 4 || i == 6 || i ==9 || i == 11)
				 System.out.println("Month "+i+" has 30 days");
			if ( i == 2 && leapYear == true)
				  System.out.println("Month "+i+" has 29 days");
			if ( i == 2 && leapYear == false)
				  System.out.println("Month "+i+" has 28 days");
			  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i== 10 || i == 12)
				 System.out.println("Month "+i+" has 31 days");
		} 
		
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    if  
	(	 ((year % 400) == 0) || (((year % 4) == 0 ) && ((year % 100) != 0) )   )
			return true;
		else
		
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		boolean leapYear = false ;
		int nDays = 0;
		if (isLeapYear(year) )
		leapYear  = true;
		
			if (month == 4 || month == 6 || month ==9 || month == 11)
				 nDays = 30;
			if ( month == 2 && leapYear == true)
				 nDays = 29;
			if ( month == 2 && leapYear == false)
				 nDays = 28;
			  if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month== 10 || month == 12)
				 nDays = 31;
		 
		return nDays;
	}
}

