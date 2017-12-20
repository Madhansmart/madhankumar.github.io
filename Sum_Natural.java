import java.util.*;
public class Sum_Natural {
	public static void main(String[] args) {
		int sum = 0;
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		for(int i = 0 ; i<=n ; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
