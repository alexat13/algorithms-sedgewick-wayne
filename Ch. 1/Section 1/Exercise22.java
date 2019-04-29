/*Write a version of BinarySearch that uses the recursive rank() given on page 25
and traces the method calls. Each time the recursive method is called, print the
argument values lo and hi, ident by the depth of the recursion. Hint: Add an argument
to the recursive method that keeps track of the depth.*/
import java.util.Arrays;

public class Exercise22{

	static String depth = "";

	public static int rank(int key, int[] a, String dep){

		return rank(0, a.length-1, key, a, dep);

	}

	public static int rank(int lo, int hi, int key, int[] a, String dep){


		if (lo>hi) return -1;

		
		int mid = lo+(hi-lo)/2;

		if 				(key<a[mid]) return rank(lo, mid-1, key, a, dep );
		else if 		(key>a[mid]) return rank(mid+1, hi, key, a, dep );
		else 						 return 	mid;

	}

	public static void main(String[] args) {
		
		int[] whitelist = In.readInts(args[0]);

		int c =0;

		Arrays.sort(whitelist);

		while (!StdIn.isEmpty())
		{
			int key = StdIn.readInt();

			System.out.printf("Looking for the key %d\n",key);

			String depth="";

			if (rank(key, whitelist, depth) < 0){
				System.out.printf("NOT FOUND!\n");

			}else{
				System.out.printf("FOUND!\n");
				c++;
			}

			

		}

		StdOut.printf("Total Points = %d\n",c);
		StdOut.printf("----------------------\n");
	}
}