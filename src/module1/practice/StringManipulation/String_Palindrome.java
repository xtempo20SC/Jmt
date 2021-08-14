package module1.practice.StringManipulation;

import java.util.stream.IntStream;

public class String_Palindrome {

	public static void main(String[] args) {
		
		
		
		String originalString ="JavavaJ";

		
		//using StringBuffer/Builder
	     String reversedString = new StringBuilder(originalString).reverse().toString();
	 
	     System.out.println(originalString.equals(reversedString));
		
		
	     
	     
		//using stream API
		 
		String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
		 
		System.out.println( IntStream.range(0, tempString.length() / 2)
		.noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1)));
		 
	}

}
