import java.lang.Math;
import java.util.Random;

public class Exercise39{

	public static int binarySearch(int key, int[] a)
	{

		int lo =0;
		int hi = a.length -1;

		while(lo <= hi)
		{
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;

		}

		return -1;

	}


	public static int[] generateRandomNumbers(int n){

		int[] arr = new int[ (int) Math.pow(10,n)];

		Random rnd = new Random();

		for(int i = 0; i<arr.length; i++){

			arr[i]= 100000 + rnd.nextInt(900000);
		}

		return arr;
	}

	public static void main(String[] args) {


		int t = 200;
		double[] result = new double[7];

		int[] arr1;
		int[] arr2;

		for(int i=0; i<t; i++){
			for(int n=3; n<=6; n++){

				arr1 = generateRandomNumbers(n);
				arr2 = generateRandomNumbers(n);

				for(int key : arr1){

					if (binarySearch(key, arr2) >= 0){

						result[n]++;
					}
				}

			}
		}

		System.out.println(result[3]/t);
		System.out.println(result[4]/t);
		System.out.println(result[5]/t);
		System.out.println(result[6]/t);




	}

}