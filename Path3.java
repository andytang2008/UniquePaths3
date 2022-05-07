/** Count all possible paths from top left to top bottom right using
 Recursive Dynamic Programming
 */
import java.util.*; 
public class Path3
{
   
    /** Returns the count of possible paths to reach
     the cell at row number m and column number n from
     the topmost leftmost cell (cell at 1, 1)*/
    static int numberOfPaths(int n, int m, int DP[][])
    {
 
        if (n == 1 || m == 1){
				DP[n][m] = 1;
				
					 if (n==1){
						 System.out.print("    DP["+n+"]["+m+"]="+DP[n][m]);
					 }else
					 {
						  System.out.println("    DP["+n+"]["+m+"]="+DP[n][m]);
						 
					 }
				return DP[n][m];
			}
 
        // Add the element in the DP table
        // If it is was not computed before
        if (DP[n][m] == 0){
            DP[n][m] = numberOfPaths(n - 1, m, DP)
                       + numberOfPaths(n, m - 1, DP);
			System.out.print("    DP["+n+"]["+m+"]="+DP[n][m]);		   
			}
        
        return DP[n][m];
    }
 
    // Driver code
    public static void main(String args[])
    {
        // Create an empty 2D table
        int DP[][] = new int[4][5];
		System.out.println("**************************************************");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                DP[i][j] = 0;
				System.out.print("    DP["+i+"]["+j+"]="+DP[i][j]);
            }
			System.out.println();
        }
	System.out.println("______________________________________________");
        System.out.println("         The number of Paths:  "+numberOfPaths(3, 4, DP));
    }
}
 
