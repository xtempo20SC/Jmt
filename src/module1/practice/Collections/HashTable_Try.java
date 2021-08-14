package module1.practice.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTable_Try {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new Hashtable<>();
		
		map.put(40, "Ram");
		map.put(1, "Shyam");
		map.put(8, "Jadu");
		map.put(7, "Madhu");
		
	   //map.put(null, "Robi");    <---Cannot invoke "Object.hashCode()" because "key" is null
		
		System.out.println(map);
		
		//contains method
		System.out.println(map.containsKey(40));
		System.out.println(map.containsValue("Amal"));
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		
		//TreeMap
		
       
	}
}
