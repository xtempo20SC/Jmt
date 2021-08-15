package module1.practice.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution
{
	public List<String> keyPad(String digits)
	{
		List<String> ans = new ArrayList<>();
		
		if(digits.length()==0)
			return ans;
		
		HashMap<Character,String> hm = new HashMap<>();
		hm.put('2',"abc");
		hm.put('3',"def");
		hm.put('4',"ghi");
		hm.put('5',"jkl");
		hm.put('6',"mno");
		hm.put('7',"pqrs");
		hm.put('8',"tuv");
		hm.put('9',"wxyz");
		hm.put('0',"\s"); //can be removed
		
		backtrack( digits , 0 , hm , new StringBuilder() , ans );
		return ans;
	}
	
	 static void  backtrack(String digits, int i, HashMap<Character,String> hm, StringBuilder sb, List<String> ans)
	 {
		 if(i==digits.length())
		 {
			 ans.add(sb.toString());
			 return;
		 }
		 
		 String curr = hm.get(digits.charAt(i));
		 for(int k=0; k<curr.length(); k++)
		 {
			 sb.append(curr.charAt(k));
			 backtrack(digits, i+1, hm, sb, ans);
			 sb.deleteCharAt(sb.length()-1);
		 }
	 }
}



public class KeyPad_Phone {
	
     //for exam
	
//	List<String> forcall(String input)
//	{
	//   * write your code*
//		Solution s = new Solution();
//		return (s.keyPad(input).stream().distinct().collect(Collectors.toList()));
//	}
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println(s.keyPad("203").stream().distinct().collect(Collectors.toList()));
	}

}
