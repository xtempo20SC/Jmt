package module1.practice.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Get_KeySet_from_HashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(40, "Ram");
		map.put(1, "Shyam");
		map.put(8, "Jadu");
		map.put(7, "Madhu");
		map.put( null, "Madhu");
		
		//default print
		
		System.out.println(map);
		
		
		//fetching key set and iterate
		System.out.println("-------fetching key set and iterate");
		Set<Integer> set = map.keySet();
		
		for(Integer i : set)
		{
			System.out.println(i+" "+map.get(i));
		}
		
		//printing by Key Set
		System.out.println("-------printing by key Set");
		for(Integer k : map.keySet())
		{
			System.out.println(k+" "+map.get(k));
		}
		
		//printing by entry Set
		System.out.println("-------printing by entry Set");
		for(Map.Entry<Integer,String> resultMap : map.entrySet())
		{
			System.out.println(resultMap.getKey()+" "+resultMap.getValue());
		}
		
		
		
		//------------------------------=
		//contains method
				System.out.println(map.containsKey(40));
				System.out.println(map.containsValue("Amal"));
				System.out.println(map.isEmpty());
				System.out.println(map.keySet());
				System.out.println(map.values());
	}
	
}
