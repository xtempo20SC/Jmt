package module1.practice.StringManipulation;

enum Days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class Enum_Fetch_AllValues {

	public static void main(String[] args) {
		Days day[] = Days.values();
		for(Days d:day)
		{
			System.out.print(d+" ");
		}
	}
}
