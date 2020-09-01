package JuneBatch;

public class LoopConcepts {

	public static void main(String[] args) {
		
//while loop: print 1 to 10
		
		int i=1; // Initialisation
		while(i<=10) { //Conditional
			System.out.println(i);
			//++i;
			//i++;
			i=i+1; //incremental/decremental
		}
		
//print Odd numbers
		System.out.println("Print Odd numbers................");
		int j =1;
		while(j<=10) {
			System.out.println(j);
			j=j+2;
		}
		System.out.println("Print Even numbers ................");
		int k=0;
		while(k<=10) {
			System.out.println(k);
			k=k+2;
		}
		
		int a =1;
		while(a<=20) {
			if(a % 2 ==0) {
				System.out.println("Even Number: " + a);
			}
			a++;
		}
		
		/*
		 * while(true) { System.out.println("Welcome Home"); //infinite loop }
		 */
		
		boolean flag = true;
		while(flag) {
			System.out.println("\nWelcome to Java");
			flag = false;
		}
		
//2. For Loop: print 1 to 10. For loop is used to list or array operations
		System.out.println(".............for loop..............");
		for(int b=1;b<=10;b++) {
			System.out.println(b);
		}
		/*
		 * for(; ;) { System.out.println("infinite loop"); } // infinite loop
		 */
		System.out.println("..........print odd number ..............");
		for(int b=1;b<=10;b=b+2) {
			System.out.println(b);
		}
		System.out.println("..............print even numbers..............");
		for (int e=2;e<=10;e=e+2) {
			System.out.println(e);
		}
		
		/*
		 * for(int d=0;d<10; ) { System.out.println("infinite loop"); } // infinite loop
		 */
		
		/*
		 * for(int d=0; ; d++) { System.out.println("is it infinite loop"); } // infinite loop
		 * 
		 */
		/*
		 * for(int d=0; true; d++) { System.out.println("is it infinite loop?"); } // infinite loop
		 */
		boolean h1 = true;
		for(int d=0; h1; d++) {
			System.out.println("Hello");
			h1=false;
		}
		System.out.println("............print char a-z using loop.............");
		for(char c = 'a'; c<'z';c++) {
			System.out.println(c);
		}
		System.out.println("..............................print A to Z and  a to z...................");
		for (char ch = 'A'; ch<'z'; ch++) {
			System.out.println(ch);
		}
		
//do while loop: 
		System.out.println("..........do while loop...................");
		int n =0;
		do {
			System.out.println(n);
			n++;
		}while(n<=10);
		
		int m =0;
		do {
			System.out.println("\n"+m);
			m++;
		}while(false);
		/*
		 * int l=0; do { System.out.println(l); }while(true); // infinite loop
		 */
System.out.println("............Can we use Double and Float values in loop: YES");
		for (double d = 1.5; d<10.5; d++) {
			System.out.println(d);
		}
		System.out.println("\n");
		for(float f = 1.2f; f<10; f++) {
			System.out.println(f);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
