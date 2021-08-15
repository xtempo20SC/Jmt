
package module1.practice.StreamAPI_LamdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;



class Employee
{
	private int id;
	private String name;
	private int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class StramAPIOperations
{
public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(32,"Ram",67));
		list.add(new Employee(66,"Shyam",24));
		list.add(new Employee(4,"Jadu",91));
		list.add(new Employee(98,"Madhu",65));
		list.add(new Employee(30,"Amal",90));
		list.add(new Employee(30,"Ashit",90));
		
		list.forEach(e->System.out.println(e.getName().substring(1,2)));
		
		
		//Age greater than 60
		List<Employee> rlist = list.stream()
				.filter(e->e.getAge()>60)
				.collect(Collectors.toList());
		
		rlist.forEach(System.out::println);
		   
		
		//Count number Age>60
		Long count = list.stream()
				.filter(e->e.getAge()>60)
				.collect(Collectors.counting());
		
		System.out.println("Count : "+ count);
		
		
		//Get only names from Employee
		List<String> names = list.stream()
				.map(e->e.getName())
				.collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
		//Name starts with A
		 
		  //Type 1
		List<String> nameList01 = list.stream()
				.filter(e->e.getName().startsWith("A"))
				.map(e->e.getName()+"-"+e.getAge())
				.collect(Collectors.toList());
		
		nameList01.forEach(System.out::println);
		
		  //Type 2
		List<Employee> nameList1 = list.stream()
				.filter(e->e.getName().startsWith("A"))
				.collect(Collectors.toList());
		
		nameList1.stream().map(e->e.getName()).forEach(System.out::println);
		
		
		//name ends with M
		List<Employee> nameList2 = list.stream()
				.filter(e->e.getName().endsWith("m"))
				.collect(Collectors.toList());
		
		nameList2.stream().map(e->e.getName()+" - "+e.getAge()).forEach(System.out::println);
		
		
		//( filter + sorted ) sort according last digit & name>3
		List<Employee> backSortList1 = list.stream()
				.filter(e->e.getName().length()>3)
				.sorted(Comparator.comparing(e->e.getAge()%10))
				.collect(Collectors.toList());	
		
		backSortList1.forEach(System.out::println);
				
		//( map + sorted ) unable to do
		
		//sort according last char + reversed order
		List<Employee> lastCharofName = list.stream()
		         .sorted(Comparator.comparing(e->e.getName().substring(e.getName().length()-1),Comparator.reverseOrder()))
		         .collect(Collectors.toList());
		
		lastCharofName.forEach(System.out::println);
				
		
		//sum of ages >= 60 & 2nd word of name is 'a' --> using .sum()
		Integer sumOfAge = list.stream()
				.filter(e->e.getAge()>=60 && e.getName().substring(1,2).equalsIgnoreCase("A"))
				.mapToInt(e->e.getAge())
				.sum();
		
		System.out.println("Sum Age :"+sumOfAge);
		
		
		//Sum of ages >= 60 & 2nd word of name is 'a' ---> using .reduce(...)
		Integer sumA = list.stream()
				.filter(e->e.getAge()>=60 && e.getName().substring(1,2).equalsIgnoreCase("A"))
				.map(e->e.getAge())
				.reduce(0, (a,b)->a+b);  //we can't use reduce() behind filter(); map() is needed
		
		System.out.println("Using reduce "+sumA); 
		
	
		//Avg of ages
		
		  //Type 1
		OptionalDouble avgA = list.stream()
				.mapToInt(e->e.getAge())
				.average();   //it returns Optional;
		
		System.out.println("Avg age : "+avgA.getAsDouble());
		
		  //Type 2
		Double avgA1 = list.stream()
				.mapToInt(e->e.getAge())
				.average().getAsDouble();
		
		System.out.println("Avg age : "+avgA1);
		
		
		//findFirst()
		
		  //Type 1
		Integer fage = list.stream()
				.filter(e->e.getAge()%2==0)
				.map(e->e.getAge())
				.findFirst()     //it returns Optional; so we have to use .get() 
				.get();          //output : 24
				
		
		System.out.println(fage);
		
		//orElse() -- Type 2
		Integer foage = list.stream()
				.filter(e->e.getAge()%11==0)
				.map(e->e.getAge())
				.findFirst()    //it returns Optional orElse() can replace get()  
				.orElse(0);     //output : 0
				                // orElse() only can be used with Optional<> output is null
		
		System.out.println(foage);
		
		
		
 } 
}