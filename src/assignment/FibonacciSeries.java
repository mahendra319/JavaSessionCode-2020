package assignment;

public class FibonacciSeries {

//WAP to Display Fibonacci series for number of terms
/**
 * The Fibonacci series is a series where the next term is the sum of previous two terms
 * here num represents number of terms to display
 * @param num
 */
	public void generateFibonacciSeries(int num) {
		int t1=0;
		int t2=1;
		//int num = 10;
		System.out.println("Fibonacci  for the First "+num +" terms is:");
		for (int i = 1; i<=num; i++) {
			
			System.out.print(t1+",");
			int sum =t1+t2;
			t1=t2;
			t2=sum;
		}
	}
	
//WAP to display Fibonacci series upto given number
	public void generateFibonacciSeries1(int num) {
		int t1=0;
		int t2=1;
		System.out.println("\nFibonacci Series Upto "+num +" is:");
		while(t1<=num) {
			System.out.print(t1+",");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}
	}
	public static void main(String[] args) {
		
		FibonacciSeries fb = new FibonacciSeries();
		fb.generateFibonacciSeries(5);
		fb.generateFibonacciSeries1(100);
		}
		
	}


