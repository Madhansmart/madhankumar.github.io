import java.util.*;
public class Append {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String S = x.nextLine();
		StringBuilder stl = new StringBuilder(S);
		System.out.println(stl.append("."));
	}

}
