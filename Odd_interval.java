import java.util.*;
public class Odd_interval {

	public static void main(String[] args) {
		 Scanner x = new Scanner(System.in);
	  	 int a = x.nextInt();
	  	 int b = x.nextInt();
	  	 for(int  i = ++a; i<b ; i++)
	  	 {
	  		if(i%2 != 0)
	  		{
	  			System.out.println(i);
	  		}
	  	 }

	}

}
