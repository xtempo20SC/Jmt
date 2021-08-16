package module1.practice.ExceptionHandling;

//NOT RECOMMANDED

class CusException extends Exception
{
	public CusException(String str)
	{
		super(str);
	}
}
class CusCal 
{
	double calculation(int x,int y) throws CusException
	{
		try
		{
			
			throw new CusException("Y is 0");
		}
		catch(CusException ce)
		{
			System.out.println(ce.getMessage());
		}
		return ((double)x/y);
	}
}
public class Exception_Another {

	public static void main(String[] args) throws CusException {
		CusCal cc = new CusCal();
		System.out.println(cc.calculation(3, 1));
	}
}
