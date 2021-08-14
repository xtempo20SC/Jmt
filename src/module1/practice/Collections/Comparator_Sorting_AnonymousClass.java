package module1.practice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator_Sorting_AnonymousClass {

public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(32,"Ram",65));
		list.add(new Employee(66,"Shyam",24));
		list.add(new Employee(45,"Jadu",90));
		list.add(new Employee(98,"Madhu",65));
		list.add(new Employee(30,"Amal",63));
		
		Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.getAge()==o2.getAge())
					return o1.getName().compareTo(o2.getName());
				return o1.getAge()-o2.getAge();
			}
		});
		
		
		list.forEach(System.out::println);
	}
}
