import java.util.*;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		char n = x.next().toLowerCase().charAt(0);
		if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");
		}
	}

}
