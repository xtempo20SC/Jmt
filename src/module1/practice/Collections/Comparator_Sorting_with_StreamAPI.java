package module1.practice.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator_Sorting_with_StreamAPI {

public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(32,"Ram",65));
		list.add(new Employee(66,"Shyam",24));
		list.add(new Employee(45,"Jadu",90));
		list.add(new Employee(98,"Madhu",65));
		list.add(new Employee(30,"Amal",63));

		
 //Comparator.comparing()
 List<Employee> rlist0 = list.stream().sorted(Comparator.comparing(Employee::getAge))
				                                                   .collect(Collectors.toList());
 
 
 
 //.thenComparing()
 List<Employee> rlist1 = list.stream().sorted(Comparator.comparing(Employee::getAge)
				                  .thenComparing(Employee::getName)).collect(Collectors.toList());
		
	
 
  //.reversed()
  List<Employee> rlist2 = list.stream()
	.sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
  
  
  
  //,Comparator.reverseOrder()
  List<Employee> rlist3 = list.stream()
				.sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())
				.thenComparing(Employee::getName))
                .collect(Collectors.toList());
  
	
		
  //.thenComparing()+.reversed()
  List<Employee> rlist4 = list.stream().sorted(Comparator.comparing(Employee::getAge)
		         .thenComparing(Employee::getName).reversed())
                .collect(Collectors.toList());
  
  List<Employee> rlist5 = list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()
	         .thenComparing(Employee::getName))
         .collect(Collectors.toList());
  
  
  List<Employee> rlist51 = list.stream().sorted(Comparator.comparing(s->s.getAge(),Comparator.reverseOrder())).collect(Collectors.toList());
  
  
  
  //.thenComparing()+,Comparator.reverseOrder()		
  List<Employee> rlist6 = list.stream()
			.sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())
			.thenComparing(Employee::getName).reversed())
          .collect(Collectors.toList());
		rlist3.forEach(System.out::println);
 }
}
