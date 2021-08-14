package module1.practice.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class All_Permutation_of_array_elements {
	
	
	
	public static Set<String> generatePerm(String input)
	{
	    Set<String> set = new HashSet<String>();
	    if (input == "")
	        return set;

	    Character a = input.charAt(0);

	    if (input.length() > 1)
	    {
	        input = input.substring(1);

	        Set<String> permSet = generatePerm(input);

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	                set.add(x.substring(0, i) + a + x.substring(i));
	            }
	        }
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    return set;
	}
	
	public static void main(String[] args) {
		int arr [] = new int[] {1,2,3};
		StringBuffer sb = new StringBuffer();
		for(int i : arr)
		{
			sb.append(i);
		}
		
		//[321, 132, 213, 231, 312, 123]
		
		Set<Integer> setInt = new HashSet<Integer>();
		for(String r : generatePerm(sb.toString()))
		{
			setInt.add(Integer.parseInt(r));
		}
		System.out.println(setInt);
		
		
		///[[2, 3, 1], [1, 3, 2], [1, 2, 3], [3, 2, 1], [2, 1, 3], [3, 1, 2]]

		List<List<Integer>> list = new ArrayList<>();
		for(String r : generatePerm(sb.toString()))
		{
			List<Integer> imlist = new ArrayList<Integer>();
			
			for(int i=0; i<r.length(); i++)
			{
				imlist.add(Integer.parseInt(r.substring(i,i+1)));
			}
			list.add(imlist);
		}
		System.out.println(list);
	}
	
}
