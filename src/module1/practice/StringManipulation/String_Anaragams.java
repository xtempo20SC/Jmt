package module1.practice.StringManipulation;

public class String_Anaragams {

	public static void main(String[] args) {
		String str1 ="bumnppr";
		String str2 ="bumnppr";
		
		//String anargam
		if(str1.length()!=str2.length())
			System.out.println(false); //return
		else
		{
			int[] arr = new int[26];
			for(int i=0; i<str1.length(); i++)
			{
				arr[(int)str1.charAt(i)-97]++; //it is for lowercase; for uppercase 
				                               //implement using -65
			}
			for(int i=0; i<str2.length(); i++)
			{
				arr[(int)str2.charAt(i)-97]--;
			}
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]!=0)
				{
					System.out.println(false); //return
					break;
				}
			}
			System.out.println(true); //return
		}
		
	}
}
