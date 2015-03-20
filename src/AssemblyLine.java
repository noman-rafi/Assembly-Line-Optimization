// Noman Rafi
// BSCS 2B
// 01327
// Assignment 1
// Advanced Programming

public class AssemblyLine {

	public static int[][] l;
	public static int optimalLine;

	public static int AssemblyAlgo(int[][] a, int[][] t, int[] e, int[] x){		
		int n = a[0].length;
		l = new int[2][n];
		l[0][0] = 1;
		l[1][0] = 2;
		int[] T1 = new int[n];
		int[] T2 = new int[n];

		T1[0] = e[0] + a[0][0];
		T2[0] = e[1] + a[1][0];
		
		System.out.println("***************************Assembly Line Optimization***************************");
		System.out.println("\n\nAssembly times for stations on line 1");
		System.out.println("Entry Time\t: "+e[0]);
		System.out.print("Station\t\t:");
		for (int i=0;i<n;i++)
			System.out.print(" "+(i+1));
		System.out.print("\nAssembly Time\t:");
		for(int i=0;i<n;i++)
			System.out.print(" "+a[0][i]);
		System.out.println("\nExit Time\t:"+x[0]);
		
		System.out.println("\n\nAssembly times for stations on line 2");
		System.out.println("Entry Time\t: "+e[1]);
		System.out.print("Station\t\t:");
		for (int i=0;i<n;i++)
			System.out.print(" "+(i+1));
		System.out.print("\nAssembly Time\t:");
		for(int i=0;i<n;i++)
			System.out.print(" "+a[1][i]);
		System.out.println("\nExit Time\t: "+x[1]);
		System.out.println();

		for(int i=1; i<n; i++){
			T1[i] = Math.min(T1[i-1]+a[0][i], T2[i-1]+t[1][i]+a[0][i]);
			if(Math.min(T1[i-1]+a[0][i], T2[i-1]+t[1][i]+a[0][i]) == T1[i-1]+a[0][i]){
				l[0][i]=1;}
			else{
				l[0][i]=2;}

			T2[i] = Math.min(T2[i-1]+a[1][i], T1[i-1]+t[0][i]+a[1][i]);
			if(Math.min(T2[i-1]+a[1][i], T1[i-1]+t[0][i]+a[1][i]) == T2[i-1]+a[1][i])
				l[1][i]=2;
			else
				l[1][i]=1;
		}

//		System.out.println("Minimum time = " +Math.min(T1[n-1]+x[0], T2[n-1]+x[1]));
		System.out.println("");

		System.out.print("Line 1 : ");
		for(int i=1; i< l[0].length; i++)
			System.out.print(l[0][i]+ " ");
		System.out.println("\tCost : "+(T1[n-1]+x[0]));

		System.out.print("Line 2 : ");	
		for(int i=1; i< l[1].length; i++)
			System.out.print(l[1][i]+ " ");
		System.out.println("\tCost : "+(T2[n-1]+x[1]));

		if(Math.min(T1[n-1]+x[0], T2[n-1]+x[1]) == T1[n-1]+x[0])
			optimalLine = 0;
		else
			optimalLine = 1;
		
		System.out.println("Optimal Line : " + (optimalLine+1));
		
		System.out.println("\n\nOptimal Path\n");
		for(int i=0; i <n;i++){
			System.out.println("Line "+l[optimalLine][i]+" Station "+(i+1));
		}
		
		return (Math.min(T1[n-1]+x[0], T2[n-1]+x[1]));
	}

}
