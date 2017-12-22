import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		int count = 0;
		Scanner x = new Scanner(System.in);
		int N = x.nextInt();		
		if(N<=1000)
		{
			for(int i = 2; i<N; i++)
			{
				if(N%i == 0)
				{
					count++;
				}
			}
		  if(count == 0)
		  {
			  System.out.println("yes");
		  }
		  else
		  {
			  System.out.println("no");
		  }
		}
	}

}
