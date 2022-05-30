package com.dsabootcamp;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(5);

	}
	
	/*
	 		1.  *****
			    *****
			    *****
			    *****
			    *****
	 */
	
	public static void pattern1(int n) {
		
		for(int row =0; row < n; row++){
            for (int col = 0; col<n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	/*
			2.  *
			    **
			    ***
			    ****
			    *****
	*/
	
	public static void pattern2(int n) {
		
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");			
			}
		System.out.println();
		}
	}
	
	/*
			3.  *****
			    ****
			    ***
			    **
			    *
	*/
	
public static void pattern3(int n) {
		
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n - row; col++) {
				System.out.print("* ");			
			}
		System.out.println();
		}
	}

	/*
		4.  1
		    1 2
		    1 2 3
		    1 2 3 4
		    1 2 3 4 5
	*/


public static void pattern4(int n) {
	
	for (int row = 1; row <= n; row++) {
		for (int col = 1; col <= row; col++) {
			System.out.print(col +" ");			
		}
	System.out.println();
	}
}

/*
		5.  *
		    **
		    ***
		    ****
		    *****
		    ****
		    ***
		    **
		    *
*/

public static void pattern5(int n) {
	
	for (int row = 0; row < 2 * n ; row++) {
		
		int totalColInRow = row > n ? 2 * n - row : row;
		
		for (int col = 0; col < totalColInRow; col++) {
			
			System.out.print("* ");			
		}
		
	System.out.println();
	}
}


/*
 
  	6.       *
	        **
	       ***
	      ****
	     *****
  */

public static void pattern6(int n) {
	
	for (int row = 1; row <= n ; row++) {
		
		for (int col = 1; col <= n-row; col++) {
			
			System.out.print(" ");			
		}
		
		for(int col = 1; col <= row; col++) {
			System.out.print("*");	
		}
		
	System.out.println();
	}
 }

}
