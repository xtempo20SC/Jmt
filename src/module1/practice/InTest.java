package module1.practice;

interface A
{
	int n=89;
}
class B implements A
{
	public static int n;
	public void display()
	{
		System.out.println(n);
	}
}

public class InTest
{
	public static void main(String[] args) {
		B b = new B();
	    b.display();
	}
}