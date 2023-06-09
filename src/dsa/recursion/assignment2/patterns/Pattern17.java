package dsa.recursion.assignment2.patterns;
/*
 
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 
 */

public class Pattern17 {

private static void printSpace(int row) {
		
		// base case
		if(row == 0) {
			return ;
		}
		
		// logic
		System.out.print(" ");
		
		// small problem
		printSpace(row-1);
		
	}
	
	private static void printStar(int star) {
		
		// base case
		if(star == 0)
			return;
		
		// buisness logic
		System.out.print("*");
		
		
		// small problem
		printStar(star-1);
	
	}
	
	private static void printLine(int row, int star, int n) {
		// base case
		if(row == 1)
			return ;
		
		// buisness logic
		printStar(row -1);
		printSpace(2*star);
		printStar(row -1);
		System.out.println();
		
		
		// small problem
		printLine(row-1, star+1, n);
		
		if(row == n) {
			return;
		}
			printStar(row);
			printSpace(2*star -2);
			printStar(row);
			System.out.println();
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		int row = 5;
		int star = 0;
		int n = row;
		
		// stack building
		printLine(row, star, n);
	

	}

}
