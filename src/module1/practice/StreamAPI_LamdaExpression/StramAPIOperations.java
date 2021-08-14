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
		
		list.forEach(e->System.out.println(e.getName().substring(1,2)));
		
		//Age greater than 60
		List<Employee> rlist = list.stream().filter(e->e.getAge()>60).collect(Collectors.toList());
		
		System.out.println("-------------------------");
		rlist.forEach(System.out::println);
		   
		//count number Age>60
		Long count = list.stream().filter(e->e.getAge()>60).collect(Collectors.counting());
		System.out.println("-------------------------"+ count);
		
		//sum of ages >= 60
		Integer sumOfAge = list.stream().filter(e->e.getAge()>=60 && e.getName().substring(1,2).equalsIgnoreCase("A"))
				.mapToInt(e->e.getAge()).sum();
		System.out.println("Sum Age :"+sumOfAge);
		
		//Sum of ages >= 60
		Integer sumA = list.stream().filter(e->e.getAge()>=60).map(e->e.getAge()).reduce(0, (a,b)->a+b);
		System.out.println("Using reduce "+sumA); //we can't use reduce() behind filter(); map() is needed
		
	//Avg of ages
		
		//Type 1
		OptionalDouble avgA = list.stream().mapToInt(e->e.getAge()).average();
		System.out.println("Avg age : "+avgA.getAsDouble());
		
		//Type 2
		Double avgA1 = list.stream().mapToInt(e->e.getAge()).average().getAsDouble();
		System.out.println("Avg age : "+avgA1);
//--------------------------------------------------------------------------------------------------
		
		
		System.out.println("-------------------------"+ count);
		
		//sort according last digit
		List<Employee> backSortList = list.stream().sorted(Comparator.comparing(e->e.getAge()%10)).collect(Collectors.toList());		
		backSortList.forEach(System.out::println);
		
		//sort according last char + reversed order
		System.out.println("-------------------------"+ count);
		List<Employee> lastCharofName = list.stream()
				.sorted(Comparator.comparing(e->e.getName().substring(e.getName().length()-1),Comparator.reverseOrder())).collect(Collectors.toList());
		lastCharofName.forEach(System.out::println);
		
		//orElse()
		
		//firstData()
		
		
 } 
}