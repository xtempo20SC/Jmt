package module1.practice.StreamAPI_LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stram_API_on_Strings {

	public static void main(String[] args) {
		
		
//find duplicate characters using stream API  | Hash Order --> for insertion order go to string package
		
		String input = "Combination"; //[i, n, o]
		
		    //Step 1
		    IntStream intStream = input.chars();

	        // Step 2
	        Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);

	        // Step 3
	        Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
	        
	        List<Character> rlist  = new ArrayList<>();
	        
	        for(Map.Entry<Character, Long> rmap : output.entrySet())
	        {
	        	if(rmap.getValue()>1)
	        	{
	        		rlist.add(rmap.getKey());
	        	}
	        }

	        System.out.println(rlist);

	}
}
