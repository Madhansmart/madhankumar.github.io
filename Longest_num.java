import java.util.*;
public class Longest_num {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int arr[] = new int[N];
	        for(int i=0; i<N; i++)
	        {
	            arr[i] = scan.nextInt();
	        }
	        Arrays.sort(arr);
	        for(int j=arr.length-1; j>0; j--)
	        {
	            System.out.print(arr[j]);
	        }
	        

	}

}
