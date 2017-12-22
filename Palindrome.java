import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int sum = 0;
		Scanner x = new Scanner(System.in);
		int N = x.nextInt();
		int check = N;
		if(N<=1000)
		{
			while(N!=0)
			{
				int val = N%10;
				sum = (sum * 10) + val;
				N = N/10;
			}
		}
		if(check == sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
