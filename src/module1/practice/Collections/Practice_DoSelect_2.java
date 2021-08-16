package module1.practice.Collections;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{
    // Write your code here..
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model)
	{
		
		String addStr = "model successfully added";
       for(Map.Entry<String, ArrayList<String>> c : mobiles.entrySet())
	   {
		   if(c.getKey().equals(company))
		   {	     
			   mobiles.get(company).add(model);
			  // System.out.println(mobiles);
			   return addStr;
		   }
	   }
       ArrayList<String> newadd = new ArrayList<String>();
       newadd.add(model);
	   mobiles.put(company,newadd);
	   //System.out.println(mobiles);
	   return addStr;
	}
	
	public ArrayList<String> getModels(String company)
	{
		 for(Map.Entry<String, ArrayList<String>> c : mobiles.entrySet())
	    {
		   if(c.getKey().equals(company))
		   {
			  return mobiles.get(company);
		   }
	    }
		return null;
	}
	
	public String buyMobile(String company, String model)
	{
		for(Map.Entry<String, ArrayList<String>> c : mobiles.entrySet())
	    {
		   if(c.getKey().equals(company))
		   {
			   if( mobiles.get(company).isEmpty())
			   {
				   return "item not available";
			   }
			   else
			   {
				  //ArrayList<String> slist = mobiles.get(company);
				  if(mobiles.get(company).contains(model))
				  {
                     mobiles.get(company).remove(new String(model));
                      //System.out.println(mobiles);
				     return "mobile sold successfully";
				  }
				  else
				  {
					  return "item not available";
				  }
			   }
		   }
	    }
		return "item not available";
	}
}

public class Practice_DoSelect_2 {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K5"));
		System.out.println(obj.addMobile("Oppo", "K3"));
		System.out.println(obj.getModels("Oppo"));
		System.out.println(obj.buyMobile("Oppo", "K9"));
	}
}