// Javaprogram to find Minimum
// number of jumps to reach end
import java.util.*;
import java.io.*;

public class varun {


static	int minPossibleJump(int list[], int n, int p) {
   int jumps[] = new int[n];     // dynamically create jumps array to store steps
   if (n == 0 || list[0] == 0)
       return Integer.MAX_VALUE;
   jumps[0] = 0;

   for (int i = 1; i < n; i++) {
      jumps[i] = Integer.MAX_VALUE;    //initially set jumps as infinity
      for (int j = 0; j < i; j++) {
         if (i <= j + list[j] && jumps[j] != Integer.MAX_VALUE) {
            jumps[i] = min(jumps[i], jumps[j] + 1);
            break;
         }
      }
   }
   return jumps[p-1];
}
    static	int min(int x, int y) {
   return (x < y)? x: y;
}

	// Driver code
	public static void main(String args[])
	{

	     int n,p;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter no. of Compartments in Train:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("\nEnter all Comparrtment Jetpack Thresold Value:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }


        System.out.print("\nThe Thesis is hidden in compartment no.:");
	      p= s.nextInt();

		System.out.print("\n number of hops "
						+  minPossibleJump(arr, n,p)); 
	}
}
