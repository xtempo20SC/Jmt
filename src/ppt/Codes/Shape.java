package ppt.Codes;

public class Shape
{
	void area(double a)
	{
		double value = Math.pow(a,2.0);
		System.out.println("Area of the square is = "+value);
	}
	
	void area(double a,double b)
	{
		double value = (a*b);
		System.out.println("Area of the rectangle is = "+value);
	}
	
	void area(int a,double c)
	{
		double value = (0.5*c*a);
		System.out.println("Area of the triangle is = "+value);
	}	
	
	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.area(5.0);
		s.area(3.0,2.0);
		s.area(6,3.0);
	}
}