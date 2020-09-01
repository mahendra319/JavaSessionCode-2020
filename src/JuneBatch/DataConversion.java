package JuneBatch;

public class DataConversion {

	public static void main(String[] args) {
		//
		String a = "100";
		
		System.out.println(a+20);//10020
		
		int i = Integer.parseInt(a);
		System.out.println(i+20); //120
		
		String x = "10.55";
		
		System.out.println(x+20);//10.5520
		
		double d = Double.parseDouble(x);
		System.out.println(d+20); // 30.55
		
		String y = "100A";
		System.out.println(y+20);//100A20
		
		//System.out.println(y.split("", y.length()-1));
		
		
		//int k = Integer.parseInt(y);
		//System.out.println(k+20); // NumberFormatException
		
		//int to String or double to String
		
		int  b = 20;
		System.out.println(b+20);// 40
		//valueOf() - it will return equivalent String value
		String s = String.valueOf(b);
		System.out.println(s+20); //2020
		
		
		

	}

}
