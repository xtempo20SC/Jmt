package module1.practice.StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class String_lenth_of_longest_substring_with_all_disct_char {

	private static final int CHAR_RANGE = 128;
	 
    public static String findLongestSubstring(String str)
    {
    	//using set
    	Set<Character> set = new HashSet<>();
    	for(Character c :str.toCharArray())
    	{
    		set.add(c);
    	}
    	StringBuffer sb = new StringBuffer();
    	for(Character c : set)
    	{
    		sb.append(c);
    	}
    
    	return sb.toString();
    	
    }
 
    public static void main(String[] args)
    {
        String str = "abbcdafeegh";
        
        
 
        System.out.print(findLongestSubstring(str));
    }



}
