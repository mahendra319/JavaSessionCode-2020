package assignment;

import java.util.ArrayList;

public class ConstructorBrowser {
	String bName;
	String bVendor;
	double bVersion;
	ArrayList<String> pluginList;

//Constructor with all class variables
	public ConstructorBrowser(String bName, String bVendor, double bVersion, 
			ArrayList<String> pluginList) {
		super();
		this.bName = bName;
		this.bVendor = bVendor;
		this.bVersion = bVersion;
		this.pluginList = pluginList;
	}
//constructor with partial class variables
	public ConstructorBrowser(String bName, double bVersion, ArrayList<String> pluginList) {
		this.bName = bName;
		this.bVersion = bVersion;
		this.pluginList = pluginList;
	}
	public static void main(String[] args) {
		ArrayList<String> pListChrome = new ArrayList<String>();
		pListChrome.add("uBlock Origin");
		pListChrome.add("Click & Clean");
		pListChrome.add("HTTPS Everywhere");
		pListChrome.add("PrivacyBadger");
		ArrayList<String> pListFirefox = new ArrayList<String>();
		pListFirefox.add("ABP");
		pListFirefox.add("Ghostery");
		pListFirefox.add("HTTPS Everywhere");
		pListFirefox.add("uMatrix");
		ArrayList<String> pListSafari = new ArrayList<String>();
		pListSafari.add("AddBlock");
		pListSafari.add("AutoPaerize");
		pListSafari.add("ClickToPlugIn");
		pListSafari.add("DuckDuckGo");
				
		ConstructorBrowser b1 = new ConstructorBrowser("Chrome","Google",83.0,pListChrome);
		System.out.println("......all Class Variables.....Chrome Browser.............");
		System.out.println(b1.bName+" "+b1.bVendor+" "+b1.bVersion+" "+b1.pluginList);
		System.out.println("\n........all Class Variables......Firfox Browser.................");
		ConstructorBrowser b2 = new ConstructorBrowser("Firefox","Mozilla",77.0,pListFirefox);
		System.out.println("Browser Name: "+b2.getBrowserName());
		System.out.println("Browser Vendor: "+b2.getBrowserVendor());
		System.out.println("Browser Version: "+b2.getBrowserVersion());
		//System.out.println(b2.getPluginList());
		System.out.println("\nPluglns for Firfox....");
		for (String list : b2.getPluginList()) {
			System.out.println(list);
		}
		System.out.println("\n.....Partial Class Variables.............");
		ConstructorBrowser b3 = new ConstructorBrowser("Safari",12.1,pListSafari);
		System.out.println("Browser Name: "+b3.getBrowserName());
		System.out.println("Browser Version: "+b3.getBrowserVersion());
		for (String sList : b3.getPluginList()) {
			System.out.println(sList);
		}
	}
	public String getBrowserName() {
		return bName;
	}
	public String getBrowserVendor() {
		return bVendor;
	}
	public double getBrowserVersion() {
		return bVersion;
	}
	public ArrayList<String> getPluginList() {
		return pluginList;
	}
}
