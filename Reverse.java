import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s = x.nextLine();
		String s1 = "";
		for(int i = s.length()-1;i>=0;i--)
		{
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
	}
}
