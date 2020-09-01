package JuneBatch;

public class StringManipulations {

	public static void main(String[] args) {
		
		
		String str = "This is my java code and i am so happy";
//Lowest Index =0; and Highest Index = Length - 1
		System.out.println(str.length());

		int len = str.length();
		System.out.println("Length of String is: "+len);
		
		System.out.println("Highest Index is: "+ (len-1));
		System.out.println("Lowest Index is: "+0);
		
		
		System.out.println(str.charAt(0)); //T
		System.out.println(str.charAt(5));//i
		
		System.out.println(str.charAt(37)); //y
		//System.out.println(str.charAt(38));// StringIndexOutOfBoundsException
		//System.out.println(str.charAt(len)); //StringIndexOutOfBoundsException
		
		System.out.println(str.charAt(len-1));//y
		
		//System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('j')); //11
		System.out.println(str.indexOf('s'));//3 this is first occurance of S. If we want find second occurance of S then 
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1)); // 30 third occurrence of S
		
		System.out.println(str.lastIndexOf('s')); //30 returns last occurrence of specified char
		
		System.out.println(str.indexOf("java")); // 11 returns position of substring
		
		System.out.println(str.indexOf("Testing")); // returns -1. since substring not available in main string. in this case returns default value -1
		
		System.out.println(str.toUpperCase()); // converted all into uppercase
		System.out.println(str.toLowerCase());// coverted all into lowercase
		
//trim()		
		String str1 = "  Hello World  ";
		System.out.println(str1.trim());//output: Hello World - remove before space and after space for a given string
//replace
		String str2 = "Hello World";
		System.out.println(str2.replace(" ", "")); // Output: HelloWorld
		System.out.println(str2.replace("World", "Java")); //Output: Hello Java
		
		String date = "01-01-2020";
		System.out.println(date.replace("-", "/"));//Output: 01/01/2020
		 
//Contains(charSequences) - returns boolean value true/false
		String usrName = "Hello Java";
		System.out.println(usrName.contains("Java")); //Output: true
		System.out.println(usrName.contains("Selenium"));// Output: false
	
//equals
		System.out.println(usrName.equals("Hello Java"));// true
		System.out.println(usrName.equals("hello Java")); // false
		System.out.println(usrName.equalsIgnoreCase("hello java"));// true - it will ignore case
		System.out.println(usrName.equalsIgnoreCase("Hellojava"));// false - Space matters. 
		
//subString
		String str3 = "Your transaction id is 210230";
		System.out.println(str3.substring(5, 10));// output:trans - it will exclude 10 position. (always endindex-1)
		
		System.out.println(str3.substring(5)); //Output:transaction id is 210230
		//if we want only id 
		System.out.println(str3.substring(str3.indexOf("is")+3));//Output:210230
		//OR
		System.out.println(str3.substring(str3.indexOf("is")+3, str3.length()));//Output: 210230 - which means str3.subString(23,31) - which will exclude end index so output:210230
		String trsId = str3.substring(str3.indexOf("is")+3, str3.length());
		System.out.println(trsId);
		
		
		
		
		
	}

}
