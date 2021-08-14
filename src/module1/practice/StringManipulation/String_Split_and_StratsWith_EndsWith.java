package module1.practice.StringManipulation;

public class String_Split_and_StratsWith_EndsWith {

	public static void main(String[] args) {
		
		//split string
		
				String str1 = "abc.efg.xyz";
				
				String [] sarr=str1.split("\\.");
				
				for(int i=0; i<sarr.length; i++)
				{
					System.out.print(sarr[i]+",");
				}
				
				System.out.println();
				
		//str.stratsWith("A")	
				String str2 = "Hello";
				System.out.println(str2.startsWith("Hel"));
				System.out.println(str2.endsWith("o"));
				
				
	}
}
