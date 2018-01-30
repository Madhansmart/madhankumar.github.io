import java.util.*;
public class First_five_multiples {

	public static void main(String[] args) {
		int sum =0;
        Scanner x = new Scanner(System.in);
        int N = x.nextInt();
        for(int i=1;i<=5;i++)
        {
        	sum = sum + N;
        	System.out.print(sum + "\t");
        }        

	}

}
