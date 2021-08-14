package module1.practice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

class sortByEmployeeName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class sortByEmployeeAge implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-(o2.getAge());
	}
	
}
public class Comparator_Sorting_A_Normal {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(32,"Ram",65));
		list.add(new Employee(66,"Shyam",24));
		list.add(new Employee(45,"Jadu",90));
		list.add(new Employee(98,"Madhu",65));
		list.add(new Employee(30,"Amal",90));
		
		Collections.sort(list,new sortByEmployeeName());
		
//		List<Employee> rlist = list.stream()
//		.sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
		Employee e = Collections.max(list,new sortByEmployeeAge());
		
		System.out.println("Max Employee : "+ e);
		
		list.forEach(System.out::println);
	}

}
