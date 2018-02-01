import java.util.*;
public class Smallest_array_element {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int N = x.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++)
		{
			a[i] = x.nextInt();
		}
		int small = 0;
		for(int i=1;i<N;i++)
		{
			if(a[small] >=a[i])
			{
				small = i;
			}
		}
		System.out.println(a[small]);

	}

}
