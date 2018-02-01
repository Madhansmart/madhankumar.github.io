import java.util.*;
public class Hour_minutes {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int  M = x.nextInt();
		int hours = M / 60;
		int min = M % 60 ;
		System.out.println(hours + "\t" + min);

	}

}
 