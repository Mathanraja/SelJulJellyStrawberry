package week2.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
//	int[] friendsName = new int[10];
	List<String> browserNames = new ArrayList<String>();
	browserNames.add("Google Chrome");
	browserNames.add("FireFox");
	browserNames.add(1,"IE");
	browserNames.add("Safari");
	browserNames.add("FireFox");
	browserNames.add(0,"Opera");
	System.out.println(browserNames);
	browserNames.remove("FireFox");
//	browserNames.clear();
	System.out.println("To check weather the list is empty: "+ browserNames.isEmpty());
	System.out.println(browserNames);

	System.out.println("Size of the list: "+ browserNames.size());
	System.out.println("To Check in list: "+ browserNames.contains("IE"));
	System.out.println("To get a value from a list: "+ browserNames.get(2)+browserNames.get(3));
	
	
	
	
	
	
	
	
	
	
		/*
		 * for (String eachBrowser : browserNames) { System.out.println(eachBrowser); }
		 */
	
}
}
