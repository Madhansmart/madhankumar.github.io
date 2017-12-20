import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int c = x.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
		}
		else if(b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

}
