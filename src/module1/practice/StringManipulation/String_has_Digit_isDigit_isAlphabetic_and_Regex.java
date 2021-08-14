package module1.practice.StringManipulation;

import java.util.regex.Pattern;

public class String_has_Digit_isDigit_isAlphabetic_and_Regex{

	public static void main(String[] args) {
		
		String str = "abhv90ui";
		
		// Character.isDigit() method
		
		for(Character c : str.toCharArray())
		{
			if(Character.isDigit(c))  
			{
				System.out.println("Digit : "+true);
			}
			
			if(Character.isAlphabetic(c))
			{
				System.out.println("Alphabate : "+true);
			}
		}
		
		// only digits using Regex
		
		String str1 = "623569";
		String regex = "[0-9]+";
		System.out.println("Regex : "+Pattern.matches(regex,str));
		System.out.println("Regex : "+Pattern.matches(regex,str1));
		
		
		
	}
}
