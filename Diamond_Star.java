package pattern_Problems;

import java.util.Scanner;

public class Diamond_Star {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//number of rows
		
		for(int i=0;i<n;i++) {
			//spaces
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			//star1
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			
			//star2
//			for(int l=0;l<i;l++) {
//				System.out.print("*");
//			}
			
			System.out.println();
		}
//								i space		star1	star2
//		_ _ _ _ * _ _ _ _		0 	4		1		0
//		_ _ _ * * * _ _ _ 		1	3		2		1
//		_ _ * * * * * _ _		2	2		3		2
//		_ * * * * * * * _		3	1		4		3
//		* * * * * * * * * 		4	0		5		4
//				n=5					n-i-1	i+1		i					
		
	}

}
