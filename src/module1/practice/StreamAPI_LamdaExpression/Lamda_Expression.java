package module1.practice.StreamAPI_LamdaExpression;

// functional interface
interface Clc
{
	int method(int i);
	
	// in new java update we can add defined method ass static and default.
	
	default int val(int g)
	{
		return g-1;
	}
	
	// in new java update we can add defined method ass static and default.
	
	static int valr(int g)
	{
		return g-1;
	}
	
}

public class Lamda_Expression 
{
	public static void main(String[] args) 
	{
		//define lamda expression
		Clc c  = (x)->(x*x);
		
		//calling that method
		System.out.println(c.method(6));
	}

}
