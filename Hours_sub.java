import java.util.*;
public class Hours_sub {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int h1 = x.nextInt();
		int m1 = x.nextInt();
		int h2 = x.nextInt();
		int m2 = x.nextInt();
		int h3 , m3;
		if(m1 >= 60 )
		{
			m1 = m1 % 60;
			h1 = h1 + (m1 / 60);
		}
		if(m2 >= 60 )
		{
			m2 = m2 % 60;
			h2 = h2 + (m2 / 60);
		}
		int res1 = (h1 * 60) + m1;
	    int res2 = (h2 * 60) + m2;
	    int res = res1 - res2;
	    h3 = res /60;
	    m3 = res % 60;
	    System.out.println(Math.abs(h3) + "\t" + Math.abs(m3));
	}

}
