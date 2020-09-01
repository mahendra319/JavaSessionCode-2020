package assignment;

public class AlphabetOrNot {
	
	public void verifyAlphabetOrNot(char ch) {
		if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')){
			System.out.println("Alphabet: " + ch);
		}else {
			System.out.println("Non Alphabet: "+ ch);
		}
	}

	public static void main(String[] args) {
		
		AlphabetOrNot alpha = new AlphabetOrNot();
		alpha.verifyAlphabetOrNot('$');
		
		
		

	}

}
