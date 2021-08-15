package module1.practice.StringManipulation;

public class String_Remove_Duplicates_insertion_order {

	public static void main(String[] args) {
		
		// All chr char using stream
		String str ="yyfghsjsrrf";      //yfghsjr
		
		StringBuilder sb1 = new StringBuilder();
		  str.chars().distinct().forEach(c -> sb1.append((char) c));
		   System.out.println(sb1.toString());
	}
}
