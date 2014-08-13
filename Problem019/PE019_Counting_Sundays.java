import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Counting Sundays
 * Problem 19
 * 
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and November.
 * All the rest have thirty-one, Saving February alone, Which has twenty-eight,
 * rain or shine. And on leap years, twenty-nine. A leap year occurs on any year
 * evenly divisible by 4, but not on a century unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 */
public class PE019_Counting_Sundays {
	public static void main(String [] args) {
		Calendar startDate = GregorianCalendar.getInstance();
		startDate.set(Calendar.DATE, 1);
		startDate.set(Calendar.MONTH, Calendar.JANUARY);
		startDate.set(Calendar.YEAR, 1901);

		Calendar endDate = GregorianCalendar.getInstance();
		endDate.set(Calendar.DATE, 31);
		endDate.set(Calendar.MONTH, Calendar.DECEMBER);
		endDate.set(Calendar.YEAR, 2000);

		int result = 0;
		
		while (startDate.before(endDate)) {
			if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
					&& startDate.get(Calendar.DAY_OF_MONTH) == 1) {
				result++;
			}
			
			startDate.add(Calendar.MONTH, 1);
		}

		System.out.println(result);
	}
}
