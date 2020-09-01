package oops.abstractconcept;

public class ICICITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LoginPage lp = new LoginPage();
		lp.header();
		lp.title();
		lp.display(); //coming from parent class since display method not override
		lp.doLogin("admin", "admin123");
		System.out.println(lp.tout);
		
		//static vars
		System.out.println(Page.timeout);
		
		//Top Casting
		//child class object can be refereed by Parent abstract class reference variable:
		Page p = new LoginPage();
		
		p.header();
		p.title();
		p.display();
		System.out.println(p.tout);
		
		
		

	}

}
