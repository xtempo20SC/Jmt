package module1.practice.StringManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class String_All_possible_Substring 
{
	
	public static void main(String[] args) 
	{
		String str = "random";  
        int len = str.length();  
     
        List<String> list = new ArrayList<>();
   
        for(int i = 0; i < len; i++) 
        {  
            for(int j = i; j < len; j++) 
            {  
                list.add(str.substring(i, j+1));
            }  
        }  
        
        
        //print all substrings
        System.out.println(list);
          
       
        //print word of length 3
        System.out.println(
        		list.stream().filter(e->e.length()==3).collect(Collectors.toList())
        		);
	}

}
