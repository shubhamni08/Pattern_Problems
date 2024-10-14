package pattern_Problems;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 6;
		for(int i=0;i<n;i++) {
			//space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//* * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
