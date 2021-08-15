package module1.practice.StringManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Matcher {

	public static void main(String[] args) {
		
		
		//Regex cheat sheet : https://www.rexegg.com/regex-quickstart.html
		
		// Name
		//Mr. Dinesh William_D  or  Mr. Dinesh_D William
		String name ="Mr. Dinesh_D William";
		
		String regexName = 
  "^[a-zA-Z]+[\\.]{1}[\s]{1}[A-Z]{1}[a-z]*[^\\W\\*]*[A-Z]*[\s]{1}[A-Z]{0,1}[a-z]*[^\\W\\*]*[A-Z]*$";
		
		// if dosen't match give [\\s]
		
		System.out.println(Pattern.matches(regexName, name));  //alawys give regex 1st at argument list
		
		
		//Phone Number
		
		String ph = "+91 (123) 456-7890";
		
		String regexPh =
	"^[\\+]{1}[0-9]+[\s]{1}[\\(]{1}[0-9]{3}[\\)]{1}[\s]{1}[0-9]{3}[\\-]{1}[0-9]{4}$"; 
		
		System.out.println(Pattern.matches(regexPh, ph)); ////alawys give regex 1st at argument list
		
		
		//Email
		
		String email = "name98.comapnay@gmail.com";
		
		String regexEmail = "^[a-z0-9]+[\\.]{1}[a-z]+[\\@]{1}[a-z]+[\\.]{1}[a-z]+$";
				
	    //	"^[a-z0-9]+[\\.]{1}[a-z]+[\\@]{1}[a-z]+\\.com$";  <--.com is fixed here

		
		System.out.println(Pattern.matches(regexEmail,email)); //alawys give regex 1st at argument list
		
		//Password
		
		String password = "Geeks@portal20";
		
		String regexPswd =
				"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$"; //{8,20}
		
		System.out.println(Pattern.matches(regexPswd, password)); //alawys give regex 1st at argument list

//				where:
//
//				^ represents starting character of the string.
//				(?=.*[0-9]) represents a digit must occur at least once.
//				(?=.*[a-z]) represents a lower case alphabet must occur at least once.
//				(?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//				(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
//				(?=\\S+$) white spaces don’t allowed in the entire string.
//				.{8, 20} represents at least 8 characters and at most 20 characters.
//				$ represents the end of the string.
		
		//-----------------------------------------------------
//		Pattern pattern = Pattern.compile(regexEmail);
//		Matcher m = pattern.matcher(email);
//		System.out.println(m.matches());
				
	}
}
