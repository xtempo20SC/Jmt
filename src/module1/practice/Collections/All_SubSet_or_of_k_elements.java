package module1.practice.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Ordered
public class All_SubSet_or_of_k_elements
{
	//don't work on 5 element permutation; for that go to pervious/ up program

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
		
		//set of all elements [4] [2, 3] [1, 4] [5] [1, 2, 3] ... all
			
		Set<Set<Integer>> set = new HashSet<Set<Integer>>();
		set =powerSet(list);
		for(Set<Integer> rset : set)
		{
			System.out.println(rset);
		}
		
		
		//set of 2 elements [[1, 2], [1, 3], [2, 3], [1, 4], [2, 4], [1, 5], [3, 4], [2, 5], [3, 5], [4, 5]]
		
		System.out.println(
			powerSet(list).stream().filter(e->e.size()==2).collect(Collectors.toList())
			);
		
		//set of 3 elements [[1, 2, 3], [1, 2, 4], [1, 3, 4], [1, 2, 5], [2, 3, 4], [1, 3, 5], [2, 3, 5], [1, 4, 5], [2, 4, 5], [3, 4, 5]]

		System.out.println(
				powerSet(list).stream().filter(e->e.size()==3).collect(Collectors.toList())
				);
	}
	
}
