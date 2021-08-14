package module1.practice.StringManipulation;

public class String_All_possible_Substring {

	private static void permutation(String perm, String word) 
	{
		if (word.isEmpty()) 
		{
		   System.out.println(perm + word);
		} 
		else 
		{
		   for (int noMore = 0; noMore <= 1; noMore++) 
		   {
		      if (noMore == 0) 
		      {
		         for (int i = 0; i < word.length(); i++) 
		         {
		               permutation(perm + word.charAt(i), word.substring(i + 1, word.length()));
		         }
		      }
		      else 
		      {
		         permutation(perm, "");
		      }
		   }
		}
    }

		
	public static void main(String[] args) 
	{
		permutation("","ramdom");
	}

}
