import java.util.*;
public class Array_index_value {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int N = x.nextInt();
		int a[] =  new int[N];
		for(int i=0; i<N;i++)
		{
			a[i] = x.nextInt();
		}
		for(int j =0 ; j<N; j++)
		{
			if(j ==0 )
			{
				System.out.print(a[j] + "\t" + 0 + "\n");
			}
			else {
			System.out.print(a[j] + "\t" + a[j-1]);
			System.out.print("\n");
			}
		}

	}

}
