
public class Test1 {

	public static void main(String[] args) {
		int[][] a = {{7,9,3,4,8,4},
				{8,5,6,4,5,7}};
		int[][] t = {{0,2,3,1,3,4},
				{0,2,1,2,2,1}};
		int[] e = {2, 4};
		int[] x = {3, 3};
		AssemblyLine A = new AssemblyLine();
		if (AssemblyLine.AssemblyAlgo(a, t, e, x) == 38)
			System.out.println("\nTest Passed!");
		else
			System.out.println("\nTest Failed.");
	}

}
