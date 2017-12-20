import java.util.Scanner;
public class Sum_N {
	public static void main(String[] args) {
		int sum = 0;
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		for(int i = 1 ; i<=n ; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
