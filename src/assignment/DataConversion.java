package assignment;

public class DataConversion {

	public static void main(String[] args) {
		
		
		String s = "100A";
		
		String str = s.replaceAll("[^0-9]","");
		System.out.println(str); // 100 - String value
		System.out.println(str+20);//10020 - string value
		
		int x = Integer.parseInt(str);
		System.out.println(x); // 100 - int value
		System.out.println(x+25);// 125 - int value

	}

}
