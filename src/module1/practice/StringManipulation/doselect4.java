package module1.practice.StringManipulation;
import java.util.*;
import java.util.regex.Pattern;


class Header{
	// Implemet the Header Class according to the specifiaction.
	    String from;
		String to;
		Header(String from, String to)
		{
			this.from = from;
			this.to = to;
		}
	}


	class Email{
	// Implement Email Class according to the specifiaction.
	    Header header;
		String body;
		String greetings;
		Email(Header header, String body, String greetings)
		{
			this.header = header;
			this.body = body;
			this.greetings = greetings;
		}
	}



	class EmailOperations{
	// Implemet the Three methods specified in the specified.	
	// try
	// {
	   public int emailVerify(Email e)
	   {
		   //String r = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		   try
		   {
		   Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		   java.util.regex.Matcher matcher1 = pattern.matcher(e.header.from);
	       java.util.regex.Matcher matcher2 = pattern.matcher(e.header.to);

	      int t=0;
		  if(matcher1.matches());
		  {
			  t++;
		  }
		  if(matcher2.matches())
		  {
			  t++;
		  }
		  return t;
		   }catch( AssertionError a)
		   {
			   System.out.println("somthing is wrong!");
		   }
		return 0;
	   }


	   public String bodyEncryption(Email e)
	   {
	        StringBuffer sb = new StringBuffer();
			for(int i=0; i<e.body.length(); i++)
			{
				if(e.body.charAt(i)==' ')
				{
					sb.append(' ');
				}
				else if (Character.isUpperCase(e.body.charAt(i)))
	            {
	                char ch = (char)(((int)e.body.charAt(i) + 3 - 65) % 26 + 65);
	                sb.append(ch);
	            }
	            else
	            {
	                char ch = (char)(((int)e.body.charAt(i) + 3 - 97) % 26 + 97);
	                sb.append(ch);
	            }
			}
			return sb.toString();
	   }

	   public String greetingMessage(Email e)
	   {
		   StringBuffer sb = new StringBuffer();
		   String name = e.header.from.split("@")[0];
		   sb.append(e.greetings);
		   sb.append(" ");
		   sb.append(name);
		   return sb.toString();
	   }
	// }catch(Exception e)
	// {
//	 	//throw new Exception();
	// }
	}


	public class doselect4 {
		public static void main(String args[] ) throws Exception {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	     //You can Implement your main() to check your Program.
		    Header h = new Header("amit99@goo.com", "sumon88@goo.com");
		    Email e = new Email(h,"hi sumon here","Regards");
		    EmailOperations eo = new EmailOperations();
		    System.out.println(eo.emailVerify(e));
		    System.out.println(eo.bodyEncryption(e));
		    System.out.println(eo.greetingMessage(e));
			
		}
	}