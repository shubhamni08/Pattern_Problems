package pattern_Problems;

public class Pattern5 {

	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			//spaces
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
//*****
// ****
//  ***
//   **
//    *