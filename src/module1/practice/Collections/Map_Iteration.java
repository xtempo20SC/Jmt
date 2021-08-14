package module1.practice.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Iteration {

public static void main(String[] args) {
		
		Map<Integer,Employee> map = new HashMap<>();
		
		map.put(1, new Employee(32,"Ram",65));
		map.put(2, new Employee(66,"Shyam",24));
		map.put(3, new Employee(45,"Jadu",90));
		map.put(4, new Employee(98,"Madhu",65));
		map.put(5, new Employee(30,"Amal",90));
		
		for(Map.Entry<Integer, Employee> m :map.entrySet())
		{
			
			System.out.println(m.getValue()+" "+m.getKey());
		}
		
		System.out.println("-------------------");
		
		for(int i=0; i<map.size(); i++)
		{
		
			System.out.println(map.get(i+1));
		}
 }
}
