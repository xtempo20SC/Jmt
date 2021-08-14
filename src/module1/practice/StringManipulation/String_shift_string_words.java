package module1.practice.StringManipulation;

public class String_shift_string_words {

	public static void main(String[] args) 
	{
		String str = "do something";
		str=str.trim();
		StringBuffer sb= new StringBuffer();
		int r =0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='\s')
			{
				sb.append("\s");
			}
			else
			{
		       if(Character.isLowerCase(str.charAt(i)))
			   {
				  r=((int)str.charAt(i) + 3 - 97) %26;
				  sb.append((char)(r+97));
			   }
			           
			   if(Character.isUpperCase(str.charAt(i)))
			   {
				  r=((int)str.charAt(i) + 3 - 65) %26;
				  sb.append((char)(r+65));
			    }
			}
				      
		}
		System.out.println(sb.toString());
	}
}
