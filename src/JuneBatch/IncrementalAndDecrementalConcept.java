package JuneBatch;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {
		
		
//1. Post Increment
		
		int m = 1;
		System.out.println(m); //1
		int n = m+1;
		int p = m++; // post increment - first it will give p value to n then increment value of d
		System.out.println(n);// 2
		
		System.out.println(m); //2 
		System.out.println(p);//1
		
		int d = -1;
		int e = d++; // post increment - first it will give original d value to e then increment value of d.
		
		System.out.println(d); //0
		System.out.println(e); // -1
		
//2. Pre Increment
		
		int j = 1;
		int k = ++j; // Pre-Increment - First it will increase value of J then give to K
		
		System.out.println(j); //2
		System.out.println(k);//2
		
		
		int h = -10;
		int g = ++h; // Pre-Increment 
		
		System.out.println(h); //-9
		System.out.println(g); //-9
		
// 3. Post Decrement
		
		int a =2;
		int b= a--; // post decrement - First a value is assign to b then decrease by 1
		System.out.println(a); //1
		System.out.println(b); //2
		
		int x = -100;
		int y = x--; //post decrement
		
		System.out.println(x);// -101
		System.out.println(y); //-100
		
//4. pre decrement
		
		int s = -1;
		int t = --s; // pre decrement
		
		System.out.println(s); //-2
		System.out.println(t); //-2
		
		int u =-89;
		int v = --u;
		
		System.out.println(u+1); //-89 - (-90+1)
		System.out.println(v+1); //-89  - (-90+1)
		
		int i =9;
		
		//System.out.println(i/0); // returns - Arithmetic Exception - Any thing by zero is Exception ( but mathematically it is infinity)
		
		System.out.println(0/i); // 0 - Zero by anything is zero
		
		System.out.println(i/2); // 4 - since int holds only integer values (9/2 = 4.5 : int will take 4)
		
		System.out.println(7/2); // 3 - system automatically consider int/int if we not mention any data type
		
		
		
		
		
		
		
		
		
		

	}

}
