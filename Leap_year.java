import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int year = x.nextInt();
		if(year%4 == 0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0) {
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not a leap year");
				}
			}
			else {
				System.out.println("leap year");
		         }
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

}
