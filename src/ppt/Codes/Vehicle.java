package ppt.Codes;

class Father 
{
	void bike(int n)
	{
		System.out.println("Father has "+n+" bikes");
		System.out.println();
	}
}

class Son extends Father
{
	@Override
	void bike(int n)
	{
		System.out.println("Son got "+n+" bike from his father"
				+ " and customized it");
	}
}


public class Vehicle
{
	public static void main(String[] args) {
	   Father f = new Father();
	   f.bike(2);
	   
	   Son s = new Son();
	   s.bike(1);
	}
}
