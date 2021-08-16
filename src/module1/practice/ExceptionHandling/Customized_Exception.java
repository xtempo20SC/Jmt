package module1.practice.ExceptionHandling;

class Division
{
	double divMethod(int x, int y) throws DivisionException
	{
		if(y==0)
		{
			throw new DivisionException("Y is 0");
		}
		return ((double)x/y);
	}
}
class DivisionException extends Exception 
{
	public DivisionException (String str)
	{
		super(str);
	}
}

public class Customized_Exception
{
	public static void main(String[] args) {
		
		Division d= new Division();
 
		try
		{
			System.out.println(d.divMethod(6, 0));
		}
		catch(DivisionException de)
		{
			System.out.println(de.getMessage());
		}
	}
}