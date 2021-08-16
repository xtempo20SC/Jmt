package module1.practice.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparators_Max_Min_with_SteamAPI {

public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(32,"Ram",65));
		list.add(new Employee(66,"Shyam",24));
		list.add(new Employee(45,"Jadu",90));
		list.add(new Employee(98,"Madhu",65));
		list.add(new Employee(30,"Amal",90));
		
		//Max using Comparator & Stream API
		
		Employee eMax = list.stream().max(Comparator.comparing(Employee::getAge)
				 .thenComparing(Employee::getName,Comparator.reverseOrder())).get();
		
		
		System.out.println(eMax);
		//Employee [id=30, name=Amal, age=90]
		
		
		
		//Min using Comparator & Stream API
		
		Employee eMin = list.stream().min(Comparator.comparing(Employee::getAge)).get();
		
		System.out.println(eMin);	
		//Employee [id=66, name=Shyam, age=24]
   }
}
