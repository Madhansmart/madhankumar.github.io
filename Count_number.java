import java.util.*;
public class Count_number {

	public static void main(String[] args) {
		int count = 0;
	   Scanner x = new Scanner(System.in);
	   int n = x.nextInt();
	   while(n!=0)
	   {
		   n = n/10;
		   count++;
	   }
	   System.out.println(count);
	}

}
