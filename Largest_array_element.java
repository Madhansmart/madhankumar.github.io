import java.util.Scanner;
public class Largest_array_element {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int N = x.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++)
		{
			a[i] = x.nextInt();
		}
		int large = 0;
		for(int i=1;i<N;i++)
		{
			if(a[large] <=a[i])
			{
				large = i;
			}
		}
		System.out.println(a[large]);

	}

}
