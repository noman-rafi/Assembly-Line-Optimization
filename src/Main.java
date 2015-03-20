import java.util.Random;


public class Main {

	public static void main(String[] args) {

		int maxStations = 6;
		int max = 20;
		int min = 1;
		int[][] a = new int[2][maxStations]; 
		int[][] t = new int[2][maxStations];
		int[] e = new int[2] ;
		int[] x = new int[2];

		Random rn = new Random();
		for(int i = 0; i<2 ; i++){
			for (int j = 0; j < maxStations; j++){
				a[i][j] = rn.nextInt(max - min + 1) + min;
				t[i][j] = rn.nextInt(max - min + 1) + min;

			}
		}
		for(int i =0; i<2; i++){
			e[i]=rn.nextInt(max - min + 1) + min;
			x[i]=rn.nextInt(max - min + 1) + min;
		}
		AssemblyLine.AssemblyAlgo(a, t, e, x);

	}
}