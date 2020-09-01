package assignment;

public class FactorialProgram {

	public static void main(String[] args) {
		
		int num = 5;
		long factorial = 1;
		if(num==0) {
			System.out.printf(" %d! = %d", num,num);
		}else {
			for (int i=1; i<=num; i++) {
				
				factorial = factorial * i;
			}
			System.out.println("Factorial of: \n");
			System.out.printf("%d! = %d", num, factorial);
			System.out.format("\n%d! = %d", num, factorial);
		}
		
		
		
		
	}

}
