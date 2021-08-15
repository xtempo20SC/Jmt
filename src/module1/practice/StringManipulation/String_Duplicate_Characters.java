package module1.practice.StringManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class String_Duplicate_Characters {

	public static void main(String[] args) {
		
		
		
		
		//duplicate characters substring WITH INSERTION ORDER
		
				String str2 = "Combination";  //[o, i, n]
				
			
				List<String> list = new ArrayList<String>();	
				
			   for(int i=0; i<str2.length(); i++)
				{
				   if(str2.substring(i,i+1).equals("\s")==false)  //str2.substring(i,i+1).equals(" ")==false
				   {
					if(str2.substring(i+1,str2.length()).contains(str2.substring(i,i+1)))
					{
						list.add(str2.substring(i,i+1));
						str2=str2.replaceAll(str2.substring(i,i+1),"\s");  //(str2.substring(i,i+1)," ")
					}
				   }
				}
			   
			   System.out.println(list);
			   
		
			   
			   
	    //duplicate chars using indexOf & lastindexOf | HASH ORDER
			   
		String str1 = "ammaanupun";  //[a, u, m, n]
		
		Set<Character> rlist1 = new HashSet<>();
		for(char c : str1.toCharArray())
		{
			if(str1.indexOf(c) != str1.lastIndexOf(c))
			{
				rlist1.add(c);
			}
		}
		System.out.println(rlist1);
		
	   
	  
	   
	   
	 //find String duplicate characters using stream API | HASH ORDER
		
	 		String input = "ammaanupun";  //[a, u, m, n]
	 		
	 		    //Step 1
	 		    IntStream intStream = input.chars();

	 	        // Step 2
	 	        Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);

	 	        // Step 3
	 	        Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
	 	        
	 	        List<Character> rlist2  = new ArrayList<>();
	 	        
	 	        for(Map.Entry<Character, Long> rmap : output.entrySet())
	 	        {
	 	        	if(rmap.getValue()>1)
	 	        	{
	 	        		rlist2.add(rmap.getKey());
	 	        	}
	 	        }

	 	        System.out.println(rlist2);

		
	}
}
