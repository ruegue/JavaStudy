package ch11;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String) e.nextElement();
			System.out.println(element +" " + prop.getProperty(element) );
		}
		
		System.out.println(prop);
	}

}
