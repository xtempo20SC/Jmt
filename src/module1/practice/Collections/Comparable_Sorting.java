package module1.practice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private double marks;
	
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student o) {
		if(o.marks>this.marks)
			return 1;
		if(o.marks<this.marks)
			return -1;
		else
			return this.name.compareTo(o.name);
	}
}

public class Comparable_Sorting
{
	public static void main(String[] args) {
		Student s1 = new Student(23,"Ramu",78.00);
		Student s2 = new Student(67,"Shyam",76.00);
		Student s3 = new Student(22,"Jodu",99.00);
		Student s4 = new Student(98,"Modhu",99.00);
		Student s5 = new Student(12,"Ram",89.05);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
	}
}