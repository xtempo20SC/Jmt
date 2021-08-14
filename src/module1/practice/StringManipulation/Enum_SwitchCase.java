package module1.practice.StringManipulation;

import java.util.Scanner;


public class Enum_SwitchCase
{
	enum PhoneBook
	{
		IND,UK,JAP;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		PhoneBook code = PhoneBook.valueOf(str.toUpperCase());
		
		switch(code)
		{
		   case IND:
			   System.out.println("India");
			   break;
		   case UK :
			   System.out.println("United Kingdom");
			   break;
		   case JAP :
			   System.out.println("Japan");
			   break;
		   default:	
			  System.out.println("Invalid code !");
		}
	}
}