public class Exercise30{

public static int Gcd(int a, int b){

	if(b==0)return a;

	return Gcd(b,a%b);

}

	public static void main(String[] args) {

		int N = 10;

		boolean[][] boolArr = new boolean[N][N];

		for (int i =1; i<N; i++){
			for (int j =1; j<N; j++){

				if(Gcd(i,j)==1 && i!=j ) boolArr[i][j] = true;
				else boolArr[i][j] = false;

				System.out.printf("* %d and %d = %b *",i,j,boolArr[i][j]);
			}

			System.out.println();

		}

		
	}
}