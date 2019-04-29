//Write a program that takes three integer command-line arguments and prints
//equal if all three are equal, and not equal otherwise

public class Exercise3{

	public static void main(String[] args){

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);


		if (a == b && b == c){

			System.out.printf("equal");

		}else{
			System.out.printf("not equal");
		}
	}
}