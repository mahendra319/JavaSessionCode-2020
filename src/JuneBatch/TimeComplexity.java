package JuneBatch;

public class TimeComplexity {

	public static void main(String[] args) {
		
//Time Complexity (TC) is denoted by --> O(n) or Big O(n)
		
		//n means how many times it executed
		
		//TC means, how much time it will take to execute a function or line of code or program 

		int i =1;
		System.out.println(i); // TC --> O(1)
		
		String s = "Selenium";
		
		System.out.println(s+"testing"); //TC -->O(1)
		
		
		for(int k =1; k<=10; k++) { 
			
			System.out.println(k);
		}
		//TC --> O(n)
		//Calculation: 1 + n + n + n --> 1+3n -->3n-->O(n)
		//it is called Linear equation
		//O(n) graph is linear
		
		for (int m=1; m<=10; m++) {
			
			for (int n=1;n<=10;n++) {
				
				System.out.println(m+""+n);
			}
		} // TC--> O(n^2)
		//calculation: (1 + n + n + n  )*(1 + n + n + n ) -->(1+3n)*(1+3n)
		      //1 + 9n^2 + 6n --> Quadratic Equation 
		         //9n^2 + 6n --> n^2 + n--> O(n^2)
		
		
		//if we have 3 for loops then TC--> O(n^3)
		
		
		
		
		
		
		
	}

}
