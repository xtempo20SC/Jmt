package module1.practice.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class All_Possiible_Set_or_of_2_elements
{

	public static Set<Set<Integer>> powerSet(List<Integer> intList){

	    Set<Set<Integer>> result = new HashSet<>();
	    result.add(new HashSet<>());

	    for (Integer i : intList)
	    {

	        Set<Set<Integer>> temp = new HashSet<>();

	        for(Set<Integer> intSet : result)
	        {
	            intSet = new HashSet<>(intSet);
	            intSet.add(i);                
	            temp.add(intSet);
	        }
	        result.addAll(temp);
	    }
	    return result;
	}
	
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//set of all elements
		Set<Set<Integer>> set = new HashSet<Set<Integer>>();
		set =powerSet(list);
		for(Set<Integer> rset : set)
		{
			System.out.println(rset);
		}
		
		
		//set of 2 elements
		System.out.println(
			powerSet(list).stream().filter(e->e.size()==2).collect(Collectors.toList())
			);
		
		//set of 3 elements
		System.out.println(
				powerSet(list).stream().filter(e->e.size()==3).collect(Collectors.toList())
				);
	}
	
}
