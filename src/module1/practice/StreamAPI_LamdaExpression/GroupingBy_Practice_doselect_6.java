package module1.practice.StreamAPI_LamdaExpression;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Candidate{
  //Write Your Code Here..

   private String name;
   private int id;
   private int age;
   private String gender;
   private String department;
   private int yearOfJoining;
   private double  salary;

  public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
  {
    this.name = name;
    this.id = id;
    this.age = age;
    this.gender = gender;
    this.department = department;
    this.yearOfJoining = yearOfJoining;
    this.salary = salary;
  }

  public Candidate()
  {

  }
   public String getName()
   {
     return this.name;
   }
   public void setName(String name)
   {
      this.name = name;
   }

   public int getId()
   {
     return this.id;
   }
   public void setId(int id)
   {
      this.id = id;
   }

   public int getAge()
   {
     return this.age;
   }
   public void setAge(int age)
   {
      this.age = age;
   }

  public String getGender()
   {
     return this.gender;
   }
   public void setGender(String gender)
   {
      this.gender = gender;
   }


   public String getDepartment()
   {
     return this.department;
   }
   public void setDepartment(String department)
   {
      this.department = department;
   }

   public int getYearOfJoining()
   {
     return this.yearOfJoining;
   }
   public void setYearOfJoining(int yearOfJoining)
   {
      this.yearOfJoining = yearOfJoining;
   }

   public double getSalary()
   {
     return this.salary;
   }
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   
     @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}

class Implementation{
  //Write Your Code Here..
	
	//Count GroupBy Gender
  public Map<String, Long> getCount(List<Candidate> list)
  {
    Map<String, Long> countListBygender =  list.stream()
    		.collect(Collectors.groupingBy(Candidate::getGender,HashMap::new,Collectors.counting()));
    return countListBygender;
  }
  
  
  //Avg GroupBy
  public Map<String, Double> getAverageAge(List<Candidate> list)
  {
    Map<String, Double> avgAgeBygender =  list.stream()
    		.collect(Collectors.groupingBy(Candidate::getGender,Collectors.averagingInt(Candidate::getAge)));
    return avgAgeBygender;
  }

  
   //Count GroupBy Dept
  public Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list)
  {
    Map<String, Long> countListByDept =  list.stream()
    		.collect(Collectors.groupingBy(Candidate::getDepartment,HashMap::new,Collectors.counting()));
    return countListByDept;
  }
  
  
  //Sum GroupBy
  public Map<String, Integer> getSumAge(List<Candidate> list)
  {
    Map<String, Integer> sumAgeBygender =  list.stream()
    		.collect(Collectors.groupingBy(Candidate::getGender,Collectors.summingInt(Candidate::getAge)));
    return sumAgeBygender;
  }
  

  //Young Emp in Product management
 public Optional<Candidate>  getYoungestCandidateDetails(List<Candidate> list)
 {
	 return list.stream()
			 .filter(e->e.getGender().equalsIgnoreCase("Male") && e.getDepartment().equalsIgnoreCase("Product Development"))
			 .min(Comparator.comparing(Candidate::getAge)
			 .thenComparing(Candidate::getName,Comparator.reverseOrder()));
 }

}

public class GroupingBy_Practice_doselect_6 {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		List<Candidate> list = new ArrayList<>();
		  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		  list.add(new Candidate(121, "Jiy Ben", 30, "Male", "HR", 2011, 25000.0));
		  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		  
		  Implementation im  = new Implementation();
		  System.out.println(im.getCount(list));
		  System.out.println(im.getAverageAge(list));
		  System.out.println(im.countCandidatesDepartmentWise(list));
		  System.out.println(im.getYoungestCandidateDetails(list));
		  System.out.println(im.getSumAge(list));
	}
}