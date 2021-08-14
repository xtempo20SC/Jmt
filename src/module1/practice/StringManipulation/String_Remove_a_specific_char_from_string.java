package module1.practice.StringManipulation;

public class String_Remove_a_specific_char_from_string {

	public static void main(String[] args) {
		
		String str ="nfeiucvyalka";
		char sc = 'n';
		StringBuffer sb = new StringBuffer();
		for(char c : str.toCharArray())
		{
			if(c!=sc)
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
