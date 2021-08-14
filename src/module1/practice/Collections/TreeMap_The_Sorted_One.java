package module1.practice.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_The_Sorted_One {

	public static void main(String[] args) {
    Map<Integer,String> tmap = new TreeMap<>();
		
		tmap.put(40, "Ram");
		tmap.put(1, "Shyam");
		tmap.put(8, "Jadu");
		tmap.put(7, "Madhu");  
		// tmap.put(null, "Robi");
		
		System.out.println(tmap);
	}
}
