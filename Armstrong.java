import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		int n = y.nextInt();
		int a,check = n,val = n,sum = 0;
		while(n!=0)
		{
			a = n%10;
			int mul = a*a*a;			
			sum = sum + mul;			
			n = n/10;
		}
		if(check == sum) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
		
	}

}
