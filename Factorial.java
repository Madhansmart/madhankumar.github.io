import java.util.*;
public class Factorial {
	
	public static void main(String[] args) {
		int sum = 1;
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		for(int i = 1; i<=a ;i++)
		{
			sum = sum *i;
		}
		System.out.println(sum);
	}

}
