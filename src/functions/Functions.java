package functions;

import java.util.Enumeration;
import java.util.Vector;

public class Functions {
	Vector<String> items = new Vector<String>();
	
	public void addItems(String item) {
		items.add(item);
	}
	
	public void printItems() {
		if(items.size() >= 1) {
			Enumeration enu = items.elements();
			while (enu.hasMoreElements()) {
	            System.out.println(enu.nextElement());
	        }
			//System.out.println(items.);
		}
		else {
			System.out.println("There are not items in your cart");
		}
	}
}
