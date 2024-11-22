package pattern_Problems;

public class Pattern11 {
	
//			i	star 
//*****		0	 5    	condition= i=0 OR i=4 for rows print whole row star 
//*   *  	1 	 1   			   j=0 OR j=4 for column print stars
//*   *		2	 1
//*   *		3	 1
//*****		4	 5
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {	
				if( i==n-1 || j==0 || i==0 || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
