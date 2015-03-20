
public class Test2 {

	public static void main(String[] args) {
		int[][] a = {{3,1,3,20,2,6},
				{2,1,4,3,5,1}};
		int[][] t = {{0,2,3,1,3,4},
				{0,2,1,2,2,1}};
		int[] e = {2, 4};
		int[] x = {3, 3};
		AssemblyLine A = new AssemblyLine();
		AssemblyLine.AssemblyAlgo(a, t, e, x);
		
		if (AssemblyLine.AssemblyAlgo(a, t, e, x) == 22)
			System.out.println("\n\nTest Passed!");
		else
			System.out.println("Test Failed.");
	}

}
