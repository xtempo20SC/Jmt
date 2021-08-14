package module1.practice.StringManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Matcher {

	public static void main(String[] args) {
		
		// Name
		
		String name ="Mr. Dinesh William_D";
		
		String regexName = 
  "^[a-zA-Z]+[\\.]{1}[\s]{1}[A-Z]{1}[a-z]*[\s]{1}[A-Z]{0,1}[a-z]*[^\\W\\*]*[a-zA-Z]*$";
		
		// if dosen't match give [\\s]
		
		System.out.println(Pattern.matches(regexName, name));
		
		
		//Phone Number
		
		String ph = "+91 (123) 456-7890";
		
		String regexPh =
	"^[\\+]{1}[0-9]+[\s]{1}[\\(]{1}[0-9]{3}[\\)]{1}[\s]{1}[0-9]{3}[\\-]{1}[0-9]{4}$"; 
		
		System.out.println(Pattern.matches(regexPh, ph));
		
		
		//Email
		
		String email = "name98.comapnay@gmail.com";
		
		String regexEmail = "^[a-z0-9]+[\\.]{1}[a-z]+[\\@]{1}[a-z]+[\\.]{1}[a-z]+$";
				
	    //	"^[a-z0-9]+[\\.]{1}[a-z]+[\\@]{1}[a-z]+\\.com$";  <--.com is fixed here

		
		System.out.println(Pattern.matches(regexEmail,email));
		
		
		//-----------------------------------------------------
//		Pattern pattern = Pattern.compile(regexEmail);
//		Matcher m = pattern.matcher(email);
//		System.out.println(m.matches());
				
	}
}
