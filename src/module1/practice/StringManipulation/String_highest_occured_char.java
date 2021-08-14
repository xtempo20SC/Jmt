package module1.practice.StringManipulation;

public class String_highest_occured_char {

	public static void main(String[] args) {
		String str = "ggdtstvvadhgg";
		
		char [] arr = new char[26];
		for(Character c : str.toCharArray())
		{
			if(Character.isLowerCase(c))
			    arr[(int)c-97]++;
			if(Character.isUpperCase(c))
				arr[(int)c-65]++;
		}
	
		int max = 0;
		char result = '\0';
		
		for(int i=0; i<arr.length; i++)
		{
			//System.out.println(i);
			if(arr[i]>max)
			{
				max=arr[i];
				result=(char)(i+97);
			}	
		}
		System.out.println(result);
		
	}
}
