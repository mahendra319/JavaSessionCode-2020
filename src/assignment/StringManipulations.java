package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulations {

	public static void main(String[] args) {

//1.  Write a program to check two different strings equality.
		String str1 = "Java Practice";
		if(str1.equals("Java Sessions")) {
			System.out.println("Strings Matched");
		}
		else {
			System.out.println("Strings are not matched");
		}
		
//2. Remove all  spaces in a String . For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		String s="      Hello      Everyone     ";
		String s1=s.trim();
		System.out.println(s1.replace(" ","")); //HelloEveryone
		//OR
		System.out.println(s.trim().replace(" ", ""));//HelloEveryone
	
//3. Write a program that will  print out last character and first character of a word.
		String s2 ="Java World";
		System.out.println(s2.charAt(0)); //J - Lowest Index
		System.out.println(s2.charAt(s2.length()-1)); //d - Highest Index
		
//4. Write a program to verify a word or a character contains in the sentence.
		if(s2.contains("World")) {
			System.out.println("Available in String");
		}
		else {
			System.out.println("Not available in String");
		}

//5.Write a function/ method to reverse your own name.
		String s3="Mahendra";
		int len = s3.length();
		String rName = "";
		for(int i=len-1; i>=0;i--) {
			
			rName = rName+s3.charAt(i);
		}
		System.out.println(rName.toUpperCase()); //ARDNEHAM
		
//6. Write a program that gives you last half of the string.
		String s4 = "Java World";
		System.out.println(s4.substring(s4.indexOf(" ")+1)); //World
		
//7.Write a program to get the 3rd  “ e “ of the string .For example: “Welcome to Naveen Automation Lab ! “.
		String s5= "Welcome to Naveen Automation Lab !" ;
		//System.out.println(s5.indexOf("e"));
		//System.out.println(s5.indexOf("e", s5.indexOf("e")+1));
		
		System.out.println(s5.indexOf("e", s5.indexOf("e", s5.indexOf("e")+1)+1)); //14
		
//8. Write a method which gives index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.
		System.out.println(s5.indexOf("Selenium")); //-1
		System.out.println(s5.indexOf("Naveen")); // 11
		
//9. Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop) .
		
		
//10. Assume that a string consists of 3 words, print out the middle one. 
		
//13. get only numeric part from this String: 
		
				String st1 = "Your transaction id is: 1550569";
				
				System.out.println(st1.replaceAll("[^0-9]", ""));
		
		
//11. get only numeric part from this String: 
		String st = "your transaction id is: 12345 and reference id is 34567";
		
		String trandId= st.substring(st.indexOf("is:")+4,st.indexOf("and")-1);
		
		String refId = st.substring(st.indexOf("is", st.indexOf("is")+1)+3);
		
		System.out.println("Transaction id id: "+trandId + "\nReference Id is: "+refId);
		
		// OR
		
		Pattern p = Pattern.compile("\\d+"); // '\\d+' represents numeric string in java
		Matcher m = p.matcher(st);
		
		//System.out.println(m.find());
		//System.out.println(m.find());
				
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
//12.Write a program to get the 4th  “ e “ of the string .For example: “Welcome to Naveen Automation Lab ! “.
				
		//String s6= "Welcome to Naveen Automation Lab !" ;
				
		//System.out.println(s5.indexOf("e")); //1 -1st occurrence
		//System.out.println(s5.indexOf("e", s5.indexOf("e")+1)); //6 - 2nd occurrence
				
		System.out.println(s5.indexOf("e", s5.indexOf("e", s5.indexOf("e")+1)+1)); //14	- 3rd occurrence 
		
		System.out.println(s5.indexOf("e", (s5.indexOf("e", s5.indexOf("e")+1)+1))+1); // 15 - 4th occurrence
		

		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
