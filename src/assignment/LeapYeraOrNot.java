package assignment;

public class LeapYeraOrNot {

	/**
	 * A leap year is exactly divisible by 4 except for century years (years ending with 00). 
	 * The century year is a leap year only if it is perfectly divisible by 400.
	 * @param year
	 */
	public void verifyLeapYear(int year) {
if (year % 4 ==0) {
			
			if(year % 100 ==0) {
				
				if(year % 400 ==0) {
				System.out.println("leap Year: "+year);
				}
				else {
				System.out.println("non Leap year: "+year);
				}
			}
			else {
				System.out.println("Leap Year: "+year);
			}
		}
		else {
			System.out.println("non leap Year: "+ year);
		}

	}
	public static void main(String[] args) {
		
		LeapYeraOrNot lYear = new LeapYeraOrNot();
		lYear.verifyLeapYear(2008);
		
		
	}

}
