import java.util.*;
public class Factorial1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int N = x.nextInt();
		int fact=1,sum=0;
		if(N<=20)
		{
			for(int i=1;i<=N;i++)
			{
				fact = fact * i;				
			}
		}
		System.out.println(fact);
		
	}

}
