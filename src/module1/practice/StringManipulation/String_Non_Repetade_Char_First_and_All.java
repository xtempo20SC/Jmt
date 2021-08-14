package module1.practice.StringManipulation;

public class String_Non_Repetade_Char_First_and_All{

	public static void main(String[] args) {
		
		//using indexOf()
		
		String word ="abvhbvya";
		
		for(int i=0;i<word.length();i++)
		{
			if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i)))
			{
				System.out.println(word.charAt(i));
				//break;
			}
		}
		
		
		//using substring
		String str = "abvhbvya";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.substring(i+1,str.length()).contains(str.substring(i,i+1))==false)
			{
				
				System.out.println(str.charAt(i)); //return
				break;
			}
		}
	
				
				
		
	}
}
