package JuneBatch;

public class SplitConcept {

	public static void main(String[] args) {
		
		String str = "Ruby-Python-Java-JavaScript";
		
		String [] lang = str.split("-");
		
		System.out.println(lang.length);
		
		for (String s : lang) {
			System.out.println(s);
			
		}
		
		
		String cont = "tom@gmail.com;tom;peter;SDET;789654789";
		
		String [] info = cont.split(";");
		
		//for (String s : info) {
			
			//System.out.println(s);
			
		//}
		
		
		System.out.println(info[0]);
		
		String firstName = getEmpData().split(";")[0];
		System.out.println(firstName);
		
		
		
	}
	
	public static String getEmpData() {
		
		String fn = "rekha";
		String ln = "kotike";
		String pno= "9999";
		String data = fn+";"+ln+";"+pno;
		return data;
	}

}
