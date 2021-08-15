package module1.practice.StreamAPI_LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PhoneBook
{
	private String name;
	private List<Long> phNos;
	
	public PhoneBook ()
	{
		
	}
	public PhoneBook(String name, List<Long> phNos)
	{
		this.name=name;
		this.phNos=phNos;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public List<Long> getPhNos()
	{
		return this.phNos;
	}
	
	public void setNmae(String name)
	{
		this.name=name;
	}
	
	public void setPnNos(List<Long> phNos)
	{
		this.phNos=phNos;
	}
}
public class Stream_and_Print_LIst_of_LIst {
 
	public static void main(String[] args) {
		
		List<PhoneBook> pblist = new ArrayList<PhoneBook>();
	    pblist.add(new PhoneBook("Ram", List.of(8976543764L,6789345266L)));
	    pblist.add(new PhoneBook("Shyam", List.of(9976543764L,489345266L)));
	    pblist.add(new PhoneBook("Jadu", List.of(276543764L,5789345266L)));
	    
	   
	    //map can't handle stream as argument
	    
	    System.out.println(pblist.stream()
	    		.map(e->e.getPhNos())         //[ [8976543764, 6789345266], [9976543764, 489345266], [276543764, 5789345266] ]
	    		.collect(Collectors.toList()));  
	    
	    //flatmap can handle stream as argument
	    
	    System.out.println(pblist.stream()
	    		.flatMap(e->e.getPhNos().stream())  //[8976543764, 6789345266, 9976543764, 489345266, 276543764, 5789345266]
	    		.collect(Collectors.toList()));
		
	}
	
}
