package module1.practice.StringManipulation;

public class String_Replace_Reverse_Repeat {

	public static void main(String[] args) {
		
		//reverse
		
		String str ="avbhgy";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		
		
		//replaceAll()
		
		String d = "Java is Great";
		String r = d.replaceAll("\s", "%20");
		System.out.println(d+"=>"+r);
		
		//replace()
		String r1 =d.replace("a", "#");
		System.out.println(r1);
		
		
		//replaceFirst()
		String r2 = d.replaceFirst("a", "0");
		System.out.println(r2);
		
		
		//repeat()
		String r3 = d.repeat(3);
		System.out.println(r3);
	}
}
